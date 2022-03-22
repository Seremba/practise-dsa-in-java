package com.seremba.binarysearch;

public class FirstAndLastPositionOfAnElementInArray {
	// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		int target = 8;

		int[] ans = searchRange(nums, target);

		System.out.println(ans);
	}

	static int[] searchRange(int[] nums, int target) {
		int[] ans = {-1,-1};

		// check for first occurrence of answer first

		ans[0] = search(nums, target, true);
		ans[1] = search(nums, target, false);

		return ans;
	}

	// function that returns index value of target
	static int search( int[] nums, int target, boolean findStartIndex){
		int ans = -1;
		int start = 0;
		int end = nums.length - 1;


		while (start <= end) {
			//find the middle element
			int mid = start + (end - start) / 2;
			// check if the target is on the right
			if (target < nums[mid]) {
				end = mid - 1;
			}
			// check if the target is on the left
			else if (target > nums[mid]) {
				start = mid + 1;
			} else {
				// target found
				ans = mid;
				if(findStartIndex == true){
					end = mid + 1;
				} else{
					start = mid - 1;
				}
			}
		}
		return ans;
	}
}
