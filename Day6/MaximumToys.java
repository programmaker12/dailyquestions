/*
 *                      Maximum Toys
 *  You have a specific amount of money and you have to buy toys in that money.
 *  So, maximum how much toys you can buy that you have to find out.
 *  
 *  Input:
 *  1. Amount of money 
 *  2. Number of toys in shop
 *  3. Prices of toys
 *  
 *  Output:
 *  1. Maximum number of toys can be purchased in given amount.
 *
 */
package Day6;
import java.util.Arrays;
import java.util.Scanner;
public class MaximumToys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n, m, sum = 0, count=0;
     // n -> Amount of Money the person has.
     Scanner sc = new Scanner(System.in);
     System.out.println("PLease enter amount of money with you");
     n = sc.nextInt();
     System.out.println("PLease enter number of toys in shop");
     m = sc.nextInt();
     System.out.println("Enter the prices of toys");
     int [] prices = new int[m];
     for (int i = 0; i < m; i++) {
    	 prices[i] = sc.nextInt();
	}
     for (int i = 0; i < m; i++) {
    	 System.out.print(prices[i]+" ");
	}
     //Sorting the array in ascending order
     Arrays.sort(prices);
     System.out.println();
     System.out.print("Prices in ascending order");
     System.out.println();
     for (int i = 0; i < m; i++) {
    	 System.out.print(prices[i]+" ");          // 1 1 2 4 6 8
	}
     for (int i = 0; i < m; i++) {
    	 if (sum + prices[i] <= n)
    	 {
    		 sum += prices[i];
    		 count++;
    		 
    	 }  
	}
     System.out.println();
     System.out.println("The number of toys you can buy is "+ count);
	}

}
