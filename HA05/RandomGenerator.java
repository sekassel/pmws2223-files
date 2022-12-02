package de.uniks.pmws2223.pmon.service;

import de.uniks.pmws2223.pmon.model.Encounter;
import de.uniks.pmws2223.pmon.model.Monster;
import de.uniks.pmws2223.pmon.model.Player;

import static de.uniks.pmws2223.pmon.Constants.*;

public class RandomGenerator
{
	public Player createPlayer(String name)
	{
		// create a player with the given name
		Player player = new Player().setName(name);

		// create three monsters of different Name, type, hp/maxHp and abilities
		// - the level of all monsters must be 1 with 0 exp
		// - set hp and maxHp to the same value
		// link the monsters to the player
		// - set the first monster as the current monster
		new Monster()
			.setName("Leafy")
			.setLvl(1)
			.setExp(0)
			.setHp(11)
			.setMaxHp(11)
			.setType(PLANT)
			.withAbilities(TACKLE, SOLARBEAM)
			.setPlayer(player)
			.setCurrentPlayer(player);
		new Monster()
			.setName("Flameo")
			.setLvl(1)
			.setExp(0)
			.setHp(12)
			.setMaxHp(12)
			.setType(FIRE)
			.withAbilities(SCRATCH, FIREBALL)
			.setPlayer(player);
		new Monster()
			.setName("Liquido")
			.setLvl(1)
			.setExp(0)
			.setHp(10)
			.setMaxHp(10)
			.setType(WATER)
			.withAbilities(TACKLE, WATERGUN)
			.setPlayer(player);

		return player;
	}

	public Encounter createEncounter(Player player)
	{
		// create an encounter with the given player
		Encounter encounter = new Encounter().setPlayer(player);

		// create three monsters of different Name, type, hp/maxHp and abilities
		// - the level of all monsters must be 1 with 0 exp
		// - set hp and maxHp to the same value
		// link the monsters to the encounter
		new Monster()
			.setName("Imp")
			.setType(FIRE)
			.setLvl(1)
			.setHp(10)
			.setMaxHp(10)
			.withAbilities(TACKLE, FIREBALL)
			.setEncounter(encounter);
		new Monster()
			.setName("Shark")
			.setType(WATER)
			.setLvl(1)
			.setHp(12)
			.setMaxHp(12)
			.withAbilities(TACKLE, WATERGUN)
			.setEncounter(encounter);
		new Monster()
			.setName("Yeti")
			.setType(ICE)
			.setLvl(1)
			.setHp(14)
			.setMaxHp(14)
			.withAbilities(SCRATCH, ICEBOLT)
			.setEncounter(encounter);
		// More options:
		//		new Monster()
		//			.setName("Golem")
		//			.setType(EARTH)
		//			.setLvl(1)
		//			.setHp(16)
		//			.setMaxHp(16)
		//			.withAbilities(SCRATCH, EARTHQUAKE)
		//			.setEncounter(encounter);
		//		new Monster()
		//			.setName("Ent")
		//			.setType(PLANT)
		//			.setLvl(1)
		//			.setHp(18)
		//			.setMaxHp(18)
		//			.withAbilities(SCRATCH, SOLARBEAM)
		//			.setEncounter(encounter);

		return encounter;
	}
}
