
/*
 * 两个线程同时运行：
 * 
 * */

package com.shifeng;

import java.security.Timestamp;

public class Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pig pig = new Pig(10);
		Bird bird = new Bird(10);
		Thread thread1 = new Thread(pig);
		Thread thread2 = new Thread(bird);
		thread1.start();
		thread2.start();
	}

}
// 打印
class Pig implements Runnable {

	int n = 0;
	int times = 0;
	public Pig (int n) {
		this.n = n;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (times < n) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			times++;
			System.out.println("我是第一个线程，在输出第"+times+"个Hello，wold");
		}
	}
	
}

// 鸟类去算数学题
class Bird implements Runnable {

	int n = 0;
	int result = 0;
	int times = 0;
	
	public Bird (int n) {
		this.n = n;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (times < n) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.result += this.times;
			times++;
			System.out.println("当前结果是"+result);
		}
		System.out.println("最后结果是"+result);
	}	
}













