
/*
 * 选择框组件，和复选框组件
 * 1.复选框组件：JCheckBox
 * 2.单选框组件：JRadioButton
 * 
 * 
 * */

package com.shifeng;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Demo_5 extends JFrame{

	JPanel panel1,panel2,panel3;
	JLabel label1,label2;
	JCheckBox checkBox1,checkBox2,checkBox3;
	JRadioButton radioButton1,radioButton2;
	ButtonGroup bGroup;
	JButton button1,button2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo_5 demo_5 = new Demo_5();
	}

	public Demo_5 () {
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		
		label1 = new JLabel("选择你喜欢的运动");
		label2 = new JLabel("选择你的性别");
		
		checkBox1 = new JCheckBox("足球");
		checkBox2 = new JCheckBox("篮球");
		checkBox3 = new JCheckBox("乒乓球");
		
		bGroup = new ButtonGroup();
		radioButton1 = new JRadioButton("男");
		radioButton2 = new JRadioButton("女");
		
		button1 = new JButton("注册用户");
		button2 = new JButton("取消注册");
		
		this.setLayout(new GridLayout(3, 1));
		
		panel1.add(label1);
		panel1.add(checkBox1);
		panel1.add(checkBox2);
		panel1.add(checkBox3);
		
		panel2.add(label2);
		bGroup.add(radioButton1);
		bGroup.add(radioButton2);
		panel2.add(radioButton1);
		panel2.add(radioButton2);
		
		panel3.add(button1);
		panel3.add(button2);
		
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		
		this.setTitle("用户注册界面");
		this.setSize(400, 200);
		this.setLocation(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}












