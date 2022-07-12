package com.yogesh.sorting;

public class InsertionSort {
	private int[] arr;

	public InsertionSort(int[] arr) {
		super();
		this.arr = arr;
	}
	
	public void sort() {
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
	
	public int[] getArr() {
		return arr;
	}
}
