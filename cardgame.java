import java.util.Arrays;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
public class Cards {
	public static Scanner userScan;
	public static Random rand;
	public static boolean played7;
	public static ArrayList<String> hand1;
	public static ArrayList<String> hand2;
	public static ArrayList<String> hand3;
	public static List<String> hand;
	public static ArrayList<String> playerHand;
	public static void main(String[] args) {
		userScan = new Scanner(System.in);
		rand = new Random();
		String[] suits = {
				"Hearts", "Clubs", "Diamonds", "Spades"
		};
		String[] values = {
			"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
			"Jack", "Queen", "King"
		};

		//create the deck
		int x = suits.length * values.length;
		String [] deck_52 = new String[x];
		for (int i = 0; i < values.length; i++) {
			for (int j =0; j< suits.length; j++) {
				deck_52[suits.length*i + j] = values[i] + "of" + suits[j] + " ";
			}
		}

		//print the array, 4 cards per line, one suit per column
		for (int k =0; k <52; k+= 4) {
		String line = deck_52[0 + k] + deck_52[1 + k] + deck_52[2 + k] + deck_52[3 +k];
		System.out.println(line);
		}

		//Use the original deck to create the draw deck (ArrayList)
		List<String> draw_deck = new ArrayList<String>(Arrays.asList(deck_52));

		//Ask the user what they would like to do
		System.out.println("Please type shuffle to shuffle, enter hand"
				+ " to recive one of four hands");
		String ui = userScan.nextLine();
		if(ui.equals("shuffle")) {
			Collections.shuffle(draw_deck);
			System.out.println("Please type hand to recieve one of four hands");
			ui = userScan.nextLine();
		}
		if(ui.equals("hand")) {
			int rand_int = rand.nextInt(4);
			if (rand_int == 0) {
				//The first hand would be the top 5 cards of the draw deck
				hand = draw_deck.subList(0,6);
				System.out.println(hand);
			}
			if (rand_int == 1) {
				//This hand is the next 5 cards
				hand = draw_deck.subList(6,11);
				System.out.println(hand);
			}
			if (rand_int == 2) {
				//This hand is the next 5 cards
				hand = draw_deck.subList(11,16);
				System.out.println(hand);
			}
			if (rand_int == 3) {
				//This hand is the next 5 cards
				hand = draw_deck.subList(16,21);
				System.out.println(hand);
			}
		}
		//if 7 is played, swap hand with player of choice
		if (played7 = true) {
			System.out.println("You get to swap hands with another player, enter 1, 2, or 3.:");
			String ui_swap = userScan.nextLine();
			playerHand = new ArrayList<String>();
			hand1 = new ArrayList<String>();
			hand2 = new ArrayList<String>();
			hand3 = new ArrayList<String>();
			if(ui_swap.equals("1")) {
				//user has decided to swap with opponent one
				ArrayList<String> temp_hand = playerHand;
				playerHand.clear();
				playerHand.addAll(hand1);
				hand1.clear();
				hand1.addAll(temp_hand);
				System.out.println(playerHand);
			}
			else if(ui_swap.equals("2")) {
				//user has decided to swap with opponent two
				ArrayList<String> temp_hand = playerHand;
				playerHand.clear();
				playerHand.addAll(hand2);
				hand2.clear();
				hand2.addAll(temp_hand);
			}
			else if(ui_swap.equals("3")) {
				//user has decided to swap with opponent three
				ArrayList<String> temp_hand = playerHand;
				playerHand.clear();
				playerHand.addAll(hand3);
				hand3.clear();
				hand3.addAll(temp_hand);
			}
		}
	}
}

