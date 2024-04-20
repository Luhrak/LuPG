package Inventory;

public class Potion extends Item {

	int healing = 10;
	
	public Potion(String name, int value) {
		super(name, value);
	}
	
	public Potion(int value) {
		super("Potion", value);
	}
}
