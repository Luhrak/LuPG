package Main;

import java.util.Scanner;
import Classes.*;
import NPC.*;

public class Main {

	public static void main(String[] args) {

		Player player;
		
		System.out.println("Welcome hero. Whats your name?");
		String pName = userInput();
		
		while (true) {
			System.out.println("Whats you class? (Warrior, ...)");

			switch (userInput().toLowerCase()) {

			case "w":
			case "warrior":
				player = new Warrior(pName);
				break;

			default:
				System.err.println("Error: unknown class");
				continue;
			}
			break;
		}
		
		System.out.println(player.slots[0]);
		System.out.println(player.inventory.get(0).toString());
		
		Enemy wolf1 = new Wolf();
		System.out.println(wolf1.health);
		
		wolf1.attack(player);
		System.out.println(player.health);


	}

	private static String userInput() {

		Scanner in = new Scanner(System.in);

		return in.next().strip();
	}

}
