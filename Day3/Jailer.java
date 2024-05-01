/*
 *                   Prisoners	vs	Jailer!			
 *  A jail	has	a number of	prisoners and a	number of treats	
 *  to pass out	to them. Their	jailer	decides	the	fairest	way	to	divide	the	treats is to seat the prisoners	
 *   around a circular table	in	sequentially numbered chairs. A	chair number will be drawn from a hat.	
 *   Beginning with	the	prisoner in	that chair,	one	candy will be handed to	each prisoner sequentially	around	the	table	
 *   until all have	been	distributed. The	jailer	is	playing	a	little	joke,	though.	The	last	piece	of	candy	looks	like	all	the	
 *   others,	but	it	tastes	awful. Determine	the	chair	number	occupied	by	the	prisoner	who	will	receive	that	
 *   candy.				                 
 *   
 *   Input	Format	
 *  The	first line contains	an	integer, t,	denoting the number	of test cases.	
 *  The	next t lines each contain 3	space-separated	integers:- n : the	number	of	prisoners m	: the number of	sweets, s :	the	chair number to	start passing out treats at	
 *  
 *  Output Format	
 *  For	each test case,	print the chair	number of the prisoner who	receives the awful	
 *  treat on	a new line.	
 *                   
 *                   
 */
package Day3;
import java.util.Iterator;
import java.util.Scanner;
public class Jailer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Declaring variables
		int t, i = 1, n, m, s;
		/*
		 * t -> number of test cases
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		//Entering the number of test cases
		t = sc.nextInt();
		
		for (int j = 0; j < t; j++) {
			//Entering the number of prisoners, number of sweets and the position of staring prisoner
			System.out.println("Enter the number of prisoners");
			n = sc.nextInt();
			System.out.println("Enter the number of sweets");
			m = sc.nextInt();
			System.out.println("Enter the starting position");
			s = sc.nextInt();
			
			// Finding the unlucky prisoner who will get the awful candy.
			for (int j2 = 0; j2 < m; j2++) {
				if (j2 == 0) 
				{
					i = 0; 
				}
				else
				{
					i = 1;
				}
				if(s<=n)   
				{
					s = s+i; 
				}
				if(s>n)
				{
					s = 1;
				}
			}
			
			System.out.println("The prisoner number " + s + " will get awfulcandy");
			
		}
	}

}
