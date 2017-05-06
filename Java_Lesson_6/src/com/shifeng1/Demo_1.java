
/*
 * 功能：讲解事件处理机制
 * 
 * */
package com.shifeng1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Demo_1 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel myPanel = null;
	JButton button1,button2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo_1 demo_1 = new Demo_1();
		
	}

	public Demo_1 () {
		
		myPanel = new JPanel();
		myPanel.setBackground(Color.black);
		button1 = new JButton("黑色");
		button2 = new JButton("红色");
		
		this.add(myPanel);
		this.add(button1,BorderLayout.NORTH);
		this.add(button2, BorderLayout.SOUTH);
		
		// 注册监听，一个事件可以被多人监听
		button1.addActionListener(this);
		button2.addActionListener(this);
		button1.addActionListener(new Cat());
		button2.addActionListener(new Cat());
		// 指定action命令
		button1.setActionCommand("黑色");
		button2.setActionCommand("红色");
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	@Override
	// 事件处理方法(监听)
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("黑色")) {
			System.out.println("点击了黑色");
			myPanel.setBackground(Color.black);
		}else if (e.getActionCommand().equals("红色")) {
			System.out.println("点击了红色");
			myPanel.setBackground(Color.red);
		}
		
	}

}

class Cat implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("黑色")) {
			System.out.println("猫也知道你点击了黑色");
		
		}else if (e.getActionCommand().equals("红色")) {
			System.out.println("猫也知道你点击了红色");

		}
	}
	
}


//class MyPanel extends JPanel {
//	
//	public void paint(Graphics g) {
//		super.paint(g);
//		g.setColor(Color.cyan);
//		g.fillRect(0, 0, 200,200);
//	}
//}















