package com.shifeng;

import javax.swing.*; // 导入系统库

/*
 * 方法重载：
 * 1.方法名相同
 * 2.方法的参数类型、个数、顺序至少有一个不同
 * 3.方法返回类型可以不同
 * 4.方法的修饰符可以不同
 * 只是返回类型不同，不能构成重载
 * 
 * 
 * 方法覆盖：
 * 1.子类方法不能缩小父类方法的访问权限
 * 2.子类方法的返回类型，参数。方法名称，要和父类方法的返回类型、参数、方法名称完全一样
 * */
public class Demo2 extends JFrame{

	public static void main(String []args) {
		
		Demo2 demo = new Demo2();
	}
	
	public Demo2() { // 继承系统库java.swing.内的JFrame之后就有了可视化的界面
		this.setVisible(true);
		this.setSize(200, 300);
	}
}
