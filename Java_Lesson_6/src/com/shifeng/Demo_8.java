
/*
 * qq聊天界面
 * 1.JTextArea多行文本框组件
 * */

package com.shifeng;
import java.awt.BorderLayout;

import javax.swing.*;

public class Demo_8 extends JFrame{

	JTextArea textArea;
	JPanel panel;
	JComboBox comboBox;
	JTextField textField;
	JButton button;
	JScrollPane scrollPane;
	public static void main(String []args) {
		Demo_8 demo_8 = new Demo_8();
	}
	public Demo_8 () {
		textArea = new JTextArea();
		// 把多行输入放发哦scrollPane中
		scrollPane = new JScrollPane(textArea);
		panel = new JPanel();
		String chatter[] = {"布什","拉登"};
		comboBox = new JComboBox<>(chatter);
		textField = new JTextField(10);
		button = new JButton("发送");
		
		// 设置布局
		
		// 添加组件
		panel.add(comboBox);
		panel.add(textField);
		panel.add(button);
		
		// 加入到JFrame上
		this.add(scrollPane);
		this.add(panel,BorderLayout.SOUTH);
		this.setTitle("聊天");
		// (new ImageIcon("Images/head_icon.png")).getImage()获得image
		this.setIconImage((new ImageIcon("Images/head_icon.png")).getImage());
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
