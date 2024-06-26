package Abilities;

import NPC.Actor;

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
	public void use(Actor actor) {
		actor.calcDamage(this.damage);
		
	}
	
}
