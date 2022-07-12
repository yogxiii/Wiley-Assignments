package com.yogesh.sorting;

/*
 * Time complexity
 * Best Case  - O(nlogn)  
 * Average Case - O(nlogn)
 * Worst Case - O(nlogn)
 * 
 * Always divide array in half and take linear time to merge those array
 * 
 * n is no. of element in array
 * 
 * Space Complexity
 * 
 * All case - O(n) - All element are copy into auxiliary array 
 * 
 * In place  - No (in this implementation)
 * Stable - Yes
 * */

public class MergeSort {
	private int arr[];

	public MergeSort(int[] arr) {
		super();
		this.arr = arr;
	}
	
	void merge(int array[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
 
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        for (int i = 0; i < n1; ++i)
            L[i] = array[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = array[m + 1 + j];
 
        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
            	array[k] = L[i];
                i++;
            }
            else {
            	array[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
        	array[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2) {
        	array[k] = R[j];
            j++;
            k++;
        }
    }
 
    void mergeSort(int array[], int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;
 
            mergeSort(array, l, m);
            mergeSort(array, m + 1, r);
 
            merge(array, l, m, r);
        }
    }
    
    public void sort() {
    	mergeSort(arr,0,arr.length-1);
    }
	public int[] getArr() {
		return arr;
	}
	
	
}
