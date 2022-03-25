package com.seremba.binarysearch;

public class SplitArrayLargestSum {

	public static void main(String[] args) {
		int[] nums = {7,2,5,10,8};
		int m = 2;

		int ans = splitArray(nums, 2);
		System.out.println(ans);
	}
	static int splitArray(int[] nums, int m) {
			int start = 0;
			int end = 0;
		for (int i = 0; i < nums.length; i++) {
			start = Math.max(start, nums[i]);
			end += nums[i];
		}

		while(start < end){
			// try middle as the potential answer
			int mid = start + (start - end) /2;
			// calculate the number of pieces you can divide with the max sum
			int sum = 0;
			int piece = 1;
			 for( int num : nums){
				 if(sum + num > mid) {
					 // this means you cannot add the element in the subarray, make a new one
					 sum = num;
					 piece++;
				 } else {
					 sum += num;
				 }
			 }

			 if(piece > m){
				 start = mid + 1;
			 } else {
				 end = mid;
			 }
		}

		return start; // here start == end, so you can either start or end
	}
}
