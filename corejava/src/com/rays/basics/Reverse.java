package com.rays.basics;

public class Reverse {
	public static void main(String[] args) {
		int num=153;
		int rem=0;
		int sum=0;
		int n=num;
		
		while(num>0) {
			
			rem=num%10;
			
			sum=(sum*10)+rem;
			
			n=num/10;	
		}
		if(num==sum) {
			System.out.println(sum+"  is a palendrome number");
		}else 
			System.out.println(sum+"  is not a palendrome");
			}
		
		
	}


