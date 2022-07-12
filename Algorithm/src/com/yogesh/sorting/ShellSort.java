package com.yogesh.sorting;

public class ShellSort {
	private int arr[];

	public ShellSort(int[] arr) {
		super();
		this.arr = arr;
	}
	
	void shellSort(int arr[])
    {
        int n = arr.length;

        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = arr[i];
  
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
  
                arr[j] = temp;
            }
        }
    }
  
	public void sort() {
		shellSort(arr);
	}

	public int[] getArr() {
		return arr;
	}
	
	
}
