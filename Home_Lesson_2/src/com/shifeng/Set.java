/*
 * 集合框架：
 * 经常用的java集合类：
 * 1.HashMap
 * 2.HashSet
 * 3.ArrayList
 * 4.LinkedList、
 * 5.Hashtable
 * 6.Vector(Legacy)
 * 7.Stack(Legacy)
 * 总结起来就是以下集合类：
 * List结构的集合类
 * ArrayList类、LinkedList类、Vector类、Stack类
 * Map结构集合类
 * HashMap类、Hashtable类
 * Set结构的集合类
 * HashSet类、TreeSet类
 * Queue结构的集合类
 * Queue接口
 * 
 * 
 * 
 * 泛型：
 * 异常：
 * */

package com.shifeng;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clerk clerks[] = new Clerk[5 ];
	}

}

// 定义一个员工类
class Clerk {
	private String name;
	private int age;
	private float sal;
	// 构造方法
	public Clerk(String name,int age, float sal){
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
}