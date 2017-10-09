package com.anandhu.sap.questions;

public class RotationString {
	public static void main(String[] args) {
		String str1 = "anandhu";
		String str2 = "andhunn";
		String str3 = str1 + str1;
		
		if (str1.length() != str2.length()) {
			System.out.println("Not a Rotation String");
		} else {
			if (str3.contains(str2)) {
				System.out.println("Rotation String");
			} else {
				System.out.println("Not a Rotation String");
			}
		}
	}

}
