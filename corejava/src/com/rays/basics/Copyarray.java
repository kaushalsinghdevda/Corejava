package com.rays.basics;

public class Copyarray {
	public static void main(String[] args) {
		
		
		char[] copyfrom = {'a','d','s','f','t','u','c','d','g'};
		
		char[] copyto = {'v','q','z','x','h','d','s'};
		
		System.arraycopy(copyfrom,2,copyto,1,6);
		
		System.out.println(new String(copyto));
		
		
	}

}
