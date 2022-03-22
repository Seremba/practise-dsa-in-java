package com.seremba.binarysearch;

public class InfinityArray {
   //https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
	public static void main(String[] args) {
		int arr[] = {3, 5, 7, 9, 10, 90,
				100, 130, 140, 160, 170};
		int target = 10;
		System.out.println(ans(arr, target));
	}

	static int ans(int[] arr, int target){
		// find the range
		// start with an array of size two
		int start = 0;
		int end = 1;
		// condition for the target to lie in the range
		while(target > arr[end]){
			int temp = end + 1; // this is my new start
			 end = end + (end - start + 1) * 2;
			 start = temp;

		}
		return binarySearch(arr, target, start, end);
	}

	static int binarySearch(int[] arr, int target, int start, int end) {

		while(start <= end){
			//find the middle element
			int mid = start + (end - start) /2;
			// check if the target is on the right
			if(target  < arr[mid]){
				end = mid - 1;
			}
			// check if the target is on the left
			else if( target > arr[mid]){
				start = mid + 1;
			} else {
				// target found
				return mid;
			}

		}

		return -1;

	}

}
