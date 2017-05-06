
/*
 * 泛型的必要性
 * 
 * 
 * */

package com.shifeng;
import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Dog> arrayList = new ArrayList<Dog>();
		Dog dog = new Dog();
		arrayList.add(dog);
		Dog dog1 = arrayList.get(0);
		// 使用泛型
		
	}

}
class Cat {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class Dog {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}