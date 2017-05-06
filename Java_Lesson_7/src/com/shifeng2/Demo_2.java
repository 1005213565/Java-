
/*
 * 演示：FileInputStream类的使用
 * 
 * 
 * */


package com.shifeng2;
import java.io.*;
import java.sql.Types;

public class Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 得到一个文件对象
		 File file1 = new File("/Users/fly/Desktop/类别/CategoryTests/CategoryTests.m");
		 // 因为File没有读写的能力，所以需要使用InputStream流
		 FileInputStream fileInputStream = null;
		 try {
		    fileInputStream = new FileInputStream(file1);
			// 定义一个字节数组，相当于缓存
			byte bytes[] = new byte[1024];
			// 得到实际读取到的字节数
			int n = 0;
			// 循环读取
			// 读入缓冲区的字节总数，如果因为已经到达文件末尾而没有更多的数据，则返回 -1。
			while ((n = fileInputStream.read(bytes)) != -1) { // 当读取字节为-1的时候转换成String
				// 将字节转成String(bytes, 0, n)，这是从0读取到n个的转成字符串
				String string = new String(bytes, 0, n);
				System.out.println(string);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { // 关闭文件流必须放这，不能放在try里面，因为有可能有异常直接就没执行关闭
			
			// 继续捕获异常
			try {
				fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
