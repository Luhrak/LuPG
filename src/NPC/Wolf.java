package NPC;

import Abilities.Attack;
import Classes.Player;

public class Wolf extends Enemy {

	public Wolf() {
		super("Wolf", 10);
		
		this.slots[0] = new Attack("Bite", 2);
	}

	@Override
	public void attack(Player player) {
		this.slots[0].use(player);
		
	}

}
