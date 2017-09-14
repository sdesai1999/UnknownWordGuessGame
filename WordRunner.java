
/**
 * Write a description of class WordRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordRunner
{
    private String word;
    
    public WordRunner (String tmpWord)
    {
        word = tmpWord;
    }
    
    public String getHint(String guess)
    {
        String hint = "";
        
        for (int i = 0; i < word.length(); i++)
        {
            if (i != word.length() - 1)
            {
                if ((word.substring(i,i+1)).equals(guess.substring(i,i+1)))
                {
                    hint += word.substring(i,i+1);
                }
                else if (word.indexOf(guess.substring(i,i+1)) > -1)
                {
                    hint += "+";
                }
                else
                {
                    hint += "*";
                }
            }
            else
            {
                if ((word.substring(i)).equals(guess.substring(i)))
                {
                    hint += word.substring(i);
                }
                else if (word.indexOf(guess.substring(i)) > -1)
                {
                    hint += "+";
                }
                else
                {
                    hint += "*";
                }
            }
        }
        
        return hint;
    }
    
    public int getLength()
    {
        return word.length();
    }    
}
