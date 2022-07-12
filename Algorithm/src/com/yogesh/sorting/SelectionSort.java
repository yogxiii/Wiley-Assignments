package com.yogesh.sorting;

/*
 * Time complexity
 * Best Case  - O(n^2)  
 * Average Case - O(n^2)
 * Worst Case - O(n^2)
 * 
 * n is no. of element in array
 * It only make maximum of n swaps, helpful in case of less memory
 * 
 * Space Complexity
 * 
 * All case - O(1) - As we are not using any extra array (we can ignore local variable used) 
 * 
 * Selection sort is in-place(do not use any extra space) 
 * Not stable in default implementation(below one)
 * */

public class SelectionSort {
	private int[] arr;

	public SelectionSort(int[] arr) {
		super();
		this.arr = arr;
	}

	public void sort() {
		for(int i=0;i<arr.length-1;i++) {
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	
	public int[] getArr() {
		return arr;
	}
}
