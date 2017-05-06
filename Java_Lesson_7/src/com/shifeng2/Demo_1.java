
/*
 * 文件流分类：
 * 1.字节流：可以用于读写二进制文件及任何类型文件
 * 2.字符流：可以用于读写文本文件，不能操作二进制文件
 * 
 * 
 * 功能：file类的基本用法
 * */

package com.shifeng2;
import java.io.*; // 在使用io流的时候使用

public class Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// 创建一个文件对象
//		File file = new File("/Users/fly/Desktop/类别");
//		// 得到文件路径
//		System.out.println("文件路径："+file.getAbsolutePath());
//		// 得到文件大小（字节大小）
//		System.out.println("文件大小："+file.length());
//		System.out.println("文件可读吗="+file.canRead());
		
		// 创建文件和创建文件夹
		File file1 = new File("/Users/fly/Desktop/天才.txt");
		if (!file1.exists()) { // 当文件不存在的时候
			// 可以创建
			System.out.println("文件不存在，创建");
			try {
				file1.createNewFile(); // 创建一个新的文件
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			// 文件存在，不创建
			System.out.println("文件存在，不创建");
		}
	
		
		// 创建文件夹
		File file2 = new File("/Users/fly/Desktop/我的文件夹");
		if (file2.isDirectory()) { // 该文件是一个文件夹
			System.out.println("我的文件夹存在");
		}else {
			System.out.println("我的文件夹不存在");
			// 如果没有，则创建
			file2.mkdir();
		}
		
		
		// 列出一个文件夹下面的所有文件
	    File file3 = new File("/Users/fly/Desktop/类别");
		if (file3.isDirectory()) {
			// 获取这个问价加下的所有文件夹
			File lists[] = file3.listFiles();
			for (int i = 0; i < lists.length; i++) {
				System.out.println("文件名："+lists[i].getName());
			}
		}else {
			System.out.println("类别不是一个文件夹");
		}
		
		
		
	}
}

















