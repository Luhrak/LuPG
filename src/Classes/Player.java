package Classes;

import java.util.ArrayList;
import java.util.List;
import Abilities.Ability;
import Inventory.Item;
import NPC.Actor;
import StatusEffects.StatusEffect;

public abstract class Player implements Actor {

	public String name;
	public int level = 1;
	public int maxhealth;
	public int health;
	public Ability[] slots = new Ability[4];
	public List<Item> inventory = new ArrayList<>();
	public List<StatusEffect> playerEffects = new ArrayList<>();
	
	public Player(String name, int maxhealth) {
		this.name = name; 
		this.maxhealth = maxhealth; 
		health = maxhealth;
	}

	public abstract void attack(Actor actor);
	
	public void calcDamage(int damage) {
		health -= damage;
	}
	
}