package com.seremba.binarysearch;

public class FloorOfNumberInArray {

	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 9, 14, 16, 18};
		int target = 15;
		int ans = floorOfNumber(arr, target);
		System.out.println(ans);
	}
	// floor of a number
	static int floorOfNumber(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

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
		return end;
	}
}
