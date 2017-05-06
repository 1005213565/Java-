
/*
 * 定义炸弹类
 * */
package com.shifeng1;

public class Bomb {

	// 定义炸弹的坐标
	int x,y;
	// 炸弹的生命,设置为9
	int life = 9;
	// 炸弹是否活着
	boolean isLive = true;
	
	public Bomb (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	// 减少生命值
	public void lifeDown() {
		if (this.life > 0) {
			this.life--;
		}else {
			this.isLive = false;
		}
	}
}
