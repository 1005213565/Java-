package com.UsbTest;
import java.io.*;

public class List {

	public static void main(String []args)  throws Exception{ // 扔出异常
		
		// 定义一个对象数组，用于存放狗
		Dog dogs[] = new Dog[4];
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	    for(int i = 0; i < 4; i++) {
			dogs[i] = new Dog();
			System.out.println("请输入狗名");
			// 从控制台读取狗名
			String name = br.readLine();
			// 将名字付给对象
			dogs[i].setName(name);
			
			System.out.println("请输入狗体重"); 
			String weight = br.readLine();
			dogs[i].setWeight(Float.parseFloat(weight)); // 将字符串转换成float
		} 
		
		// 计算平均体重
//	    @SuppressWarnings("unused") // 压制警告
		float allWeight = 0 ;
		for (int i = 0; i < 4; i++) {
			allWeight += dogs[i].getWeight();
		}
		
		float avWeight = allWeight/dogs.length;
		System.out.print("平均体重为"+avWeight);
		 
		
		// 找出体重最大的狗
		// 假设第一只狗体重最大
		float maxWeight = dogs[0].getWeight();
		int maxIndex = 0;
		for(int i = 1; i < 4; i++) {
			if(maxWeight < dogs[i].getWeight()) {
				
				maxWeight = dogs[i].getWeight();
				maxIndex = i;
			}
		}
		System.out.println("体重最大的狗是第"+(maxIndex+1)+"只，体重是"+dogs[maxIndex].getWeight());
		
	}
}
 

// 定义一个狗类
class Dog {
	private String name;
	private float weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public float getWeight() {
		return this.weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}

}
