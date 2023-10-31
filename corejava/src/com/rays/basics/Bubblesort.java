package com.rays.basics;

public class Bubblesort {
	public static void main(String[] args) {
		
		int[] arr= {34,25,77,25,22,1,44,5};
		
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
				}
			System.out.println(arr[i]);
			
				
			}	
			
		}
		
		
		
	}


