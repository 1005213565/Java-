
/*
 * 演示：通过继承Thread来开发线程
 * 
 * */

package com.shifeng;

public class Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Cat cat = new Cat();
//		// 启动线程,会导致run函数的运行
//		cat.start();
		
		// 注意启动
		Dog dog = new Dog();
		// 创建一个Thread对象,把狗放进去
		Thread thread = new  Thread(dog);
		thread.start();
	}

}

class Cat extends Thread{
	int times = 10;
	// 重写Thead的Run函数
	public void run() {
		while (times > 0) {// 退出线程
			System.out.println("你好");
			// 休眠一秒,1000表示的是毫秒（sleep会让该线程进入阻塞blocked状态，并释放资源）
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			times--;
		}
		
	}
}

class Dog implements Runnable { // 实现Runnable接口类进行线程

	int times = 10;
	@Override
	public void run() {
		while (times > 0) {// 退出线程
			System.out.println("你好我是Runnable");
			// 休眠一秒,1000表示的是毫秒（sleep会让该线程进入阻塞blocked状态，并释放资源）
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			times--;
		}
	}
	
}

























