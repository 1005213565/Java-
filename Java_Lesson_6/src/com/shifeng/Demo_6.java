
/*
 *1.下拉框组件：JComboBox
 *2.列表框组件：JList
 *3.滚动窗格组件JScrollPane
 **/
package com.shifeng;

import java.awt.GridLayout;

import javax.swing.*;

public class Demo_6 extends JFrame{

	JPanel panel1,panel2;
	JLabel label1,label2;
   JComboBox comboBox;
   JList list;
	JScrollPane scrollPane;
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo_6 demo_6 = new Demo_6();
	}

	public Demo_6() {
		// TODO Auto-generated constructor stub
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		label1 = new JLabel("你的籍贯");
		label2 = new JLabel("旅游地点");
		
		String place[] = {"西安","咸阳","天津","北京","月亮"};
		comboBox = new JComboBox<String>(place);
		
		String tourist[] = {"杭州","天上人间","黄山","华山","嵩山","泰山"};
		list = new JList<String>(tourist);
		// 设置你希望显示多少个选项
		list.setVisibleRowCount(4);
		// 创建滚动把列表放入
		scrollPane = new JScrollPane(list);
		
		
		this.setLayout(new GridLayout(3, 1));
		
		panel1.add(label1);
		panel1.add(comboBox);
		
	    panel2.add(label2);
	    panel2.add(scrollPane);
	    
	    this.add(panel1);
	    this.add(panel2);
	    
	    this.setTitle("旅游地点选取");
	    this.setSize(400, 500);
	    this.setLocation(400, 400);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	    
	   
	}
}










