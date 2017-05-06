
/*
 * 演示：文件字符流案例
 * 
 * */

package com.shifeng2;
import java.io.*;

import org.omg.CORBA.CharHolder;

public class Demo_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 文件流读取字符流对象(输入流)
		FileReader fileReader = null;
		// 写入到文件（输出流）
		FileWriter  fileWriter = null;
		
		
		try {
			// 创建一个FileReader对象
			fileReader = new FileReader("/Users/fly/Desktop/天才.txt");
			// 创建一个输出对象
			fileWriter = new FileWriter("/Users/fly/Desktop/fileWriter.txt");
			
			// 读入到内存
			char c[] = new char[1024];
			// 记录实际读取到的字符数
			int n = 0;
			while ((n = fileReader.read(c)) != -1) {
				// 最好将读取到的字符从字符数组中截取出来，否则有可能出现当内容不足1024个字符的时候出现乱码
				String string = new String(c, 0, n);
				System.out.println(string);
				
				// 输出(这样输出没有乱码，否则对于某些工具，打开可能乱码，不信可以用浏览器试试看)
				fileWriter.write(c, 0, n);
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fileReader.close(); // 记得要关闭流文件
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
