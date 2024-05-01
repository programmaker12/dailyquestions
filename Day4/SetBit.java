/*
 *                   Set Bit calculator 
 *                   
 *                   
 *  Angela plays with the different bits. She was given a bunch of 
 *  numbers and she needs to find how many set bits are there in total. 
 *  Help Angela to impress her, write a code to do so.
 *
 * Input Format:
 * •First line with n, an integer
 * •Next n lines denoting n integers angela is given.
 * *Output Format:
 * •Total number of set bits
 *
 * Constraints:
 * •Number of elements or number <=10^7
 * •numbers<=10000
 */
package Day4;
import java.util.Scanner;
public class SetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring variable
		int n, i, k, m, count = 0;
		/*
		 * n->number of integers
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of integers");
           n = sc.nextInt();
           System.out.println("Please enter the numbers");
           for(i = 0; i<n; i++)
           {
        	   
        	   k = sc.nextInt();
        	   
        	   
        	   while(k/2 != 0) //      5   1 0 1
        	   {
        		   if(k%2 == 1) //     7   1 1 1 
        		   {
        			   count++; // 
        		   }
        		   k = k/2; // 
        	   }
        	   if (k == 1)
        	   {
        		   count++;
        	   }
        	   }
//        	   if(k%2 == 1)
//        	   {
//        		   count++;
//        	   }
//        	   m =k/2;
//        	   if(k%m == 1)
//        	   {
//        		   count++;
//        	   }
           
           System.out.println("There are "+count+" bits"); //
	}

}
