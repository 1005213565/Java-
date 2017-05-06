
/*
 * 功能：三个售票点同时去卖2000（总共的）张票
 * 
 * */

package com.shifeng1;

public class Dem0_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 定义三个窗口
		TicketWindow ticketWindow1 = new TicketWindow();
		
		// 使用三个线程同时启动一个窗口，来共享同一个数据
		Thread thread1 = new Thread(ticketWindow1);
		Thread thread2 = new Thread(ticketWindow1);
		Thread thread3 = new Thread(ticketWindow1);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}

// 售票窗口
class TicketWindow implements Runnable{
	
	// 一共2000张票，要共享着2000个票可以用static修饰
	private int nums = 2000;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			
			// 设置出票速度
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 是否还有票
			if (this.nums > 0) {
				synchronized (this) { // 对线程加锁,同步代码块
					// 显示票信息
					// Thread.currentThread().getName()得到当前线程的名字
					System.out.println(Thread.currentThread().getName()+"正在售出="+nums+"票");
					this.nums--;
				}
				
			}else {
				// 售票结束
				System.out.println("售票结束");
				break;
			}
		}
	}
}




















