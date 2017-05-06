package com.shifeng1;

import java.security.Timestamp;
import java.util.Vector;

//坦克类
class Tank { // 对坦克类实行监听
	// 坦克坐标
	int x = 0;
	int y = 0;

	// 坦克方向
	int direction = 0;

	// 坦克的速度
	int spend = 1;

	// 定义坦克颜色
	int color;

	// 坦克发射炮弹

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
}

// 敌人的坦克，把敌人坦克做成线程
class EnemyTank extends Tank implements Runnable {

	boolean isLive = true;
	// 定义一个集合，存放敌人的子弹
	Vector<Shot> vector = new Vector<Shot>();
	// 敌人添加子弹，应该放在敌人刚创建坦克，和敌人的坦克子弹死亡后

	// 定义一个向量，可以访问到MyPanel上的所有敌人坦克
	Vector<EnemyTank> vectorET = new Vector<EnemyTank>();

	public EnemyTank(int x, int y) {
		super(x, y);

	}

	// 得到MyPanel的敌人坦克向量
	public void setETs(Vector<EnemyTank> vector) {
		this.vectorET = vector;
	}

	// 判断是否碰到了别人的坦克
	public boolean isTouchOtherEnemy() {
		boolean b = false; // 初始值是没有碰到
		switch (this.direction) {
		case 0: {
			// 取出所有的敌人坦克
			for (int i = 0; i < this.vectorET.size(); i++) {
				// 取出坦克
				EnemyTank enemyTank = this.vectorET.get(i);
				if (enemyTank != this) { // 判断此坦克不是他自己

					if (enemyTank.direction == 0 || enemyTank.direction == 1) {
						if (this.x >= enemyTank.x && this.x <= enemyTank.x + 20 && this.y >= enemyTank.y
								&& this.y <= enemyTank.y + 30) {
							return true;
						}
						if (this.x + 20 >= enemyTank.x && this.x + 20 <= enemyTank.x + 20 && this.y >= enemyTank.y
								&& this.y <= enemyTank.y + 30) {
							return true;
						}
					}
					if (enemyTank.direction == 2 || enemyTank.direction == 3) {
						if (this.x >= enemyTank.x && this.x <= enemyTank.x + 30 && this.y >= enemyTank.y
								&& this.y <= enemyTank.y + 20) {
							return true;
						}
						if (this.x + 20 >= enemyTank.x && this.x + 20 <= enemyTank.x + 30 && this.y >= enemyTank.y
								&& this.y <= enemyTank.y + 20) {
							return true;
						}
					}

				}
			}
		}
			break;
		case 1: { // 我的坦克向上或者向下
					// 取出所有的敌人坦克
			for (int i = 0; i < this.vectorET.size(); i++) {
				// 取出坦克
				EnemyTank enemyTank = this.vectorET.get(i);
				if (enemyTank != this) { // 判断此坦克不是他自己

					if (enemyTank.direction == 0 || enemyTank.direction == 1) {

						if (this.x >= enemyTank.x && this.x <= enemyTank.x + 20 && this.y + 30 >= enemyTank.y
								&& this.y + 30 <= enemyTank.y + 30) {
							return true;
						}

						if (this.x + 20 >= enemyTank.x && this.x + 20 <= enemyTank.x + 20 && this.y + 30 >= enemyTank.y
								&& this.y + 30 <= enemyTank.y + 30) {
							return true;
						}
					}
					if (enemyTank.direction == 3 || enemyTank.direction == 2) {
						if (this.x >= enemyTank.x && this.x <= enemyTank.x + 30 && this.y + 30 >= enemyTank.y
								&& this.y + 30 <= enemyTank.y + 20) {
							return true;
						}

						if (this.x + 20 >= enemyTank.x && this.x + 20 <= enemyTank.x + 30 && this.y + 30 >= enemyTank.y
								&& this.y + 30 <= enemyTank.y + 20) {
							return true;
						}
					}
				}
			}
		}
			break;
		case 2: {
			for (int i = 0; i < this.vectorET.size(); i++) {
				// 取出坦克
				EnemyTank enemyTank = this.vectorET.get(i);
				if (enemyTank != this) { // 判断此坦克不是他自己
					if (enemyTank.direction == 0 || enemyTank.direction == 1) {
					
						if (this.x + 30 >= enemyTank.x && this.x + 30 <= enemyTank.x + 20 && this.y >= enemyTank.y
								&& this.y <= enemyTank.y + 30) {
							return true;
						}
				
						if (this.x + 30 >= enemyTank.x && this.x + 30 <= enemyTank.x + 20 && this.y + 20 >= enemyTank.y
								&& this.y + 20 <= enemyTank.y + 30) {
							return true;
						}
					}
					if (enemyTank.direction == 3 || enemyTank.direction == 2) {
						if (this.x + 30 >= enemyTank.x && this.x + 30 <= enemyTank.x + 30 && this.y >= enemyTank.y
								&& this.y <= enemyTank.y + 20) {
							return true;
						}
						if (this.x + 30 >= enemyTank.x && this.x + 30 <= enemyTank.x + 30 && this.y + 20 >= enemyTank.y
								&& this.y + 20 <= enemyTank.y + 20) {
							return true;
						}
					}
				}
			}
		}
			break;
		case 3: {
			for (int i = 0; i < this.vectorET.size(); i++) {
				// 取出坦克
				EnemyTank enemyTank = this.vectorET.get(i);
				if (enemyTank != this) { // 判断此坦克不是他自己
					if (enemyTank.direction == 0 || enemyTank.direction == 1) {
					
						if (this.x >= enemyTank.x && this.x <= enemyTank.x + 20 && this.y >= enemyTank.y
								&& this.y <= enemyTank.y + 30) {
							return true;
						}
						
						if (this.x >= enemyTank.x && this.x <= enemyTank.x + 20 && this.y + 20 >= enemyTank.y
								&& this.y + 20 <= enemyTank.y + 30) {
							return true;
						}
					}
					if (enemyTank.direction == 3 || enemyTank.direction == 2) {
						
						if (this.x >= enemyTank.x && this.x <= enemyTank.x + 30 && this.y >= enemyTank.y
								&& this.y <= enemyTank.y + 20) {
							return true;
						}
						if (this.x >= enemyTank.x && this.x <= enemyTank.x + 30 && this.y + 20 >= enemyTank.y
								&& this.y + 20 <= enemyTank.y + 20) {
							return true;
						}
					}
				}
			}
		}
			break;

		default:
			break;
		}
		System.out.println("b=" + b);
		return b;
	}

