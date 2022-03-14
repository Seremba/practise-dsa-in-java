package com.seremba.binarysearch;

public class SmallestLetterGreaterThanTarget {
    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/
	public static void main(String[] args) {
		char [] letters = {'c','f','j'} ;
		char target = 'a';

		char ans = letterGreaterThanTarget(letters, target);
		System.out.println(ans);
	}
	static char letterGreaterThanTarget(char[] letters, char target) {

		int start = 0;
		int end = letters.length - 1;

		while (start <= end) {
			//find the middle element
			int mid = start + (end - start) / 2;
			// check if the target is on the right
			if (target < letters[mid]) {
				end = mid - 1;
			}
			// check if the target is on the left
			else {
				start = mid + 1;
			}
		}
		return letters[start % letters.length];
	}
}
