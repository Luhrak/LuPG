package Classes;

import Abilities.Attack;
import Abilities.Block;
import Inventory.Potion;
import NPC.Actor;

public class Warrior extends Player {

	public Warrior(String name) {
		super(name, 12);
		
		this.slots[0] = new Attack("Swing Sword", 3);
		this.slots[1] = new Block("Raise Shield", 1);
		this.inventory.add(new Potion(10));
	}

	@Override
	public void attack(Actor actor) {
		this.slots[0].use(actor);
	}

	
	
}
