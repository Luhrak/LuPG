package Inventory;

public abstract class Item {

	public String name;
	String descr = "";
	int value;

	public Item(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public String toString() {
		return name + " (" + value + "g)\n" + descr;
	}

}
