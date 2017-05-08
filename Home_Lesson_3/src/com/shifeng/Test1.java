
/*
 * 边界布局：默认就是边界布局
 * 
 * 
 * */
package com.shifeng;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class Test1  extends JFrame{

	JButton jb1,jb2,jb3,jb4,jb5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 test1 = new Test1();
	}

	public Test1 () {
		jb1 = new JButton("东");
		jb2 = new JButton("南");
		jb3 = new JButton("西");
		jb4 = new JButton("北");
		jb5 = new JButton("中");
		
		this.add(jb1,BorderLayout.EAST);
		this.add(jb2, BorderLayout.SOUTH);
		this.add(jb3, BorderLayout.WEST);
		this.add(jb4, BorderLayout.NORTH);
		this.add(jb5, BorderLayout.CENTER);
		
		this.setTitle("边界布局案例");
		this.setSize(300, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}







