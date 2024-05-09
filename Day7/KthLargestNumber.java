/*
 *                        The Kth largest term
 *  There is array consists of some numbers. You have to find the kth largest number from the array.
 *  
 *  Input :
 *   1. Enter the length of array.
 *   2. Enter the elements of array.
 *   3. Enter the kth term.
 *  Output : 
 *   1. Print the kth largest number from array.
 */
package Day7;
import java.util.Arrays;
import java.util.Scanner;
public class KthLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc =  new Scanner(System.in);
       System.out.println("Enter the length of array :");
       int n = sc.nextInt();
       System.out.println("Enter the kth term :");
       int k = sc.nextInt();
       int [] numbers = new int [n];
       for (int i = 0; i < n; i++) {
		numbers[i] = sc.nextInt();
	}
       Arrays.sort(numbers);
       System.out.println("The "+k+" largest term is "+numbers[n-k]);
	}

}
