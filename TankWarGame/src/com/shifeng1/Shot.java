package com.shifeng1;

// 子弹类
public class Shot implements Runnable {

	int x;
	int y;
	int direct = 0;
    int spend = 1;
	// 子弹是否还活着
    boolean isLive = true;
    
	public Shot(int x, int y, int direct) {
		this.x = x;
		this.y = y;
		this.direct = direct;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
		
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			switch (this.direct) {
			case 0: {

				y -= spend;
			}
				break;
			case 1: {

				y += spend;
			}
				break;
			case 2: {

				x -= spend;
			}
				break;
			case 3: {

				x += spend;
			}
				break;

			default:
				break;
			}
			
//			System.out.println("子弹的坐标x="+this.x+"y"+this.y);
			// 子弹死亡也就退出
			if (this.isLive == false) {
				break;
			}
			// 判断该子弹是否碰到边缘
			if (x <= 0 || y  <= 0 || x >= 400 || y >= 300) { // 碰到边缘
				this.isLive = false;
				break;
			}
		}
	}
}
