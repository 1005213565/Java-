
/*
 * swing实战
 * 
 * 1.拆分窗格：JSplitPane属于容器类组件,本身就是边界布局的
 * 
 * */

package com.shifeng;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
public class Demo_7 extends JFrame{

	JSplitPane splitPane;
	JList list;
	JLabel label;
	public static void main (String [] args) {
		Demo_7 demo_7 = new Demo_7();
		
	}
	
    public Demo_7 () {
		String words[] = {"陕西","云南","山西","河南"};
		list = new JList(words);
		label = new JLabel(new ImageIcon("Images/bg_icon.png"));
		// 可拆分窗格  HORIZONTAL_SPLIT(水平拆分)
		splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, list, label );
		// 可以伸缩
		splitPane.setOneTouchExpandable(true);
		// 设置布局管理器
		
		// 添加组件(边界布局不设置位置是默认添加到中间的)
		this.add(splitPane,BorderLayout.CENTER);
		this.setSize(400,300);
		this.setLocation(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}






