package com.rays.basics;

public class Notecount {
	
	public static void main(String[] args) {
		int rupee=6353;
		int count=0;
		
		int[] arr= {2000,500,100,50,20,10,5,2,1};
		
		for(int i=0;i<arr.length;i++) {
			
			count = rupee / arr[i];
			
			rupee= rupee % arr[i];
			
			if(count>0) {
				System.out.println(arr[i]+"="+count);
			}
		}
	}

}
