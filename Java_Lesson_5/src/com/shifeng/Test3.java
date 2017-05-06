
/*异常的处理：
 * Java中有2种方法处理异常：
 * 1.在发生异常的地方直接处理
 * 2.将异常抛给调用者处理
 * 
 * 
 * 异常分类：
 * 1.检查异常：java.lang.Exception
 * 2.运行期异常：java.lang.RuntimeException
 * 3.错误：java.lang.Error  
 *  
 *  顶层是Java.lang
 * */
package com.shifeng;
import java.io.*; // 要使用文件的类，要使用io包
import java.net.*; // 网络相关

public class Test3 {

	public static void main(String [] args) {
		// 1.检测异常1.打开文件
//		FileReader fReader = new FileReader("d:\\aa.teext");
		
		// 2.连接一个192.168.12.12  ip的端口4567   你可能写错了
//		Socket socket = new Socket("192.168.1.23", 78);
		
		// 3.运行异常
//		int arr[] = {1,2,3};
//		System.out.println(arr[123]);
	}
}



