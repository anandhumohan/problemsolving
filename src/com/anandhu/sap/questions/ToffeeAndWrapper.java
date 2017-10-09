package com.anandhu.sap.questions;

public class ToffeeAndWrapper {

	public static void main(String[] args) {
		// total money
		int money = 10;
		// price of one toffee
		int price = 1;
		// no of wrappers for getting one toffee
		int noOfWrappers = 2;

		System.out.println(getMaxtoffee(money, price, noOfWrappers));

	}

	private static int getMaxtoffee(int money, int price, int noOfWrappers) {

		int initialTofee = money / price;
		int totalToffee = initialTofee + getTotal(initialTofee, noOfWrappers);
		return totalToffee;

	}

	private static int getTotal(int initialTofee, int noOfWrappers) {
		if(initialTofee < noOfWrappers) {
			return 0;
		}
		int toff = initialTofee / noOfWrappers;
		int rem = initialTofee % noOfWrappers;
		return toff + getTotal(toff+rem, noOfWrappers);
	}

}
