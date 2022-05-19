package com.seremba.leetcode;

import java.util.HashSet;

// https://leetcode.com/problems/single-number/
public class SingleNumber {

	 public static void main(String[] args) {
		 int[] arr = {4, 1, 2, 1, 2};
		int ans = singleNumber(arr);
		 System.out.println(ans);
	 }

	 static int singleNumber(int[] nums) {
		 HashSet<Integer> set = new HashSet<>();
		 for( int i : nums) {
			 if(set.contains(i)){
				 set.remove(i);
			 } else {
				 set.add(i);
			 }
		 }
		 for(int i : set){
			 return i;
		 }
		 return -1;
	 }
}
