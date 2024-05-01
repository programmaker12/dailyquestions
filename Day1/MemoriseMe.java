/*
 *                 Minimum Occurrence
 *    Problem Statement -: 
 *    Arijit is a brilliant boy. He likes memory games. He likes to participate alone
 *    but this time he has to have a partner. So he chooses you.
 *    Inthis Game , your team will be shown N numbers for few minutes . You will
 *    have to memorize these numbers
 *      
 *    Now, the questioner will ask you Q queries, in each query He will give you a
 *    number , and you have to tell him the total number of occurrences of that
 *    number in the array of numbers shown to your team .
 *    If the number is not present , then you will have to say “NOT PRESENT”
 *    (without quotes).            
 *           
 *    Input Format:
 *    The first line of input will contain N, an integer, which is the total number of
 *    numbers shown to your team.
 *    The second line of input contains N space separated integers .
 *    The third line of input contains an integer Q , denoting the total number of
 *    integers.(testcases)
 *    The Next Q lines will contain an integer denoting an integer, (Bi) , for which you
 *    must print the number of occurrences of that number (Bi) in those N numbers on
 *    a new line.
 *    If the number (Bi) isn’t present, then Print “NOT PRESENT” (without quotes) on a
 *    new line.
 *    
 *    Constraints:
 *    Length of string <=10^6
 *    
 *    Sample output
 *    3
 */
package Day1;
import java.util.Scanner;
public class MemoriseMe {
	
	public static void main(String [] args)
	{ 
		int n, count = 0;
		Scanner sc = new Scanner(System.in);
		// Scanner for taking total number of numbers shown to the team
		n = sc.nextInt();
		// Array for storing the numbers
		int [] list = new int [n];
		for (int i = 0; i<n; i++)
		{
			list[i] = sc.nextInt();
		}
		// Printing the stored numbers
		for (int i = 0; i<n; i++)
		{
			System.out.print(list[i]+" ");
		}
		System.out.println();
		
		for (int j =0; j<n; j++)
		{
		System.out.println("Enter the number");
		int number = sc.nextInt();
		for (int i = 0; i<n; i++)
		{
			if (number == list[i])
			{
				count++;
			}
		}
		if(count == 0)
		{
			System.out.println("Not Present");
		}
		else
		{
			System.out.println("The number "+number+" is present "+count+" times ");
		}
		count =0;
		}
		
	}

}
