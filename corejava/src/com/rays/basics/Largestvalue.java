package com.rays.basics;

public class Largestvalue {
	public static void main(String[] args) {
		
		int[] arr= {2,4,33,22,88,1,44,32};
		int max=0;
		
//		HERE I = MIN VALUE AND J= MAX VALUE	
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("largest value == "+max);
		}
		
		
	}


