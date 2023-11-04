package com.rays.basics;

public class Countarr {
	public static void main(String[] args) {
		String[] name= {"kaushal","singh","devda"};
		int count=0;
		
		for(char ch='a';ch<='z';ch++) {
			for(int i=0;i<name.length;i++) {
				for(int j=0;j<name[i].length();j++) {
				if(name[i].charAt(j)==ch) {
					count++;
					}
				}
			}
				if(count>0) {
				
				System.out.println(ch+"="+count);
				}
				count=0;
				
				}
			
			
			}
			
		}
	


