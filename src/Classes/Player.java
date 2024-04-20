package Classes;

import java.util.ArrayList;
import java.util.List;
import Abilities.Ability;
import Inventory.Item;

public abstract class Player {

	public String name;
	public int level = 1;
	public int maxhealth;
	public int health;
	public Ability[] slots = new Ability[4];
	public List<Item> inventory = new ArrayList<>();
	
	public Player(String name, int maxhealth) {
		this.name = name; 
		this.maxhealth = maxhealth; 
		health = maxhealth;
	}

	public void calcDamage(int damage) {
		health -= damage;
	}

}