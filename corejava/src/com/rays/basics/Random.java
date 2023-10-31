package com.rays.basics;

public class Random {
	public static void main(String[] args) {
		int min=1;
		int max=100;
		int range=max-min;
		
		for (int i = 1; i <=5; i++) {
			
			int rd = (int)(Math.random()*range);
			
			System.out.println("RANDOM NUMBER  ==  " + rd);
			
		}
	}

}
