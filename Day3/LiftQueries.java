/*
 *                   LIFT QUERIES
 * 
 * 
 *   There are 7 floors in APARTMENT
 *    BUILDING and only 2 lifts.
 *    
 *    Initially Lift A is at the ground floor
 *    and Lift B at the top floor.
 *    
 *    Whenever someone calls the lift
 *    from N th floor, the lift closest to that
 *    floor comes to pick him up.
 *    
 *     If both the lifts are at equidistant from
 *     the N th floor, then the lift from the
 *     lower floor comes up.
 *     
 *     
 *     INPUT AND OUTPUT
 *                      INPUT
 *      First line contains a integer T denoting the number of test cases.
 *      Next T lines contains a single integer N denoting the floor from which lift is 
 *      called. 
 *      
 *                    OUTPUT
 *      Output T lines containing one character "A" if the first lift goes to N th floor or 
 *      "B" for the second lift.
 *                    
 */
package Day3;
import java.util.Scanner;
import java.lang.Math;
public class LiftQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n, a;
     /*
      * n -> number of test cases
      */
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number of test cases");
     n = sc.nextInt();
  
     System.out.println("Enter the floor number");
     
     //Finding which lift is nearest to the floor
     for(int i=0; i<n; i++)
     {
    	a = sc.nextInt();
        if(Math.abs(0-a)<=Math.abs(a-7))
        {
        	System.out.println("A");
        }
        else
        {
        	System.out.println("B");
        }
     }
	}

}
