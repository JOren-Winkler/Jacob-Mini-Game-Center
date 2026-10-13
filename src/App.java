import java.util.scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        System.out.println("Hello!");
        System.out.println("Welcome to the game center!");
        int x = 2;
        while (x=2){
            System.out.println("Which game? BJ or WOF? ('1' or '2'. Or '3' to exit.)");
            gameChoice = input.nextInt();
            if (gameChoice == 1){
                blackjack.playedBJ();
            }
            else if (gameChoice == 1){
                wheel_of_fortune.playedWOF();
            }
            else if (gameChoice == 3){
                System.out.println ("Goodbye!");
                break;
            }
        }
    }
}

// ☐  In main, print a menu with numbered options.
// ☐  Read the user's choice with Scanner.
// ☐  Use selection (from your warm-up, pick the version that fits your menu) so each choice calls the right placeholder method.
// ☐  Add an exit option that prints a goodbye message.
// ☐  Handle unexpected input with a clear message so nobody is left guessing.
