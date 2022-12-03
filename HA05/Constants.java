package de.uniks.pmws2223;

import de.uniks.pmws2223.model.Ability;
import de.uniks.pmws2223.model.Type;

public class Constants
{
	public static final Type NORMAL = new Type().setName("Normal");
	public static final Type FIRE = new Type().setName("Fire");
	public static final Type WATER = new Type().setName("Water");
	public static final Type ICE = new Type().setName("Ice");
	public static final Type EARTH = new Type().setName("Earth");
	public static final Type PLANT = new Type().setName("Plant");

	static
	{
		FIRE.withStrongAgainst(ICE, PLANT);
		WATER.withStrongAgainst(FIRE, EARTH);
		ICE.withStrongAgainst(WATER, PLANT);
		EARTH.withStrongAgainst(ICE, FIRE);
		PLANT.withStrongAgainst(WATER, EARTH);
	}

	public static final Ability TACKLE = new Ability().setName("Tackle").setLvl(1).setAtk(5).setType(NORMAL);
	public static final Ability SCRATCH = new Ability().setName("Scratch").setLvl(1).setAtk(5).setType(NORMAL);
	public static final Ability FIREBALL = new Ability().setName("Fireball").setLvl(1).setAtk(10).setType(FIRE);
	public static final Ability WATERGUN = new Ability().setName("Watergun").setLvl(1).setAtk(10).setType(WATER);
	public static final Ability ICEBOLT = new Ability().setName("Icebolt").setLvl(1).setAtk(10).setType(ICE);
	public static final Ability EARTHQUAKE = new Ability().setName("Earthquake").setLvl(1).setAtk(10).setType(EARTH);
	public static final Ability SOLARBEAM = new Ability().setName("Solarbeam").setLvl(1).setAtk(10).setType(PLANT);
}
