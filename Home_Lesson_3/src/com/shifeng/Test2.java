/*
 * 流式布局：默认是居中对齐的
 * 注意事项：
 * 1.不限制他所管理的组件大小，允许他们有最佳大小
 * 2.当容器被缩放时，组件的位置可能变化，但组件的大小不变
 * 3.默认组件的大小是居中对齐，可以通过this.setLayout(new FlowLayout(FlowLayout.LEFT));的方式来制定对齐方式
 * */

package com.shifeng;
import java.awt.FlowLayout;
import java.time.Year;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test2 extends JFrame{

	// 定义需要的组件
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 test2 = new Test2();
	}

	public Test2 () {
		// 创建组件
		jb1 = new JButton("关羽");
		jb2 = new JButton("张飞");
		jb3 = new JButton("赵云");
		jb4 = new JButton("黄忠");
		jb5 = new JButton("马超");
		jb6 = new JButton("魏延");
		
		jb1.setSize(100, 100);
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		
		// 设置布局管理器
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		// 不使用布局管理器，这样就可以设置容器内按钮的大小（否则设置的按钮大小不起作用）
		this.setLayout(null);
		
		this.setTitle("流式布局");
		this.setSize(300, 300);
		this.setLocation(500, 500);
		// 禁止用户改变窗体大小
		this.setResizable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}










