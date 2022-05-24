package com.seremba.sorting.cyclic_sort;

import java.util.Arrays;

public class MissingNumber {
	// https://leetcode.com/problems/missing-number/
	public static void main(String[] args) {
		int [] arr =  {9,6,4,2,3,5,7,0,1};
		int ans = missingNumber(arr);
		System.out.println(ans);

	}

	static int missingNumber(int[] arr){
		int i =0;
		while( i < arr.length){
			int correct = arr[i];
			int n = arr.length;
			if( arr[i] < n && arr[i] != arr[correct] ){
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
		
		// find missing number
		for (int index = 0; index < arr.length; index++) {
			if(arr[index] != index){
				return index;
			}
		}
		return arr.length;
	}

	 static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
