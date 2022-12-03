package de.uniks.pmws2223.model;

import org.fulib.builder.ClassModelDecorator;
import org.fulib.builder.ClassModelManager;
import org.fulib.builder.reflect.Link;

import java.util.List;

@SuppressWarnings("unused")
public class GenModel implements ClassModelDecorator
{
	class Player
	{
		String name;

		@Link("currentPlayer")
		Monster currentMonster;

		@Link("player")
		List<Monster> monsters;

		@Link("player")
		Encounter encounter;
	}

	class Monster
	{
		String name;
		int lvl;
		int exp;
		int hp;
		int maxHp;

		@Link
		Type type;

		@Link
		List<Ability> abilities;

		@Link("monsters")
		Player player;

		@Link("currentMonster")
		Player currentPlayer;

		@Link("monsters")
		Encounter encounter;
	}

	class Ability
	{
		String name;
		int lvl;
		int atk;
		@Link("abilities")
		Type type;
	}

	class Type
	{
		String name;

		@Link("type")
		List<Ability> abilities;

		@Link("weakAgainst")
		List<Type> strongAgainst;

		@Link("strongAgainst")
		List<Type> weakAgainst;
	}

	class Encounter
	{
		@Link("encounter")
		Player player;

		@Link("encounter")
		List<Monster> monsters;
	}

	@Override
	public void decorate(ClassModelManager m)
	{
		m.getClassModel().setDefaultPropertyStyle(org.fulib.builder.Type.POJO);
		m.haveNestedClasses(GenModel.class);
	}
}
