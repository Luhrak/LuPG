package Classes;

import Abilities.Attack;

public class Warrior extends Player {

	public Warrior() {
		this.slots[0] = new Attack("Sword", 3);

		this.inventory.add(new Potion(10));
	}

}
