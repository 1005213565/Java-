
/*
 * 功能：小球移动（加深对事件处理机制的理解）
 * 1.通过上下左右键，来控制一个小球的位置
 * 
 * */

package com.shifeng1;
import javax.sql.rowset.JdbcRowSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Demo_2 extends JFrame {

	MyPanel myPanel  = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo_2 demo_2 = new Demo_2();
	}
	
	public Demo_2() {
		// TODO Auto-generated constructor stub
		myPanel = new MyPanel();
		myPanel.setBackground(Color.black);
		this.add(myPanel);
		this.addKeyListener(myPanel);
		
		// 实现监听
		this.addKeyListener(myPanel);
		
		this.setSize(400,400);
		this.setLocation(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	} 

}

// 定义自己的面板   KeyListener键盘监听
class MyPanel extends JPanel implements KeyListener{
	
	int x = 10;
	int y = 10;
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.setColor(Color.red);
		graphics.fillOval(this.x, this.y, 20, 20);
	}

	@Override
	// 键的一个值被输出
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	// 按下去
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("键盘被按下去的键是"+e.getKeyCode());
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("点击了向下的键");
			y++;
		}else if (e.getKeyCode() == KeyEvent.VK_UP) {
			System.out.println("点击了向上的键");
			y--;
		}else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("点击了向左的键");
			x--;
		}else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("点击了向右的键");
			x++;
		}
		this.repaint();
	}

	@Override
	// 键盘弹上
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}