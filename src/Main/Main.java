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
		
//		System.out.println(player.slots[0]);
//		System.out.println(player.inventory.get(0).toString());
		System.out.println("Player health: " + player.health);
		
		Enemy wolf1 = new Wolf();
		System.out.println("Wolf health: " + wolf1.health);
		
		wolf1.attack(player);
		player.attack(wolf1);
		System.out.println("Player health after attack: " + player.health);
		System.out.println("Wolf health after attack: " + wolf1.health);


	}

	private static String userInput() {

		Scanner in = new Scanner(System.in);

		return in.next().strip();
	}

}
