
/*
 * 演示：图片拷贝
 * 思路：1.先把图片读入到内存
 *             2.把图片写入到某个文件
 * 
 * 
 * */

package com.shifeng2;
import java.io.*;

public class Demo_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 输入流（把文件读取到内存中）
		FileInputStream fileInputStream = null;
		
		// 输出流
		FileOutputStream fileOutputStream = null;
		
		try {
			// 文件路径直接写到输入流中也可以，或者先创建文件再放到输入流中
	     fileInputStream = new FileInputStream("/Users/fly/Desktop/Java代码/picture.png");
	     
	     // 输出流
	     fileOutputStream = new FileOutputStream("/Users/fly/Desktop/哈哈.png");
	     
	     byte bytes[] = new byte[1024];
	     int n = 0; // 实际读取到的字节数
	     // 循环读取
	     while ((n = fileInputStream.read(bytes)) != -1) {
			// 立马输出到指定文件,读取一个的同时输出一个
	    	 fileOutputStream.write(bytes);
		}
	     
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fileInputStream.close(); // 关闭文件流
				fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); 
			}
		}
	}

}
