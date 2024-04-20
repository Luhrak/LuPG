package NPC;

import java.util.ArrayList;
import java.util.List;
import Abilities.Ability;
import Classes.Player;
import Inventory.Item;

public abstract class Enemy {
	
	public String name;
	public int maxhealth;
	public int health;
	public Ability[] slots = new Ability[4];
	public List<Item> inventory = new ArrayList<>();
	
	public Enemy(String name, int maxhealth) {
		this.name = name; 
		this.maxhealth = maxhealth; 
		health = maxhealth;
	}

	public abstract void attack(Player player);
}
