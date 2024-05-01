package Day2;
import java.util.Scanner;
import java.util.*;
public class DiskSpaceAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, s, j=0, k, l, max = 10, a, m=0, e, min1 = 0;
		/* n -> number of elements in array
		 * k -> length of segments
		 * e -> number of segments
		 * l -> length of array
		 */
		
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of disk");
      n = sc.nextInt();
      System.out.println("Enter the length of segment");
      k = sc.nextInt();
      e = n/k;
      int[] disk = new int[n];
      int[] min  = new int[n];
      
      l = disk.length;
      a=l/k;
      // Storing the elements in array
      System.out.println("Please enter elements");
      for (int i = 0; i <n; i++) {
		disk[i] = sc.nextInt();
	}
      //Printing the elements of disk
      System.out.println("The elements of array are");
      System.out.print("[");
      for(int i = 0; i<disk.length; i++)
      {
      System.out.print(disk[i]+" ");
      }
      System.out.print("]");
      System.out.println();
      System.out.println();
      // Finding minimum from each segment and storing into array
      for(int i = 0; i<a; i++)
      {
    	  s = j+k;
    	  max = 10;
      while(j<s)
      {
    	  if(disk[j]<max)
    	  {
    		  max = disk[j];
    	  }
    	  
    	  min[i] = max;
    	 
    	  j++;
    	  
      }
      
      }
      // If number of elements is odd, then it will store last element of array separately
      if(n%2==1)
      {
          min[e] = disk[n-1];
          e++;
      }
      // Finding maximum number from minimum elements
      for (int i = 0; i<min.length; i++)
      {
    	  if(min[i]> min1 )
    	  {
    		  min1 = min[i];
    	  }
      }
      // Printing minimum numbers from each segment
      System.out.println("The minimum numbers from each segment are");
      System.out.print("[");
      for(int i = 0; i<e; i++)
      {
      System.out.print(min[i]+" ");
      }
      System.out.println("]");
      System.out.println();
      // Printing maximum number from minimum number
      System.out.println("The maximum from the minimum is "+min1);
      
      
      
	}

}
