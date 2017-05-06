/*
 * 演示FileOutputStream的使用
 * 
 * 
 * 
 * */

package com.shifeng2;
import java.io.*;

public class Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file1 = new File("/Users/fly/Desktop/my.txt");
		// 字节输出流
		FileOutputStream fileOutputStream = null;
		
		try {
			fileOutputStream = new FileOutputStream(file1);
			// 要写入的字节
			String string = "石峰你好\n，hellojsadj f;ljsd ;klf s;dl f;sd\njsd几点开始啊放假；垃圾袋发； 阿萨德发 撒大富科技；按实际地方";
			// 定义字节数组
			byte bypes[] = new byte[1024];
			// 如何把String转换成bytes数组,string.getBytes()将字符串转换成字节数组,
			bypes = string.getBytes();
			System.out.println("字节数是："+bypes.length);
			
			int n = 0;
			while (n < bypes.length) { // 一个一个字节的往文件中写入
				// fileOutputStream.write(bypes,n,10),写入的字节是tbyes的第n位开始的10个字节
				fileOutputStream.write(bypes,n,1);
				n++;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fileOutputStream.close(); // 关闭字节流
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
