package Main;

import java.util.Scanner;
import Classes.*;

public class Main {

	public static void main(String[] args) {

		Player player;
		
		System.out.println("Welcome hero. Whats your name?");
		String pName = userInput();
		
		while (true) {
			System.out.println("Whats you class? (Warrior, ...)");

			switch (userInput().toLowerCase()) {

			case "warrior":
				player = new Warrior();
				break;

			default:
				System.err.println("Error: unknown class");
				continue;
			}
			break;
		}

		player.name = pName;
		
		System.out.println(player.slots[0]);
		System.out.println(player.inventory.get(0).toString());
		

	}

	private static String userInput() {

		Scanner in = new Scanner(System.in);

		return in.next().strip();
	}

}
