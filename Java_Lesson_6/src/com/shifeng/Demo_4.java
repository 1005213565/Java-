
/*
 * 文本框(JTextField)、密码框(JPasswordField)、标签组件(JLabel)
 * 
 * 
 * */

package com.shifeng;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Demo_4 extends JFrame{

	JTextField textField;
	JPasswordField passwordField;
	JLabel label1,label2;
	JButton button1,button2;
	JPanel panel1,panel2,panel3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo_4 demo_4 = new Demo_4();
		
	}
	
	public Demo_4() {
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		
		label1 = new JLabel("账号");
		label2 = new JLabel("密码");
		
		textField = new JTextField(10); // 设置宽度
		passwordField  = new JPasswordField(10); // 设置宽度
		
		button1 = new JButton("确认");
		button2 = new JButton("取消");
		
		// 设置布局管理器
		this.setLayout(new GridLayout(3, 1));
		
		panel1.add(label1);
		panel1.add(textField);
		panel2.add(label2);
		panel2.add(passwordField);
		panel3.add(button1);
		panel3.add(button2);
		
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		
		this.setTitle("会员管理系统");
		this.setSize(300, 200);
        this.setLocation(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
	}

}



