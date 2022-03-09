package com.seremba.practicedsa;

public class SearchInArrayReturnIndex {

	public static void main(String[] args) {
		// search in array and return the index if the item is found.
		// If item is not found, return -1
		int[] arr = {23, 45, 2, 3,19, -3, 16, -11};

		int ans	= searchArrayReturnIndex(arr, 19);
		System.out.println(ans);
	}

	public static int searchArrayReturnIndex(int[] arr, int target) {
		// assume the array is not empty
		if(arr.length == 0){
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			if(element == target){
				return i;
			}
		}
		return -1;


	}

}
