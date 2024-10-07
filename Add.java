package com.bufferReader;
import java.io.*;
public class Add {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number:");
		int a=Integer.parseInt(sc.readLine());
		System.out.println("Enter second number:");
		int b=Integer.parseInt(sc.readLine());
		int sum=a+b;
		System.out.println(sum);
	}

}
