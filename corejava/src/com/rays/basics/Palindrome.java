package com.rays.basics;

public class Palindrome {
	public static void main(String[] args) {
		
		int num=141;
		int r=0;
		int sum=0;
		int n=num;
		
		while(num>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(num==sum) {
			
			System.out.println(sum+"it is palendrome");
		}else {
			System.out.println(sum+"it is not a palindrome");
		}
	}

}
