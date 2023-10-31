package com.rays.basics;

public class Secondlargest {
	public static void main(String[] args) {
		int[] arr= {33,22,44,21,35,43};
		int min=0;
		int max=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				
				min=max;
				max=arr[i];
				
			}
			if(min<arr[i] && max>arr[i]) {
				min=arr[i];
				
			}
			
		}
		System.out.println("second largest vaue == "+min);
		
	}

}
