package com.seremba.practicedsa;

public class MinimumNumber {
//	find the minimum number in the array
public static void main(String[] args) {
	int[] arr = {18, 22, -7, 3, 14, 28};
	int ans = findMinimumValue(arr);
	System.out.println(ans);
}

	public static int findMinimumValue(int[] arr) {


		int ans = arr[0];

		for (int i = 1; i < arr.length ; i++) {
			if(arr[i] < ans) {
				ans = arr[i];
			}
		}
		return ans;
	}

}
