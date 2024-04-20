package Classes;

import java.util.ArrayList;
import java.util.List;
import Abilities.Ability;
import Inventory.Item;

public abstract class Player {

	public String name;
	public int level;
	public Ability[] slots = new Ability[4];
	public List<Item> inventory = new ArrayList<>();

}