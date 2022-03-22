package com.seremba.binarysearch;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndexInMountainArray {

	public static void main(String[] args) {
		int[] arr = {0,10,11, 12, 5,2};
		int ans = peakIndexInMountainArray(arr);
		System.out.println(ans);
	}
	public static int peakIndexInMountainArray(int[] arr) {
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
