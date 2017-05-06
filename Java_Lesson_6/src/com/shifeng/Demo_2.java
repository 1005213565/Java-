
/*
 * 边界布局管理器：
 * 
 * 步骤：
 * 1.j继承JFrame
 * 2.定义组件
 * 3.创建组件
 * 4.添加组件
 * 5.对顶层窗体设置
 * */
package com.shifeng;
import java.awt.*;
import javax.swing.*;

public class Demo_2 extends JFrame{

	// 定义组件
	JButton jb1,jb2,jb3,jb4,jb5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		Demo_2 demo_2 = new Demo_2();
	}
	
	public Demo_2() {
		// 创建组件
		jb1 =  new JButton("东");
		jb1 =  new JButton("南");
		jb1 =  new JButton("西");
		jb1 =  new JButton("北");
		jb1 =  new JButton("中");
		
		// 添加组件
		this.add(jb1,BorderLayout.EAST);
		this.add(jb2,BorderLayout.SOUTH);
		this.add(jb3,BorderLayout.WEST);
		this.add(jb4,BorderLayout.NORTH);
		this.add(jb5,BorderLayout.CENTER);	
		
		// 设置窗体属性
		this.setTitle("边界布局的演示");
		this.setSize(200, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 显示窗体
		this.setVisible(true);
	}
	
}







