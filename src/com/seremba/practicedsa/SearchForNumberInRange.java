package com.seremba.practicedsa;

public class SearchForNumberInRange {

	public static void main(String[] args) {
		//search for 3 in the range of index [1,4]
		int[] arr = {18, 12, -7, 3, 14, 28};
		int ans = searchForNumberInRange(arr, 3, 1,5);
		System.out.println(ans);
	}

	public static int searchForNumberInRange(int[] arr, int target, int start, int end) {
		// assume array is not empty
		if( arr.length ==0) {
			return -1;
		}

		for (int i = start; i < end; i++) {
			int element = arr[i];
			if(element == target){
			   return element;
		   }
		}
		return -1;
	}

}
