import java.util.Scanner;

public class wheelOfFortune { 
    public static void playedWOF(){
        Scanner guess = new Scanner(System.in);
        String secretWord = "computer science"; 
        System.out.println("\n\nYour secret word looks like this: \n" + replace_Secret_Word_With_Underscores(secretWord));
        String currentWord = "";
        int j = 0;
        while (!currentWord.equals(secretWord)){    
            System.out.println("Make a guess for a letter in the word ");
            String letterGuess = guess.nextLine();
            if (j == 0){
            currentWord = evaluateFirstGuess(secretWord, letterGuess);
            System.out.println("You may or may not have guessed a letter. The word you now have is "+ currentWord);
            }
            else {
            currentWord = evaluateCurrentGuess(secretWord, currentWord, letterGuess);
            System.out.println("You may or may not have guessed a letter. The word you now have is "+ currentWord);
            }
            j++;
        }
        System.out.println("You guessed the word!");
        System.out.println("You have played Wheel of Fortune.");
    }


    public static void spinDaWheel(){
        System.out.println("Wheel spun.");
    }

    public static String evaluateFirstGuess(String secret, String letter){
        String updatedSecretWord= "";
        for (int i=0; i<secret.length();i++){
            if (secret.substring(i,i+1).equals(letter)){
                updatedSecretWord+=letter;
            }
            else {
                if ((secret.substring(i,i+1)).equals(" ")){
                updatedSecretWord+=(" ");
                }
                else {
                updatedSecretWord+=("_");
                }
            }
        }
        return updatedSecretWord;
    }

    public static String evaluateCurrentGuess(String secret, String current, String letter) {
        // AI assisted method bug fix
        String updatedSecretWord= "";
        for (int i=0; i<secret.length();i++){
            String secretCharacter = secret.substring(i,i+1);
            String currentCharacter = current.substring(i,i+1);

            if (secretCharacter.equals(letter)){
                updatedSecretWord += secretCharacter;
            }
            else {
                updatedSecretWord += currentCharacter;
            }
        }
        return updatedSecretWord;
    }


    public static String replace_Secret_Word_With_Underscores(String secret){
        String underscoreWord = "";
        for (int i = 0; i<secret.length(); i++){
            if ((secret.substring(i,i+1)).equals(" ")){
                underscoreWord+=(" ");
            }
            else {
                underscoreWord+=("_");
            }
        }
        return underscoreWord;
    }

}
