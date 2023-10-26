package com.rays.basics;

public class Maxarray {
	public static void main(String[] args) {
		int [] number= {1,5,3,7,11,12,};
		int count=0;
		
		for(int i=0;i<number.length;i++) {
			if(number[i]>count) {
				count=number[i];
			}
			
		}
		System.out.println(count);
		
		
	}

}
