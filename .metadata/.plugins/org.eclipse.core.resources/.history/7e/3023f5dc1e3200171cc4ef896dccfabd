
/*
 * 功能：坦克游戏的1.0
 * 1.画出坦克
 * 2.坦克能动
 * 3.坦克能发子弹
 * 4.坦克能连发子弹(最多只能是5颗)
 * 5.击中敌人坦克的时候，敌人坦克消失
 * 6.爆炸效果
 * 7.控制敌人坦克自由移动
 * 8.控制坦克在一定范围内移动
 * 9.当敌人的坦克击中我的坦克的时候，我的坦克爆炸
 * 10.设置我的坦克数量，并且死亡之后，继续出击，直到没有为止
 * 11.控制敌人的坦克不重叠
 * */

package com.shifeng1;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Vector;

public class MyTankGame1 extends JFrame {

	MyPanel mPanel = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTankGame1 myTankGame1 = new MyTankGame1();
	}

	// 构造函数
	public MyTankGame1() {
		mPanel = new MyPanel();
		Thread thread = new Thread(mPanel);
		thread.start();
		mPanel.hero.spend = 3;
		this.add(mPanel);
		this.addKeyListener(mPanel); // 对面板进行监听

		this.setTitle("坦克游戏");
		this.setSize(700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

// 我的面板
class MyPanel extends JPanel implements KeyListener, Runnable {

	// 定义一个我的显示的坦克，和我的坦克数量集合
	Hero hero = null;
	Vector<Hero> vectorHero = new Vector<Hero>();
	// 我的坦克数量
	int heroNumber = 3;
		
		
	// 定义敌人的坦克集合
	Vector<EnemyTank> vectorET = new Vector<EnemyTank>();
	// 敌人坦克数量
	int etNumber = 6;
  
	// 定义炸弹集合
	Vector<Bomb> bombs = new Vector<Bomb>();
	
	// 定义三张图片,才能组成一颗炸弹
	Image image1 = null;
	Image image2 = null;
	Image image3 = null;

	// 构造函数
	public MyPanel() {
		// 初始化我的所有坦克
		for (int i = 0; i < this.heroNumber; i++) {
			Hero hero1 = new Hero(180, 200);
			this.vectorHero.add(hero1);
		}
		// 找出我目前要歼灭敌军的坦克
	   if (this.heroNumber >0) {
		
		   hero = this.vectorHero.get(0);
	   }
		

		// 初始化敌人坦克
		for (int i = 0; i < etNumber; i++) {
			EnemyTank enemyTank = new EnemyTank((i + 1) * 50, 0);
			enemyTank.direction = (int) (Math.random() * 4); // 给敌人的坦克开始一个随机方向
			enemyTank.color = 1;
			// 启动敌人坦克
			Thread thread = new Thread(enemyTank);
			thread.start();
			// 给敌人坦克添加一颗子弹
            Shot shot = null;
            Thread thread2 = null; 
			switch (enemyTank.direction) {
			case 0:{
				shot = new Shot(enemyTank.x + 9, enemyTank.y, enemyTank.direction);
				enemyTank.vector.add(shot);
			}
				break;
			case 1:{
				shot = new Shot(enemyTank.x + 9, enemyTank.y + 30, enemyTank.direction);
				enemyTank.vector.add(shot);
			}
				break;
			case 2:{
				shot = new Shot(enemyTank.x, enemyTank.y + 9, enemyTank.direction);
				enemyTank.vector.add(shot);
			}
				break;
			case 3:{
				shot = new Shot(enemyTank.x + 30, enemyTank.y+9, enemyTank.direction);
				enemyTank.vector.add(shot); 
			}
				break;

			default:
				break;
			}
			thread2 = new Thread(shot);
			// 启动敌人坦克的子弹线程
			thread2.start();

			vectorET.add(enemyTank);
		}

		try {
			// 初始化图片,这样可以避免第一次爆炸不明显
			image1 = ImageIO.read(new File("src/bomb_1.gif"));
			image2 = ImageIO.read(new File("src/bomb_2.gif"));
			image3 = ImageIO.read(new File("src/bomb_3.gif"));
			System.out.println("画出图片"+image1);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		// 初始化图片
//		image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
//		image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
//		image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));
	}

	// 重写paint
	public void paint(Graphics g) {

		super.paint(g);
		// 活动区域
		g.fillRect(0, 0, 400, 300);

		// 从集合中找出每个子弹并画出
		for (int i = 0; i < hero.vector.size(); i++) {
			Shot myShot = hero.vector.get(i);
			// 画出子弹
			if (myShot != null && myShot.isLive == true) { // 当坦克创建出来的时候，子弹还没有被创建
				g.setColor(Color.cyan);
				g.fillOval(myShot.x, myShot.y, 2, 2);
			}
			if (myShot.isLive == false) { // 子弹死亡
				// 移除掉该子弹
				hero.vector.remove(myShot);
			}
		}

		// 画出炸弹
		for (int i = 0; i < bombs.size(); i++) {
			System.out.println("有爆炸");

			Bomb bomb = bombs.get(i);
			if (bomb.life > 6) {
				g.drawImage(image1, bomb.x, bomb.y, 30, 30, this);
			} else if (bomb.life > 3) {
				g.drawImage(image2, bomb.x, bomb.y, 30, 30, this);
			} else {
				g.drawImage(image3, bomb.x, bomb.y, 30, 30, this);
			}
			// 让炸弹的生命值减少
			bomb.lifeDown();
			// 如果炸弹生命值为0，炸弹就该消失了
			if (bomb.life == 0) {
				bombs.remove(bomb);
			}
		}

		// 画出自己的坦克
		if (hero.isLive) { // 如果我的目前显示的坦克活着，则显示
			this.drawTank(hero.x, hero.y, g, hero.direction, 0);
		}else {
			this.vectorHero.remove(hero);
			// 如果我的坦克死亡，则看我的坦克库中还有没有我的坦克，有的话，继续歼灭敌人
			if (this.vectorHero.size() > 0) {
				hero = this.vectorHero.get(0);
				hero.spend = 3;
			}
		}
		
		
		
		// 画出敌人坦克和敌人坦克子弹
		for (int i = 0; i < this.etNumber; i++) {
			EnemyTank enemyTank = vectorET.get(i);
			enemyTank.spend = 2;
			if (enemyTank.isLive) { // 坦克是否死亡

				this.drawTank(enemyTank.x, enemyTank.y, g, enemyTank.direction, 1);
				// 画出敌人坦克的子弹
				for (int j = 0; j < enemyTank.vector.size(); j++) {
					// 取出子弹
					Shot shot = enemyTank.vector.get(j);
//					System.out.println("画出了敌人的子弹活着="+shot.isLive);
					if (shot.isLive) {
						// 画出敌人子弹
						g.setColor(Color.red);
						g.fillOval(shot.x, shot.y, 2, 2);
//						System.out.println("画出了敌人的子弹");
					}else { // 敌人坦克死亡
						enemyTank.vector.remove(shot);
					}
				}
			}

		}
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
	
	// 判断敌人的子弹是否击中我的坦克
	public void EnemyTankHitMyTank(Shot shot, Hero hero) {
		// 判断该坦克的方向
				switch (hero.direction) {
				case 0:
				case 1: {
					if (shot.x >= hero.x && shot.x <= hero.x + 20 && shot.y >= hero.y
							&& shot.y <= hero.y + 30) {

						// 击中坦克
						shot.isLive = false; // 子弹死亡
						hero.isLive = false;
						// 创建炸弹
						Bomb bomb = new Bomb(hero.x, hero.y);
						// 将炸弹放入集合中
						bombs.add(bomb);
					}
				}
					break;
				case 2:
				case 3: {
					if (shot.x >= hero.x && shot.x <= hero.x + 30 && shot.y >= hero.y
							&& shot.y <= hero.y + 20) {

						shot.isLive = false; // 子弹死亡
						hero.isLive = false;
						// 创建炸弹
						Bomb bomb = new Bomb(hero.x, hero.y);
						// 将炸弹放入集合中
						bombs.add(bomb);
					}
				}
					break;

				default:
					break;
				}
	}
	

	// 子弹是否集中敌人坦克的时候,移除敌人该坦克
	public void hitTank(Shot shot, EnemyTank enemyTank) {

		// 判断该坦克的方向
		switch (enemyTank.direction) {
		case 0:
		case 1: {
			if (shot.x >= enemyTank.x && shot.x <= enemyTank.x + 20 && shot.y >= enemyTank.y
					&& shot.y <= enemyTank.y + 30) {

				// 击中坦克
				shot.isLive = false; // 子弹死亡
				enemyTank.isLive = false;
				// 创建炸弹
				Bomb bomb = new Bomb(enemyTank.x, enemyTank.y);
				// 将炸弹放入集合中
				bombs.add(bomb);
			}
		}
			break;
		case 2:
		case 3: {
			if (shot.x >= enemyTank.x && shot.x <= enemyTank.x + 30 && shot.y >= enemyTank.y
					&& shot.y <= enemyTank.y + 20) {

				shot.isLive = false; // 子弹死亡
				enemyTank.isLive = false;
				// 创建炸弹
				Bomb bomb = new Bomb(enemyTank.x, enemyTank.y);
				// 将炸弹放入集合中
				bombs.add(bomb);
			}
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
		g.drawRect(x, y + 15, 30, 5);
		// 3.画出剩下的
		g.drawRect(x + 5, y + 5, 20, 10);
		g.fillOval(x + 10, y + 5, 10, 10);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_DOWN) { // 坦克向下跑
			hero.direction = 1;
			hero.directDownMove();
			System.out.println("我的坦克向下跑");
		} else if (e.getKeyCode() == KeyEvent.VK_UP) { // 坦克向上跑
			hero.direction = 0;
			hero.directUpMove();
			System.out.println("我的坦克向上跑");
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) { // 坦克向左
			hero.direction = 2;
			hero.directLeftMove();
			System.out.println("我的坦克向左跑");
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // 坦克向右
			hero.direction = 3;
			hero.directRightMove();
			System.out.println("我的坦克向右跑");
		}

		if (e.getKeyCode() == KeyEvent.VK_J) { // 点击j键（一遍跑一遍发子弹）

			if (this.hero.vector.size() < 5) { // 当子弹发了5颗之后就不能发了
				// 开火
				hero.shotEnemy();
				System.out.println("开火");
			}
		}
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	// 线程重写
	@Override
	public void run() {
		// TODO Auto-generated method stub

		// 每隔100毫秒去重绘制
		while (true) {

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// 判断自己子弹是否击中敌人坦克
			for (int i = 0; i < hero.vector.size(); i++) {
				Shot myShot = hero.vector.get(i);
				if (myShot.isLive) {
					for (int j = 0; j < this.vectorET.size(); j++) {
						EnemyTank enemyTank = this.vectorET.get(j);
						if (enemyTank.isLive) {
							this.hitTank(myShot, enemyTank);
						}
					}
				}
			}

			// 判断敌人的子弹是否击中我的坦克
			for (int i = 0; i < this.vectorET.size(); i++) {
				EnemyTank enemyTank = this.vectorET.get(i);
				if (enemyTank.isLive) {
					for (int j = 0; j < enemyTank.vector.size(); j++) {
						Shot enemyShot = enemyTank.vector.get(j);
						this.EnemyTankHitMyTank(enemyShot, hero);
					}
				}
			}
			
			
			// 判断我的坦克库中还有没有我的坦克，如果没有则游戏结束
			if (this.vectorHero.size() <= 0) {
				// 游戏结束
				
//				break;
			}
			
			this.repaint();
		}
	}

}
