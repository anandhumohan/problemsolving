package com.anandhu.sap.questions;

import java.util.Scanner;

public class BinarySearchTree {
	private int data;
	private BinarySearchTree left;
	private BinarySearchTree right;

	public BinarySearchTree(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int val = scanner.nextInt();
		createTree(val);
		
		
	}
	private static void createTree(int val) {
		
		
	}

}
