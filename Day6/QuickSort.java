/*
 *                 Implementation of Quick Sort
 */
package Day6;
import java.util.Scanner;
public class QuickSort {
static void swap(int number[], int i, int j)
{
	int temp = number[i];
	number[i] = number[j];
	number[j] = temp;	
}


// Function to swap the integers greater than pivot.
 static int partition(int [] number, int low, int high) 
 {
	int pivot = number[high];
	int i = (low - 1);         
	for (int j = low; j <= high-1; j++) {  
		
		if(number[j] < pivot) 
		{
			i++; 
			swap(number, i, j);
		}
	}
	swap(number, i+1, high);   
	
	return (i+1);
	 
 }
 // Function to divided the array on the basis of pivot position.
 
 
 static void quicksort(int [] number, int low, int high)
 {
	 if(low < high)
	 {
		int pi = partition(number, low, high); 
		quicksort(number, low, pi-1);
		quicksort(number, pi+1, high);
		
	 }
 }
 
 // Driver
 public static void main(String[] args) {
	QuickSort q = new QuickSort();
	int a [] = {10, 7, 8, 9, 1, 3, 2};
	int N = a.length;
	System.out.println("Unsorted Array:");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+ " ");
	}
	System.out.println();
	q.quicksort(a, 0, N - 1);
	System.out.println("Sorted Array:");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+ " ");
	}
}
}
