package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author begolli
 * @author Diar Begolli Feb 2, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Random random = new Random();
        Card[] hand = new Card[7];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            int TOTALVALUES = 13;
            int TOTALSUITS = 4;
            card.setValue(random.nextInt(TOTALVALUES) + 1);
            card.setSuit(Card.SUITS[random.nextInt(TOTALSUITS)]);
            hand[i] = card;
        }

        Card userCard = new Card();
        System.out.println("Enter Card value: 1 to 10, 11 for jack, 12 for queen, 13 for king");
        userCard.setValue(scanner.nextInt());
        System.out.println("Enter Card suit: 1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Clubs");
        userCard.setSuit(Card.SUITS[scanner.nextInt() - 1]);
        for (int i = 0; i < hand.length; i++) {
            Card card = hand[i];
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                printInfo();
            }
        }     
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Diar Begolli Feb 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Diar");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Become a software engineer - start a startup");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Swimming");
        System.out.println("-- Skiing");
        System.out.println("-- Tennis");

        System.out.println();
        
    
    }

}