--------------------------------------------------------
The first code appears to only save one hand of the deck. The second code is messed up with errors involving types (lists and arrays) but I tried to assign all four hands with a variable to try to help with the swap statements. 
import java.util.Arrays;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
public class Cards {
	public static Scanner userScan;
	public static Random rand;
	public static boolean played7;
	public static List<String> hand1;
	public static List<String> hand2;
	public static List<String> hand3;
	public static List<String> hand;
	public static List<String> playerHand;
	public static void main(String[] args) {
		userScan = new Scanner(System.in);
		rand = new Random();
		String[] suits = {
				"Hearts", "Clubs", "Diamonds", "Spades"
		};
		String[] values = {
			"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
			"Jack", "Queen", "King"
		};

		//create the deck
		int x = suits.length * values.length;
		String [] deck_52 = new String[x];
		for (int i = 0; i < values.length; i++) {
			for (int j =0; j< suits.length; j++) {
				deck_52[suits.length*i + j] = values[i] + "of" + suits[j] + " ";
			}
		}

		//print the array, 4 cards per line, one suit per column
		for (int k =0; k <52; k+= 4) {
		String line = deck_52[0 + k] + deck_52[1 + k] + deck_52[2 + k] + deck_52[3 +k];
		System.out.println(line);
		}

		//Use the original deck to create the draw deck (ArrayList)
		List<String> draw_deck = new ArrayList<String>(Arrays.asList(deck_52));

		//Ask the user what they would like to do
		System.out.println("Please type shuffle to shuffle, enter hand"
				+ " to recive one of four hands");
		String ui = userScan.nextLine();
		if(ui.equals("shuffle")) {
			Collections.shuffle(draw_deck);
			System.out.println("Please type hand to recieve one of four hands");
			ui = userScan.nextLine();
		}
		if(ui.equals("hand")) {
			int rand_int = rand.nextInt(4);
			if (rand_int == 0) {
				//The first hand would be the top 5 cards of the draw deck
				playerHand = draw_deck.subList(0,6);
				System.out.println(playerHand);
				hand1 = draw_deck.subList(6,11);
				hand2 = draw_deck.subList(11,16);
				hand3 = draw_deck.subList(16,21);
			}
			if (rand_int == 1) {
				//This hand is the next 5 cards
				playerHand = draw_deck.subList(6,11);
				System.out.println(playerHand);
				hand1 = draw_deck.subList(0,6);
				hand2 = draw_deck.subList(11,16);
				hand3 = draw_deck.subList(16,21);
			}
			if (rand_int == 2) {
				//This hand is the next 5 cards
				playerHand = draw_deck.subList(11,16);
				System.out.println(playerHand);
				hand1 = draw_deck.subList(0,6);
				hand2 = draw_deck.subList(6,11);
				hand3 = draw_deck.subList(16,21);
			}
			if (rand_int == 3) {
				//This hand is the next 5 cards
				playerHand = draw_deck.subList(16,21);
				System.out.println(playerHand);
				hand1 = draw_deck.subList(0,6);
				hand2 = draw_deck.subList(6,11);
				hand3 = draw_deck.subList(11,16);
			}
		}
		//if 7 is played, swap hand with player of choice
		if (played7 = true) {
			System.out.println("You get to swap hands with another player, enter 1, 2, or 3.:");
			String ui_swap = userScan.nextLine();
			//playerHand = new List<String>();
			//hand1 = new ArrayList<String>();
			//hand2 = new ArrayList<String>();
			//hand3 = new ArrayList<String>();
			if(ui_swap.equals("1")) {
				//user has decided to swap with opponent one
				List<String> temp_hand = playerHand;
				playerHand.clear();
				playerHand.addAll(hand1);
				hand1.clear();
				hand1.addAll(temp_hand);
				System.out.println(playerHand);
			}
			else if(ui_swap.equals("2")) {
				//user has decided to swap with opponent two
				List<String> temp_hand = playerHand;
				playerHand.clear();
				playerHand.addAll(hand2);
				hand2.clear();
				hand2.addAll(temp_hand);
			}
			else if(ui_swap.equals("3")) {
				//user has decided to swap with opponent three
				List<String> temp_hand = playerHand;
				playerHand.clear();
				playerHand.addAll(hand3);
				hand3.clear();
				hand3.addAll(temp_hand);
			}
		}
	}
}

