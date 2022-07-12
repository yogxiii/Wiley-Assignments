package com.yogesh.sorting;

/*
 * Time complexity
 * Best Case  - O(n)  --  Occur When array is already sorted
 * Average Case - O(n^2)
 * Worst Case - O(n^2)
 * 
 * n is no. of element in array
 * 
 * Space Complexity
 * 
 * All case - O(1) - As we are not using any extra array (we can ignore local variable used) 
 * 
 * Insertion sort is both in-place(do not use any extra space) and stable (maintain relative order of equal element)
 * */

public class Main {

	static void insertionSort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int unsortedKey = arr[i];
			int movingIndex = i-1;
			while(movingIndex >= 0 && arr[movingIndex] > unsortedKey) {
				arr[movingIndex+1] = arr[movingIndex];
				movingIndex--;
			}
			arr[movingIndex+1] = unsortedKey;
		}
	}
	public static void main(String[] args) {
		int arr[] = {4, 8, 2, 5, 7};
		System.out.println("Insertion Sort");
		insertionSort(arr);
		for(int i : arr)
			System.out.print(i+" ");

	}

}
