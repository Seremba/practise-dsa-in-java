package com.seremba.leetcode;

import java.util.HashSet;

public class HappyNumber {
	// https://leetcode.com/problems/happy-number/
	public static void main(String[] args) {
		boolean ans = isHappy( 19);
		System.out.println(ans);
	}

	static boolean isHappy( int n) {
		HashSet<Integer> seenSet = new HashSet<Integer>();

		while( n != 1) {
			int current = n;
			int sum = 0;
			while(current != 0) {
				sum += (current % 10) * (current % 10);
				current /= 10;
			}
			if( seenSet.contains(sum)) {
				return false;
			}
			seenSet.add(sum);
		}
		return true;
	}

}
