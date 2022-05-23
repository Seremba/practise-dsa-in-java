package com.seremba.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {3, 2, 1, 4, 6, -1, -4, 0};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void bubbleSort(int[] arr){
		//run the steps n-1 times
		boolean swapped;
		for (int i = 0; i < arr.length; i++) {
			//for each step, max item will come at its respective position
			swapped = false;
			for(int j=1; j< arr.length -i; j++){
				// if item is smaller than the item on the right
				if(arr[j] < arr[j-1]){
					// swap
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped = true;
				}
			}
			if(!swapped){
				break;
			}
		}

	}
}
