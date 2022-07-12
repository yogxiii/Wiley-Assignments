package com.yogesh.sorting;

public class SortingMain {

	public static void main(String[] args) {
		int arr[] = {4, 8, 2, 5, 7};
		
//		System.out.println("Bubble Sort");
//		BubbleSort bubbleSort = new BubbleSort(arr);
//		bubbleSort.sort();
//		arr = bubbleSort.getArr();
//		for(int i : arr)
//			System.out.print(i+" ");
//		
//		System.out.println("");
//		System.out.println("Insertion Sort");
//		InsertionSort insertionSort = new InsertionSort(arr);
//		insertionSort.sort();
//		arr = insertionSort.getArr();
//		for(int i : arr)
//			System.out.print(i+" ");
//		
//		System.out.println("");
//		System.out.println("Insertion Sort");
//		SelectionSort selectionSort = new SelectionSort(arr);
//		selectionSort.sort();
//		arr = selectionSort.getArr();
//		for(int i : arr)
//			System.out.print(i+" ");
//		
//		System.out.println("");
//		System.out.println("Quick Sort");
//		QuickSort quickSort = new QuickSort(arr);
//		quickSort.sort();
//		arr = quickSort.getArr();
//		for(int i : arr)
//			System.out.print(i+" ");
		
//		System.out.println("");
		System.out.println("Merge Sort");
		MergeSort mergeSort = new MergeSort(arr);
		mergeSort.sort();
		arr = mergeSort.getArr();
		for(int i : arr)
			System.out.print(i+" ");
		
		System.out.println("");
		System.out.println("Shell Sort");
		ShellSort shellSort = new ShellSort(arr);
		shellSort.sort();
		arr = shellSort.getArr();
		for(int i : arr)
			System.out.print(i+" ");
	}

}
