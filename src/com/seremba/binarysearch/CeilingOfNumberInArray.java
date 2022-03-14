package com.seremba.binarysearch;

public class CeilingOfNumberInArray {

	public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
		int target = 15;

		int ans = ceilngOfNumber(arr, target);
		System.out.println(ans);
	}
   // ceiling means the smallest number greater or equal to target

	static int ceilngOfNumber(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		if(target > arr[end]){
			return -1;
		}
		while (start <= end) {
			//find the middle element
			int mid = start + (end - start) / 2;
			// check if the target is on the right
			if (target < arr[mid]) {
				end = mid - 1;
			}
			// check if the target is on the left
			else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				// target found
				return mid;
			}

		}
        return start;
	}
}
