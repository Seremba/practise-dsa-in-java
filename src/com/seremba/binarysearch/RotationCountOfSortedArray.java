package com.seremba.binarysearch;

public class RotationCountOfSortedArray {

	public static void main(String[] args) {
		int[] nums = {4,5,6,7,0,1,2};

		System.out.println(countRotations(nums));
	}

	static int countRotations(int[] nums) {
        int pivot = findPivot(nums);
		//if no pivot found just return 0
		if(pivot == -1){
			return 0;
		}
		return pivot + 1;
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
