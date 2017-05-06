
/*
 * 作业点评：
 * 
 * 
 * */

package com.shifeng;

import java.util.*;
import java.io.*;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Judge judge = new Judge();
		System.out.println("最后的平均成绩是="+judge.lastFen());
	}

}

// 评委打分
class Judge {

	// 定义一个可以存放8个小数数组
	float fens[] = null;
	int size = 8;

	// 构造函数
	public Judge() {
		fens = new float[size];
		// 初始化
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader bReader = new BufferedReader(isReader);

		try {
			for (int i = 0; i < fens.length; i++) {
				System.out.println("请输入第" + (i + 1) + "个裁判的成绩");
				fens[i] = Float.parseFloat(bReader.readLine());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 得到运动员的最后得分
	public float lastFen() {
		// 1.去掉最低分（目的就是找到最低分的下标）
		int minIndex = this.getLowFen();
		// 2.去掉最高分
		int maxIndex = this.getHighFen();
		// 3.求平均分
		float totalFen = 0.0f; // 总分
		for (int i = 0; i < fens.length; i++) {
			if (i != minIndex && i != maxIndex) {
				totalFen += fens[i];
			}
		}
		float avFen = totalFen / (fens.length - 2);
		return avFen;
	}

	// 得到最低分下标
	private int getLowFen() {
		// 选择法
		// 认为第一个就是最低分
		float minFen = fens[0];
		int minIndex = 0;
		for (int i = 1; i < fens.length; i++) {
			if (minFen > fens[i]) {
				minFen = fens[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	// 得到最高分下标
	private int getHighFen() {
		// 选择法
		// 认为第一个就是最低分
		float maxFen = fens[0];
		int maxIndex = 0;
		for (int i = 1; i < fens.length; i++) {
			if (maxFen < fens[i]) {
				maxFen = fens[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}
