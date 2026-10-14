import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        System.out.println("Hello!");
        System.out.println("Welcome to the game center!");
        int gameChoice;
        int x = 2;
        while (x==2){
            System.out.println("Which game? Type '1' for Blackjack, '2' for Wheel of Fortune, or '3' to exit.");
            gameChoice = input.nextInt();
            if (gameChoice >= 1 && gameChoice <= 3){
                if (gameChoice == 1){
                    blackjack.playedBJ();
                }
                else if (gameChoice == 2){
                    wheel_of_fortune.playedWOF();
                }
                else {
                    System.out.println ("Goodbye!");
                    break;
                }
            }
            else {
                System.out.println("Please enter a valid input");
            }
            }
        }
    }


// ☐  In main, print a menu with numbered options.
// ☐  Read the user's choice with Scanner.
// ☐  Use selection (from your warm-up, pick the version that fits your menu) so each choice calls the right placeholder method.
// ☐  Add an exit option that prints a goodbye message.
// ☐  Handle unexpected input with a clear message so nobody is left guessing.