	public void directDownMove() {
		this.y += spend;
	}

	public void directUpMove() {
		this.y -= spend;
	}

	public void directLeftMove() {
		this.x -= spend;
	}

	public void directRightMove() {
		this.x += spend;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {

			// 让坦克随机产生一个新的方向
			this.direction = (int) (Math.random() * 4);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			switch (this.direction) {
			case 0: { // 向上移动

				for (int i = 0; i < 10 + (int) Math.random() * 20; i++) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (this.y > 0 && !this.isTouchOtherEnemy()) { // 控制坦克移动的范围
						this.directUpMove();
					}
					// System.out.println("向上移动="+direction);
				}
			}
				break;
			case 1: { // 向下

				for (int i = 0; i < 10 + (int) Math.random() * 40; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					if (this.y < 300 && !this.isTouchOtherEnemy()) { // 控制坦克移动的范围
						this.directDownMove();
					}
					// System.out.println("向下移动="+direction);
				}

			}
				break;
			case 2: {

				for (int i = 0; i < 10 + (int) Math.random() * 20; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					if (this.x > 0 && !this.isTouchOtherEnemy()) { // 控制坦克移动的范围
						this.directLeftMove();
					}
					// System.out.println("向左移动="+direction);
				}

			}
				break;
			case 3: {

				for (int i = 0; i < 10 + (int) Math.random() * 40; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					if (this.x < 400 && !this.isTouchOtherEnemy()) { // 控制坦克移动的范围
						this.directRightMove();
					}
					// System.out.println("向右移动="+direction);
				}

			}
				break;

			default:
				break;
			}

			// 判断敌人坦克是否死亡
			if (this.isLive == false) {
				// 让坦克死亡后退出线程
				break;
			}

			// 判断是否需要给敌人坦克加入新的子弹
			if (this.isLive) {
				if (this.vector.size() < 5) { // 没有子弹了(敌人的坦克发子弹最多发4颗)

					// System.out.println("子弹的数量=" + this.vector.size());
					Shot shot = null;
					switch (this.direction) {
					case 0: {
						shot = new Shot(this.x + 9, this.y, this.direction);
						this.vector.add(shot);
					}
						break;
					case 1: {
						shot = new Shot(this.x + 9, this.y + 30, this.direction);
						this.vector.add(shot);
					}
						break;
					case 2: {
						shot = new Shot(this.x, this.y + 9, this.direction);
						this.vector.add(shot);
					}
						break;
					case 3: {
						shot = new Shot(this.x + 30, this.y + 9, this.direction);
						this.vector.add(shot);
					}
						break;

					default:
						break;
					}
					Thread thread2 = new Thread(shot);
					// 启动敌人坦克的子弹线程
					thread2.start();
				}
			}

		}
	}
}

// 我的坦克
class Hero extends Tank {

	boolean isLive = true;
	// 存放子弹的集合
	Vector<Shot> vector = new Vector<Shot>();
	Shot shot = null; // 子弹

	Hero(int x, int y) {
		// 继承父类
		super(x, y);

	}

	// 坦克具有开火的能力
	public void shotEnemy() {

		switch (this.direction) {
		case 0: { // 坦克向上

			// 创建一个科子弹
			shot = new Shot(x + 9, y - 2, this.direction);
			// 把子弹放入集合中
			vector.add(shot);
		}
			break;
		case 1: { // 坦克向下

			shot = new Shot(x + 9, y + 30, this.direction);
			vector.add(shot);
		}
			break;
		case 2: { // 坦克向左

			shot = new Shot(x - 2, y + 9, this.direction);
			vector.add(shot);
		}
			break;
		case 3: { // 坦克向右

			shot = new Shot(x + 30, y + 9, this.direction);
			vector.add(shot);
		}
			break;

		default:
			break;
		}
		// 启动子弹线程
		Thread thread = new Thread(shot);
		thread.start();
	}

	public void directDownMove() {
		this.y += spend;
	}

	public void directUpMove() {
		this.y -= spend;
	}

	public void directLeftMove() {
		this.x -= spend;
	}

	public void directRightMove() {
		this.x += spend;
	}
}
