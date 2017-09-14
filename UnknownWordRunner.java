import java.util.Scanner;

/**
 * Write a description of class StringGameRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UnknownWordRunner
{
    public static void main( String[] args )
    {
        System.out.print("\f");

        WordRunner puzzle = new WordRunner("HARPS");
        Scanner myScan = new Scanner(System.in);

        System.out.print("Guess the unknown " + puzzle.getLength() + " letter word or enter \"QUIT\" to quit: ");
        String word = myScan.nextLine();
        while( !word.equals("QUIT") )
        {
            String hint = puzzle.getHint(word);
            if( hint.indexOf("*") < 0 && hint.indexOf("+") < 0 )
            {
                System.out.println("Nice job!  You guessed the word!");
                word = "QUIT";
            }
            else 
            {
                System.out.println("Hint: " + hint);
                System.out.print("Guess the hidden word or enter QUIT to quit: ");
                word = myScan.nextLine();
                if (word.equals("QUIT"))
                {
                    System.out.println("You mad bruh?");
                }
            }
        }
    }
}
