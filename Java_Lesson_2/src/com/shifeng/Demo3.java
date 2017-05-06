
/*
 * 丢手帕问题：
 * 
 * */
package com.shifeng;

public class Demo3 {

	public static void main(String[] args) {
		CycLink cyclink = new CycLink();
		cyclink.setLen(5);
		cyclink.createLink();
		cyclink.setK(2);
		cyclink.setM(2);
		cyclink.show();
		
		cyclink.play();
	}
}

// 节点
class Child {
	int no; // 编号
	Child nextChild; // 指的是非第一个小孩

	public Child(int no) {
		this.no = no; // 给一个编号
	}
}

// 环形链表
class CycLink {

	// 先定义一个指向链表第一个小孩的引用
	// 指向第一个小孩的引用，不能动
	Child firstChild = null;
	Child temp = null; // 中介小孩
	int len = 0; // 表示共有几个小孩
	int k = 0;
	int m = 0;

	// 设置链表的大小
	public void setLen(int len) {
		this.len = len;
	}

	// 设置从第几个人开始数数
	public void setK(int k) {
		this.k = k;
	}

	// 设置m
	public void setM(int m) {
		this.m = m;
	}

	// 开始play
	public void play() {
		Child temp = this.firstChild;
		// 1.先找到开始数数的人
		for (int i = 1; i < k; i++) {

			temp = temp.nextChild;
		}

		while (this.len != 1) {
			// 2.数m下
			for (int j = 1; j < this.m; j++) {
				temp = temp.nextChild;
			}
			// 找到要出圈的前一个小孩
			Child temp2 = temp;
			while (temp2.nextChild != temp) {
				temp2 = temp2.nextChild;
			}

			// 3.将数到m的小孩，退出圈
			temp2.nextChild = temp.nextChild;
			// 让temp指向下一个数数的小孩
			temp = temp.nextChild;

			this.len--;
		}
		// 最后一个小孩
		System.out.println("最后一个小孩是"+temp.no);
	}

	// 初始化环形链表
	public void createLink() {
		for (int i = 1; i <= len; i++) {

			if (i == 1) {
				// 创建第一个小孩
				Child ch = new Child(i);
				this.firstChild = ch;
				this.temp = ch;
			} else if (i == len) {
				// 最后一个小孩
				Child ch = new Child(i);
				temp.nextChild = ch; // 上一个小孩的下一个小孩是本次创建的小孩
				ch.nextChild = this.firstChild; // 本次创建的小孩的下一个小孩就是第一个小孩
			} else {
				// 继续创建小孩
				Child ch = new Child(i);
				temp.nextChild = ch; // 下一个小孩
				temp = ch; // 搭桥的小孩
			}
		}
	}

	// 打印环形链表
	public void show() {
		// 定义一个跑龙套
		Child temp = this.firstChild;
		do {
			System.out.println("编号" + temp.no);
			temp = temp.nextChild;
		} while (temp != this.firstChild);
	}
}
