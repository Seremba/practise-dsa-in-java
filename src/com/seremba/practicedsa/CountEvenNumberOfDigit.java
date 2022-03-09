package com.seremba.practicedsa;

public class CountEvenNumberOfDigit {

	public static void main(String[] args) {
		int[] arr = {12, 764, 9, 5, 98, 7869};
		int ans = findNumbers(arr);
		System.out.println(ans);
	}

	 static int findNumbers(int[] nums) {
		int count = 0;
		for(int num : nums){
			if(even(num)){
				count++;
			}
		}
		return count;
	}

	 static boolean even(int num) {
       int numberOfDigits = digits(num);
	   if(numberOfDigits % 2 == 0){
		   return true;
	   }
	   return false;
	}

	static int digits(int num){
		int count =0;
		while(num > 0){
			count++;
			num = num/10;
		}
		return count;
	}

}
