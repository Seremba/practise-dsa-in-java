package com.seremba.binarysearch;
// https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1};
		int ans = findInMountArray(arr);
		System.out.println(ans);
	}

	static int findInMountArray(int[] arr){
		int start = 0;
		int end = arr.length -1;

		while(start < end){
			int mid = start + (end -start) / 2;
			if(arr[mid] > arr[mid + 1]){
				// you are in the decreasing part of the array
				// this maybe the answer but look at left
				end = mid;
			} else {
				// you are in the asc part of the array
				start = mid + 1;
			}
		}
		return start;
	}
}
