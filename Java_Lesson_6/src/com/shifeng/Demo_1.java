
/*
 * 功能：gui界面开发
 * 有：JFrame(相当也window)、JButton
 * 
 * 1.JButton是AbstractButton的子类
 * 2.属于容器类，可以加入别的组件
 * 3.Swing包的按钮组件还有单选按钮、触发器按钮、等
 * 
 * 
 * 布局管理器：组件在容器中的位置和大小是由布局管理器来决定的，所有的容器都会使用
 *                         一个布局管理器，通过他来自动进行组件的布局管理。
 *  布局管理器种类：
 *  1.流式布局管理器(FlowLayout)
 *  2.边界布局管理器(BorderLayout)
 *  3.网格布局管理器(GridLayout)
 *  4.卡片布局管理器(GardLayout)
 *  5.网格包布局管理器(GridBagLayout)
 *  其中前三种是最常见的
 *  
 *  
 *  
 *  
 * */
package com.shifeng;
//import java.awt.*;

//import javax.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo_1 extends JFrame{

   // 把需要的swing组件定义在这
	JButton jButton = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo_1 demo_1 = new Demo_1();
	}
	
	// 构造函数此类直接继承自JFrame
	public Demo_1() {
		// JFrame是一个顶层容器类（可以添加其他swing组件的类）
//				JFrame jFrame = new JFrame();
				// 按钮
				 jButton = new JButton("我是一个按钮");
				// 添加按钮到JFrame上（添加按钮必须要写在jframe显示前面，否则不显示）
				this.add(jButton);
					
				// 给窗体设置标题
				this.setTitle("hello,world");
				// 设置大小
				this.setSize(300, 300);
				// 设置初始位置
				this.setLocation(100, 100);
				// 设置默认关闭窗口，保证jvm虚拟机也退出
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
				// 显示
				this.setVisible(true);
	}
}















