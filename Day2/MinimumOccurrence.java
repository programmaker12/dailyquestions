/*
 *                 Minimum Occurrence
 *    Problem Statement -: 
 *    Given a string , 
 *    return the character that appears the minimum number of 
 *    times in the string. 
 *    The string will contain only ascii characters, from the ranges 
 *    (“a”-”z”,”A”-”Z”,0-9), and case matters. 
 *    If there is a tie in the minimum number of times a character 
 *    appears in the string return the character that appears first in 
 *    the string.  
 *    
 *                
 *                
 *    INPUT AND OUTPUT
 *    
 *    
 *    Input Format:
 *    Single line with no space 
 *    denoting the input string.
 *    
 *    Output Format:
 *    Single character denoting the 
 *    least frequent character.
 *    
 *    Constraints:
 *    Length of string <=10^6
 *    
 *    Sample output
 *    3
 */
package Day2;
import java.util.*;
public class MinimumOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a ;
		int min = 20;
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		String c = sc.next();
		
		for (int i = 0; i < c.length(); i++) {
			a = c.charAt(i);
			mp.put(a, mp.getOrDefault(a, 0)+1);
			}
		System.out.println(mp);
		char ans = 0;
		for (int i = 0; i < c.length(); i++) {
			a = c.charAt(i);
			if(mp.get(a) < min)
			{
				min = mp.get(a);
				ans = a;
			}
		}
		System.out.println(min);
		System.out.println(ans);

	}

}
