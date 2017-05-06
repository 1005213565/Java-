
/*
 * 功能：数组查找
 * 
 * 
 * 查找：
 * 1.顺序查找
 * 2.二分查找
 * 3.二叉树查找
 
 * */

package com.UsbTest;

public class FindList {

	public static void main(String [] args) {
		
		int arr[] = {2,4,4,7,8,8,8,12,12,15};
		BinaryFind b = new BinaryFind();
		b.find(0, arr.length - 1, 4, arr);
	}
}

// 二分查找
class BinaryFind {
	
	public void find(int leftIndex, int rightIndex, int val, int arr[]) {
		
		// 首先找到中间的数
		int mindIndex = (rightIndex + leftIndex)/2;
		int mindVal = arr[mindIndex];
		
		if (leftIndex <=  rightIndex) {
			//如果要找到的数比mindVal小
			if(mindVal > val) {
				
				// 在arr数组的左边去找 
				find(leftIndex,mindIndex - 1,val, arr);
			}else if(mindVal < val) {
				// 在arr的右边去找
				find(mindIndex+1,rightIndex,val,arr);
			}else {
				System.out.println("找到下标"+mindIndex);
				
			}
		}
		
	}
}





