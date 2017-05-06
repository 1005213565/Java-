
/*数组
 * 功能：各种排序
 * 1.冒泡排序
 * 2.选择排序
 * 3.插入排序
 * 4.快速排序（耗内存）
 * 5.选堆排序
 * 6.希尔排序法
 * 7.合并排序法 （外部排序法）
 * 
 * 
 * */

package com.UsbTest;

import java.util.*;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int len = 200000;
		int arr[] = new int[len];
		for (int i = 0; i < len; i++) {

			// 让程序随机产生一个1 - 10000的数
			// Math.random()会随机产生一个0-1的数
			int t = (int) (Math.random() * len);
			arr[i] = t;
		}

		// Bubble b = new Bubble();
		// b.sort(arr);

		InsertSort insert = new InsertSort();
		insert.sort(arr);

		Select s = new Select();
		s.sort(arr);

		// 打印
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("插入排序" + arr[i]);
//		}
	}

}


/*
 * 插入排序: 插入排序的基本意思是：把n个待排序的元素看成是一个有序表和一个无序表。开始时有序表中值包含一个
 * 元素。无序表中包含有n-1个元素；排序过程中每次从无序表中取出第一个元素。把它的排序码依次与有序元
 * 素的排序码进行比较，将它插入到有序表中的适当位置，使之成为新的有序表
 * 
 * 例如，n = 6,数组R的六个排序，码分别为：17，3，25，14，20，9.它的直接插入排序的执行过程
 * 
 */
class InsertSort {
	public void sort(int arr[]) {
		Calendar cal = Calendar.getInstance();
		System.out.println("插入排序开始系统时间" + cal.getTime());

		for (int i = 1; i < arr.length; i++) {
			int insertVal = arr[i];
			// insertVal准备和前一个数比较
			int index = i - 1;
			while (index >= 0 && insertVal < arr[index]) {
				// 将把arr[index]向后移动
				arr[index + 1] = arr[index];
				// 让index向前移动
				index--;
			}

			// 将inserval插入到适当位置
			arr[index + 1] = insertVal;
		}
		Calendar cal1 = Calendar.getInstance();
		System.out.println("插入排序结束系统时间" + cal1.getTime());

	}
}

/* 选择排序 */
class Select {
	// 选择排序
	public void sort(int arr[]) {

		Calendar cal = Calendar.getInstance();
		System.out.println("选择排序开始系统时间" + cal.getTime());

		int temp = 0;
		for (int j = 0; j < arr.length - 1; j++) {

			// 我认为第一个数是最小的
			int min = arr[j];
			// 记录最小数的小标
			int minIndex = j;

			for (int k = j + 1; k < arr.length - 1; k++) {
				if (min > arr[k]) {
					//
					min = arr[k];
					minIndex = k;
				}
			}
			// 当退出for循环找出这次的最小值
			temp = arr[j];
			arr[j] = arr[minIndex];
			arr[minIndex] = temp;

		}
		Calendar cal1 = Calendar.getInstance();
		System.out.println("选择排序结束系统时间" + cal1.getTime());

	}
}

/* 冒泡排序 */
class Bubble {

	// 排序方法
	public void sort(int arr[]) {
		Calendar cal = Calendar.getInstance();
		System.out.println("冒泡排序开始系统时间" + cal.getTime());
		// 冒泡排序
		// 外层循环
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		Calendar cal1 = Calendar.getInstance();
		System.out.println("冒泡排序结束系统时间" + cal1.getTime());
	}
}