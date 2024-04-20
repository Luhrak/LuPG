package Abilities;

import Classes.Player;

public class Attack extends Ability {

	public String name;
	public int damage; 
	
	public Attack (String attackName, int damage) {
		this.name = attackName; 
		this.damage = damage; 
	}
	
	public String toString() {
		return name + " (" + damage + ")";
	}

	@Override
	public void use(Player player) {
		player.calcDamage(this.damage);
		
	}
	
}
