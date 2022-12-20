package de.uniks.pmws2223.service;

import de.uniks.pmws2223.model.Ability;
import de.uniks.pmws2223.model.Monster;
import de.uniks.pmws2223.model.Player;
import de.uniks.pmws2223.model.Type;

public class BattleService
{

	public void attack(Monster attacker, Ability ability, Monster defender)
	{
		final double abilityMultiplier = getAbilityMultiplier(ability.getType(), defender.getType());
		final int damage = (int) (ability.getAtk() * abilityMultiplier);

		if (defender.getHp() > damage)
		{
			defender.setHp(defender.getHp() - damage);
			return;
		}

		defender.setHp(0);
		defender.setEncounter(null);

		final Player currentPlayer = defender.getCurrentPlayer();
		if (currentPlayer != null)
		{
			selectNextMonster(currentPlayer);
		}

		gainExp(attacker, defender.getLvl() * 2);
	}

	public void selectNextMonster(Player player)
	{
		for (final Monster monster : player.getMonsters())
		{
			if (monster.getHp() > 0)
			{
				player.setCurrentMonster(monster);
				return;
			}
		}
		player.setCurrentMonster(null);
	}

	public void healAll(Player player)
	{
		for (final Monster monster : player.getMonsters())
		{
			monster.setHp(monster.getMaxHp());
		}
	}

	public void gainExp(Monster monster, int exp)
	{
		monster.setExp(monster.getExp() + exp);

		final int nextLevelExp = 10 + 10 * monster.getLvl();
		if (monster.getExp() >= nextLevelExp)
		{
			levelup(monster);
			monster.setExp(monster.getExp() - nextLevelExp);
		}
	}

	public void levelup(Monster monster)
	{
		monster.setLvl(monster.getLvl() + 1);
		monster.setMaxHp(monster.getMaxHp() + 5 + (int) (0.5 * monster.getLvl()));
	}

	public double getAbilityMultiplier(Type abilityType, Type monsterType)
	{
		if (abilityType.getStrongAgainst().contains(monsterType))
		{
			return 1.25;
		}
		if (abilityType.getWeakAgainst().contains(monsterType))
		{
			return 0.75;
		}
		return 1;
	}
}
