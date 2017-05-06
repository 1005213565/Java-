
/*
 * 缓冲字符流：操作的是string（可以一行一行的读取,或者一个字符或者自己指定）
 * 
 * */

package com.shifeng2;
import java.io.*;

public class Demo_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		try {
			// 先创建FileReader对象
			FileReader fileReader = new FileReader("/Users/fly/Desktop/天才.txt");
			// 缓冲字符流需要先将要读取的文件缓存到到bufferedReader中，再进行读取
			bufferedReader = new BufferedReader(fileReader);
			
			// 创建FileWriter
			FileWriter fileWriter = new FileWriter("/Users/fly/Desktop/bufferedReader.txt");
			bufferedWriter = new BufferedWriter(fileWriter);
			
			// 循环读取文件
			String string = "";
			// 当返回null的时候就是读取完毕（不读取换行符）
			while ((string = bufferedReader.readLine()) != null) {
				
				System.out.println(string);
				string = string + "\n"; // 拼接字符串
				// 输出到磁盘
				bufferedWriter.write(string);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				bufferedReader.close();
				bufferedWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
