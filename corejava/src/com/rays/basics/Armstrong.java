package com.rays.basics;

public class Armstrong {
	public static void main(String[] args) {
		int num=153;
		int r=0;
		int sum=0;
		int number=num;
		
		while(num>0) {
			
			r=number%10;
			
			sum=sum+(r*r*r);
			
			number=number/10;
			
		}
		if(num==sum) {
			System.out.println(num+"armstrong");
		}
		else {
			System.out.println(num+"not armstrong");
		}
	}

}
