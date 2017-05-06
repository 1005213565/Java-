
/*
 * 功能：坦克游戏的1.0
 * 1.画出坦克
 * 
 * */

package com.shifeng2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TankGame2 extends JFrame {

	MyPanel mPanel = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TankGame2 TankGame21 = new TankGame2();
	}

	// 构造函数
	public TankGame2() {
		mPanel = new MyPanel();
		this.add(mPanel);
        this.addKeyListener(mPanel.hero); // 对我的坦克进行监听
		mPanel.hero.myPanel = mPanel;
        
		this.setTitle("坦克游戏");
		this.setSize(700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

// 我的面板
class MyPanel extends JPanel {

	// 定义一个我的坦克
	Hero hero = null;

	// 构造函数
	public MyPanel() {
		hero = new Hero(10, 10);
	}

	// 重写paint
	public void paint(Graphics g) {

		super.paint(g);
		// 活动区域
		g.fillRect(0, 0, 400, 300);

		this.drawTank(hero.x, hero.y, g, hero.direction, 1);
	}

	// 画出坦克的画图,传入坦克的初始位置和画笔、方向、类型
	public void drawTank(int x, int y, Graphics g, int direct, int type) {
		// 判断是什么类型的坦克
		switch (type) {
		case 0: // 我的坦克
			g.setColor(Color.cyan);
			break;
		case 1: // 敌人的坦克
			g.setColor(Color.red);
			break;
		default:
			break;
		}

		// 判断方向
		switch (direct) {
		case 0: {// 向上
			g.fillRect(x + 9, y, 2, 15);
			this.topOrBottomTankFram(x, y, g);
		}
			break;
		case 1: {// 向下

			g.fillRect(x + 9, y + 15, 2, 15);
			this.topOrBottomTankFram(x, y, g);
		}
			break;
		case 2: {// 向左

			g.fillRect(x, y + 9, 15, 2);
			this.leftOrRightTankFram(x, y, g);
		}
			break;
		case 3: {// 向右

			g.fillRect(x + 15, y + 9, 15, 2);
			this.leftOrRightTankFram(x, y, g);
		}
			break;
		default:
			break;
		}
	}
	
	// 向上和向下的坦克主框架
	private void topOrBottomTankFram(int x, int y, Graphics g) {
		// 1.画出左面的矩形
		g.drawRect(x, y, 5, 30);
		// 2.画出右边的矩形
		g.drawRect(x + 15, y, 5, 30);
		// 3.画出剩下的
		g.drawRect(x + 5, y + 5, 10, 20);
		g.fillOval(x + 5, y + 10, 10, 10);
	}
	
	// 向左和向右的坦克主框架
	private void leftOrRightTankFram(int x, int y, Graphics g) {
		// 1.画出上面的矩形
		g.drawRect(x, y, 30, 5);
		// 2.画出下边的矩形
		g.drawRect(x, y+15, 30, 5);
		// 3.画出剩下的
		g.drawRect(x + 5, y + 5, 20, 10);
		g.fillOval(x + 10, y + 5, 10, 10);
	}
}

// 坦克类
class Tank implements KeyListener{ // 对坦克类实行监听
	// 坦克坐标
	int x = 0;
	int y = 0;
	
	// 坦克方向
	int direction = 0;
	
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

	public Tank(int x, int y) {

		this.x = x;
		this.y = y;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

// 我的坦克
class Hero extends Tank {
	public MyPanel myPanel;
	public Hero(int x, int y) {
		// 继承父类
		super(x, y);
	}
	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_DOWN) { // 坦克向下跑
			myPanel.hero.direction = 1;
			y+=2;
			System.out.println("我的坦克向下跑");
		}else if (e.getKeyCode() == KeyEvent.VK_UP) { // 坦克向上跑
			myPanel.hero.direction = 0;
			y-= 2;
			System.out.println("我的坦克向上跑");
		}else if (e.getKeyCode() == KeyEvent.VK_LEFT) { // 坦克向左
			myPanel.hero.direction = 2;
			x-= 2;
			System.out.println("我的坦克向左跑");
		}else if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // 坦克向右
			myPanel.hero.direction = 3;
			x+= 2;
			System.out.println("我的坦克向右跑");
		}
       this.myPanel.repaint();
	}
}
