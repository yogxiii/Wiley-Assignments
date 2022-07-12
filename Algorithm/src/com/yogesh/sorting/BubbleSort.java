package com.yogesh.sorting;

public class BubbleSort {
	private int[] arr;

	public BubbleSort(int[] arr) {
		super();
		this.arr = arr;
	}
	
	public void sort() {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public int[] getArr() {
		return arr;
	}
	
}
