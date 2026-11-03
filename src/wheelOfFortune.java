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
            currentWord = evaluateGuess(secretWord, letterGuess);
        System.out.println("You may or may not have guessed a letter. The word you now have is "+ currentWord);
        }
        else {
            currentWord = evaluateGuess(currentWord, letterGuess);
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

    public static String evaluateGuess(String text, String letter){
        String updatedSecretWord= "";
        for (int i=0; i<text.length();i++){
            if (text.substring(i,i+1).equals(letter)){
                updatedSecretWord+=letter;
            }
            else {
                if ((text.substring(i,i+1)).equals(" ")){
                updatedSecretWord+=(" ");
                }
                else if ((text.substring(i,i+1)).equals("_")) {
                updatedSecretWord+=("_");
                }
                else {
                    updatedSecretWord+=text.substring(i,i+1);
                }
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
