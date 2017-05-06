/*
 * 功能：二进制（原码、反码、补码）、位运算
 * 
 * 
 * */

package com.UsbTest;

public class MoreList {

	public static void main (String [] args) {
		
		int a = 1 >> 2;
		int b = -1 >> 2;
		int c = 1 << 2;
		int d = -1 << 2;
		int e = 3 >>> 2;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
		
	}
}
