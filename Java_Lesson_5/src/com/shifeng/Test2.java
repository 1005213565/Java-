
/*
 * java的反射机制：
 * 
 * 
 * 泛型的优点：
 * 1.类型安全
 * 2.向后兼容
 * 3.层次清晰
 * 4.性能较高，用GJ（泛型）编写的代码可以用java的编译器和虚拟器带来更多的类型信息，
 * 
 * */
package com.shifeng;

import java.lang.reflect.Method; // java反射的类
import java.util.ArrayList; // java  ArrayList

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gen <Bird> gen1 = new Gen<Bird>(new Bird());
		gen1.showTypeName();
	}

}
// 定义一个Bird类
class Bird {
	
	public void test1() {
		System.out.println("aa");
	}
	
	public void count(int a, int b) {
		System.out.println(a + b);
	}
}


// 定义一个类(作为泛型)
class Gen<T> { // T是我认为的类型，但是我不知道这个是什么类型
	private T o;
	public Gen(T a) {
		this.o = a;
	}
	// 得到T的类型名称
	public void showTypeName() {
		
		System.out.println("类型是："+o.getClass().getName());
		// 通过反射机制，可以得到T这个类型的很多信息（函数名称，返回类型，成员变量）
		Method[] arrlist=  o.getClass().getDeclaredMethods(); // 返回一个Method对象，该对象反应了此class对象所表示的类或者接口的指定已经声明的方法
		// 打印
		for(int i = 0; i < arrlist.length; i++) {
			System.out.println("类方法的名称是"+arrlist[i].getName());
			System.out.println("类方法的返回值类型"+arrlist[i].getReturnType());
			System.out.println(" 得到声明的类"+arrlist[i].getDeclaringClass());
			
		}
	}
}


