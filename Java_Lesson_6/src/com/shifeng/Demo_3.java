
/*
 * JPanel组件：
 * 注意事项：
 * 1.JPanel是JComponnet的子类
 * 2.属于容器类组件，可以加入别的组件
 * 3.默认布局管理器是流布局
 * 
 * */

package com.shifeng;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Demo_3 extends JFrame{

	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	JPanel jp1,jp2;
    public static void main(String [] args) {
    	
    	Demo_3 demo_3 = new Demo_3();
    }
    
    public Demo_3 () {
		jb1 = new JButton("西瓜");
		jb2 = new JButton("苹果");
		jb3 = new JButton("荔枝");
		jb4 = new JButton("葡萄");
		jb5 = new JButton("橘子");
		jb6 = new JButton("香蕉");
		
		// JPanel布局默认的布局模式就是流布局(上的组件是默认中心对齐的)
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		// 添加按钮到JPanel上
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		// 将JPanel添加到JFrame上
		this.add(jp1, BorderLayout.NORTH);
		this.add(jp2, BorderLayout.SOUTH);
		this.add(jb6, BorderLayout.CENTER);
		
		this.setTitle("我是混合布局");
		this.setSize(300, 300);
		this.setLocation(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}








