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
