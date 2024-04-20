package Classes;

import Abilities.Attack;
import Inventory.Potion;

public class Warrior extends Player {

	public Warrior(String name) {
		super(name, 12);
		
		this.slots[0] = new Attack("Sword", 3);
		this.inventory.add(new Potion(10));
	}

}
