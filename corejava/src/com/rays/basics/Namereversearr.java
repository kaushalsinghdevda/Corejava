package com.rays.basics;

public class Namereversearr {
	
	public static void main(String[] args) {
		String[] name= {"kaushal","aman","abhiraj"};
		
		for(int i=0;i<name.length;i++) {
			for(int j=name[i].length()-1;j>=0;j--) {
				
				System.out.print(name[i].charAt(j));
				
			}
			System.out.println(" ");
			
			
		}
	}

}
