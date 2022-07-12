package com.yogesh.sorting;

public class QuickSort {
	private int[] arr;

	public QuickSort(int[] arr) {
		super();
		this.arr = arr;
	}
	
	static void swap(int array[], int i, int j)
	{
	    int temp = array[i];
	    array[i] = array[j];
	    array[j] = temp;
	}
	
	static int partition(int array[],int start,int end) {
		int pivot = array[end];
		int i=start-1;
		
		for(int j=start;j<=end-1;j++) {
			if(array[j] < pivot) {
				i++;
				swap(array,i,j);
			}
		}
		
		swap(array,i+1,end);
		return i+1;
	}
	
	static void quickSort(int array[],int start,int end) {
		if(start < end) {
			int pivotIndex = partition(array,start,end);
			quickSort(array,start,pivotIndex-1);
			quickSort(array,pivotIndex+1,end);
		}
	}
	
	void sort() {
		quickSort(arr,0,arr.length-1);
	}

	public int[] getArr() {
		return arr;
	}
	
}
