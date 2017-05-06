package com.shifeng;
import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;

public class Demo_10 extends JFrame{

	MyPanle mPanle = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo_10 demo_10 = new Demo_10();
	}

	public Demo_10() {
		mPanle = new MyPanle();
		this.add(mPanle);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

// 定义一个类(我自己的面板),用于绘图和显示绘图的区域
class MyPanle extends JPanel {
	
	/*
	 * Componment类提供了两个和绘图相关最重要的方法
	 * 1.paint（Graphics g）绘制组件的外观
	 *   注意：
	 *    a.首次调用该类的时候，该函数会被调用
	 *    b.窗口最小化，再最大化的时候，调用
	 *    c.repaint函数被调用
	 *    d.窗口大小有变化
	 * 2.repaint() 刷新组件的外观（当你希望图动起来需要调用）
	 * */
	
	// 覆盖JPanel中的方法paint方法  Graphics是绘图的重要类，你可以把它理解成画笔
	public void paint(Graphics g) {
		// 1.调用父类函数，来初始化，这句话是必须的
		/*
		 * Graphics类可以绘制各种图形：最基本的如下
		 * 1.画直线：drawLine
		 * 2.画矩形边框 drawRect
		 * 3.充填矩形 fillRect
		 * 4.充填椭圆 fillOval
		 * 5.画椭圆边框
		 * 6.画图片 drawImage(Image img,int x,inty)
		 * 7.画字符串 drawString(String str,int x,int y)
		 * 8.设置画笔的字体 setFont(Font font)
		 * 9.设置画笔的颜色 setColor(Color c)
		 * */
		super.paint(g);
		// 2.先画一个圆圈
		g.drawOval(10, 10, 30, 30);
		
		
		// 画直线
		g.drawLine(25, 25, 40, 40);
		
		// 画矩形边框
		g.drawRect(40, 40, 40, 40);
		
		// 画填充矩形
		// 设置矩形颜色
		g.setColor(Color.green);
		g.fillRect(50, 50, 30, 30);
		
		// 在面板上画图片
		Image img = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/caocao.png"));
		// 显示出来
		g.drawImage(img, 90, 90, 200, 150,  this);
		
		// 如何画出文字
		// 设置画笔字体和颜色  Font.BOLD粗体
		g.setColor(Color.cyan);
		g.setFont(new Font("隶书", Font.BOLD, 30));
		g.drawString("祖国万岁", 100, 100);
		
		
		
	     System.out.println("绘图被调用了");
	}
    public MyPanle () {
    	
    	    this.setBackground(Color.red);
    }
	
}
