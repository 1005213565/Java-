
/*
 * 网格布局：
 * GirdLayout布局，他将容器分割成多行多列，组件被填充到每个网格中，添加到
 * 容器中的组件首先防止在左上角的网格中，然后从左到右放置它的组件，当占满
 * 该行的所有网格后，接着继续在下一行从左到右放置组件
 * 
 * */
package com.shifeng;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test3 extends JFrame{

	int size = 9;
	JButton jbs[] = new JButton[size];
	public static void main(String [] args) {
		Test3 test3 =  new Test3();
	}
	
	public Test3 () {
		for (int i = 0; i < size; i++) {
			jbs[i] = new JButton(String.valueOf(i));
		}
	   // 设置网格布几行几列 列距  行距离
		this.setLayout(new GridLayout(3, 3,10,50));
		
		// 添加组件
		for (int i = 0; i < size; i++) {
			this.add(jbs[i]);
		}
		
		// 设置窗体属性
		this.setTitle("网格布局案例");
		this.setSize(400, 400);
		this.setLocation(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
}








