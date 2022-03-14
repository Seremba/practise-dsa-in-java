package com.seremba.binarysearch;

public class BinarySearchAlgorithms {
	// search for 22 in the array
	public static void main(String[] args) {
		int[] arr = {-18, -12, -4, 2, 3, 4, 15,16, 18, 22, 45, 89};
		int target = 22;

		int ans = binarySearch(arr, target);
		System.out.println(ans);
	}

	static int binarySearch(int[] arr, int target) {
		int start =0;
		int end = arr.length-1;

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
