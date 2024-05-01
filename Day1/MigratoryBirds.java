/*
 *                 Migratory Birds
 *    Problem Statement -: 
 *    You	have been	asked	to help	study	the	population of	birds	migrating	across the continent.	
 *    You	have	been	asked	to	help	study	the	population	of	birds	migrating	across	the	
 *     continent.	
 *    Each	type	of	bird	you	are	interested	in	will	be	identified	by	an	integer	value.
 *    You	would	like	to	be	able	to	find	out	which	type	of	bird	is	most	common	given	a	
 *    list of	sightings.
 *    Your	task	is	to	print	the	type	number	of	that	bird	and	if	two	or	more	types	of	
 *    birds	are	equally	common,	choose	the	type	with	the	smallest	ID	number.
 * 
 *               
 *           
 *    INPUT	FORMAT
 *    The	first	line	contains	an	integer	denoting ’n’,	
 *    The	number	of	birds	sighted	and	reported in	the	array	arr .
 *    The	second	line	describes are as ’n’ space-separated	integers representing	the	type numbers of	
 *     each	bird	sighted.
 *      
 *
 *    OUTPUT	FORMAT
 *    Print	the	type	number	of	the	most	common	bird.
 *    If two or	more types of birds	are	equally	common,	choose	the	type with the	smallest	ID	number
 *    Constraints:
 *    Length of string <=10^6
 *    
 *   
 */
package Day1;
import java.util.Scanner;
import java.util.*;
public class MigratoryBirds {
	public static void main(String [] args)
	{
		int count = 0, max = 0;
		Scanner sc = new Scanner(System.in);
//		List<Integer> l1 = new ArrayList<Integer>();
//		l1.add(2);
//		l1.add(2);
//		l1.add(5);
//		l1.add(5);
//		l1.add(1);
		// total number of birds 
		int n = sc.nextInt();
		int [] type = new int[n];
		// types of birds sighted stored in the array
		for (int i=0; i<n; i++)
		{
			type[i] = sc.nextInt();
		}
		for (int i=0; i<n; i++)
		{
			System.out.print(type[i]+" ");
		}
		System.out.println();
		int [] freq = new int [5];
		for (int i=0; i<n; i++)
		{
			freq[type[i]-1]++;
		}
		for (int i=0; i<5; i++)
		{
			System.out.print(freq[i]+" ");
		}
		for(int i = 0; i<freq.length; i++)
		{
		if(freq[i] > max)
		{
			max = freq[i];
			count = i+1;
		}
		}
		System.out.println();
		System.out.println(count);
	}

}
