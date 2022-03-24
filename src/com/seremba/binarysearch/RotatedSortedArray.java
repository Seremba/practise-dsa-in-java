package com.seremba.binarysearch;
 //https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedSortedArray {

	public static void main(String[] args) {
		int[] nums = {4,5,6,7,0,1,2};

		int ans = findPivot(nums);
		System.out.println(ans);
	}

	static int search(int[] nums, int target){
		int pivot = findPivot(nums);
		// if you did not find the pivot it means the array was not rotated
		if( pivot == -1) {
			// do normal binary search
          return binarySearch(nums, target, 0, nums.length-1);
		}
		// if pivot is found, you have two ascending sorted arrays
		if(nums[pivot] == target){
			return pivot;
		}
		if(target >= nums[0] ){
			return binarySearch(nums, target, 0, pivot -1);
		}
		return binarySearch(nums, target, pivot + 1, nums.length - 1);

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
	static int findPivot(int[] arr){
		int start = 0;
		int end = arr.length -1;

		while(start <= end){
			// find the mid
			int mid = start + (end - start) /2;
			if( mid < end && arr[mid] > arr[mid + 1]){
				return mid ;
			}
			if( mid > start && arr[mid] < arr[mid - 1]){
				return mid - 1;
			}
			if(arr[mid] <= arr[start]){
				end = mid + 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
	
}
