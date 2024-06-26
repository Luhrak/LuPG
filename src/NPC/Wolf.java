package NPC;

import Abilities.Attack;

public class Wolf extends Enemy {

	public Wolf() {
		super("Wolf", 10);
		
		this.slots[0] = new Attack("Bite", 2);
	}

	@Override
	public void attack(Actor actor) {
		this.slots[0].use(actor);
		
	}

}
