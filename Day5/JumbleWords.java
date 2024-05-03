/*
                         Jumble Words
 Two words are given. Jumble the words and make a new word. Jumble the word in a pattern and remember it. 

 Input :
  Two strings.
 Output :
  Print the jumble word.
*/
package Day5;
import java.util.Scanner;
public class JumbleWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Please enter first word");
        String s1, s2, jword = " ";
        int i;
        Scanner sc = new Scanner(System.in);
        s1 = sc.next();
        System.out.println("Please enter first word");
        s2 = sc.next();
        //Loop for jumbling the word
        for(i =0; i<s1.length() && i < s2.length(); i++)
        {
        	jword+=s1.charAt(i);
        	jword+=s2.charAt(i);
        }
        // Condition for attaching remaining leeters in a word
        if(s1.length() > s2.length())
        {
        	jword+=s1.substring(i);
        }
        else if(s2.length() > s1.length())
        {
        	jword+=s2.substring(i);
        }
        System.out.println("The jumble word is"+jword);
	}

}
