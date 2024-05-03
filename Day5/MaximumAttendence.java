package Day5;
import java.util.Scanner;
public class MaximumAttendence {
     // Function for finding the maximum number od consecutive days on which students are present
static int MaximumAttendence(int n, String records[])
{
	String present = "";
	int count = 0, max = 0;
	for (int i = 0; i < n; i++) {
		present+="P";
		
	}
	System.out.println(present);
	
	for (int i = 0; i < records.length; i++) {
		if (records[i].equals(present))
		{
			count++;
		}
		else if (count > max)
		{
			max = count;
			count = 0;
		}
		
	}
	if (count > max)
	{
		max = count;
	}
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of students");
		int n = sc.nextInt();
		System.out.println("Please enter the number of days");
		int m = sc.nextInt();
		String [] records = new String [m];
		System.out.println("Please enter the records");
		for (int i = 0; i < records.length; i++) {
			records[i] = sc.next();
		}
		
		
		System.out.println(MaximumAttendence(n, records));

	}

}
