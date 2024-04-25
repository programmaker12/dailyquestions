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
