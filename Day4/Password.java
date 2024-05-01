/*
 *                      Mr. Robot’s Password
 *                      
 *                      
 * Problem Statement:
 Mr. Robot is making a website, in which there is a tab to create a password. As other 
websites, there are rules so that the password gets complex and none can predict 
the password for another.
 So he gave some rules like:
 • At least one numeric digit
 • At Least one Small/Lowercase Letter
 • At Least one Capital/Uppercase Letter
 • Must not have space
 • Must not have slash (/)
 • At least 6 characters
 If someone inputs an invalid password, the code prints: “Invalid password, try again”.
 Otherwise, it prints: “password valid”.
 
 
  Input Format:
 A line with a given string as a password
 
 Output Format:
 •If someone inputs an invalid password, the code prints: “Invalid 
password, try again”.
 •Otherwise, it prints: “password valid”, without the quotation marks.
 
 Constraints:
 •Number of character in the given string <=10^9
 */
package Day4;
import java.util.Scanner;
import java.util.regex.*;
public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Declaring variable
		String password, pattern;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your password");
		 password = sc.next();
		 pattern = "[a-zA-Z]+[0-9]+\\S[^\\/]";
		 if(Pattern.matches(pattern, password) == true)
		 {
			 System.out.println("Password valid");
		 }
		 else
		 {
			 System.out.println("Password Invalid");
		 }
	}

}
