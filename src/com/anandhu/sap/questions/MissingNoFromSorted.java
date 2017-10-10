package com.anandhu.sap.questions;

public class MissingNoFromSorted {
	// we have size of array of n-1 and nos from 1 to n one no is missing 
	public static void main(String[] args) {
		int[] nos = { 1, 2, 3, 4, 5, 6, 7, 7 ,8};
		int min = 0;
		int max = nos.length-1;
		System.out.println(findMissing(min, max, nos));
	}

	private static int findMissing(int min, int max, int[] nos) {
		
		int mid = (min+max)/2;
		if(mid == nos[mid]) {
			return mid;
		}
		else {
			if(nos[mid] == mid+1) {
				return findMissing(mid+1, max, nos);
			}
			else {
				return findMissing(min, mid-1, nos);
			}
		}
	}

}
