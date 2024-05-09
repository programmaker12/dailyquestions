/*
 *                         LightHouse
 *     
 *     
 * There are specific number of lighthouses. You have to find the maximum number of adjacent light houses light houses
 * having absolute difference less than or equal to 1
 * 
 * Input :
 *  1. Enter the number of lighthouses
 *  2. Enter the positions of lighthouses
 * Output : 
 *  1. Print maximum number of adjacent lighthouses having absoute difference less than or equal to 1
 */
package Day7;
import java.util.Scanner;
import java.lang.Math;
public class LightHouse {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the number of light house :");
        int n = sc.nextInt();
        System.out.println("Enter the position of light house :");
        int [] positions = new int[n];
        for (int i = 0; i < n; i++) {
			positions[i] = sc.nextInt();
		}
        for (int i = 0; i < n-1; i++) {
			if(Math.abs(positions[i] - positions[i+1]) <=1)
			{
				count++;
			}
		}
        if (count != 0)
        {
        	count++;
        	
        }
        System.out.println("Number of maximum light houses with absolute difference less than or equal to 1 is "+count);
	}

}
