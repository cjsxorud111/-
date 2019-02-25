package problem_solving;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Boj2751 {
	
	public static int partition(int arr[], int left, int right) {
		 
	    int pivot = arr[(left + right) / 2];
	 
	    while (left < right) {
	        while ((arr[left] < pivot) && (left < right))
	            left++;
	        while ((arr[right] > pivot) && (left < right))
	            right--;
	 
	        if (left < right) {
	            int temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;
	        }
	    }
	 
	    return left;
	}
	 
	 
	public static void quickSort(int arr[], int left, int right) {
	 
	    if (left < right) {
	        int pivotNewIndex = partition(arr, left, right);
	        quickSort(arr, left, pivotNewIndex - 1);
	        quickSort(arr, pivotNewIndex + 1, right);
	    }
	 
	}	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] aa = new int[a];
		for (int i = 0; i < a; i++) {
			aa[i] = sc.nextInt();
		}
		
		quickSort(aa, 0, aa.length - 1);
		for (int i : aa) {
	        System.out.println(i);
	    }
	}
}
