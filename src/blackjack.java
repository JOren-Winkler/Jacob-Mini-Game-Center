import java.util.Scanner;
public class blackjack {
    public static void playedBJ(){
        Scanner input = new Scanner(System.in);
        int card1 = pullCardValue();
        int card2 = pullCardValue();
        int result = card1 + card2;
        System.out.println("You have drawn card values " + card1 + " and " + card2 + ", totaling " + result);
        System.out.println("Would you like to hit or stand? (type a or b)");
        String hitStand = input.nextLine();
        System.out.println("You have played Blackjack.");
    }
    
    
    
    
    
    public static int pullCardValue() {
            return ((int)(Math.random()*(11) + 1));
        }
}



class card {
    
}

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Random;

// public class Blackjack {
//     public static void main(String[] args) {
//         // 1. Create a dynamic list to hold the card values
//         List<Integer> deck = new ArrayList<>();

//         // 2. Populate the deck with standard Blackjack values (2 through 11)
//         // Numbers 2 to 10
//         for (int i = 2; i <= 10; i++) {
//             deck.add(i);
//         }
//         // Face cards (Jack, Queen, King) are worth 10 points
//         deck.add(10); // Jack
//         deck.add(10); // Queen
//         deck.add(10); // King
        
//         // Ace can be 11 (or 1 depending on game logic)
//         deck.add(11); 

//         // 3. Randomly select one value from the list
//         Random rand = new Random();
        
//         // Get a random index from 0 up to the size of the list (exclusive)
//         int randomIndex = rand.nextInt(deck.size());
        
//         // Pull the card value at that random index
//         int drawnCard = deck.get(randomIndex);

//         // Print the result
//         System.out.println("The complete pool of values: " + deck);
//         System.out.println("Randomly selected card value: " + drawnCard);
//     }
// }