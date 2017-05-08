/*
 * 功能：二进制、源码、反码、补码、位运算、位移计算
 * 
 * 
 * 位运算：
 * 按位取反：~  1变0 0变1（是补码，要转换成原码）
 * 按位与& 都为1是1  
 * 按位或| 有一个为1就是1
 * 按位异或^ 异或  两者不相同的为1
 * 
 * 
 * 移位运算：
 * >>、<< 算术右移和算术左移
 * 算术右移：低位溢出，符号位不变，并用符号位补溢出的高位
 * 算术左移：符号位不变，低位补0
 * 
 * 
 * >>>逻辑右移，运算规则是：低位溢出，高位补0
 * */


package com.shifeng;

public class Me {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 取反
		System.out.println("~10="+(~10));
		// &
		System.out.println("2&3="+(2&3));
		// |
		System.out.println("2|3="+(2|3));
		// 
		System.out.println("~-5="+(~-5));
		// 异或
		System.out.println("-3^3="+(-3^3));
		System.out.println("-2^2="+(-2^2));
		System.out.println("-1^1="+(-1^1));
		
		// 移位运算
		System.out.println("1>>2="+(1>>2));
		System.out.println("-1>>9 ="+(-1>>9));
	}

}
