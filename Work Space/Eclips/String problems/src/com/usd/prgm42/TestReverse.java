package com.usd.prgm42;

import java.util.Scanner;

public class TestReverse {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string ");
		String s=kb.nextLine();
		ReverseUsingRecursion.reverseAndPrint(s);
	}

}
