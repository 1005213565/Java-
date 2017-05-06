
/*
 * 功能：使用线程的注意事项
 * 1.一个线程只能启动一次
 * 
 * */

package com.shifeng1;

public class Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat = new Cat();
		cat.start();
	   Dog dog = new Dog();
	   Thread thread = new Thread(dog);
	   thread.start();
	}

}

// 猫类
class Cat extends Thread {
	public void run() {
		System.out.println("猫类");
	}
}

// 狗类
class Dog implements Runnable{
	public void run() {
		System.out.println("狗类");
	}
} 