
/*
 * 集合：
 * 
 * 
 * 
 * */


package com.shifeng;
// 先引入一个包(集合类)
import java.util.*;

public class Set {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 定义数组
		// 定义一个ArrayList对象
		ArrayList arr = new ArrayList();
		// 显示大小
		System.out.println("arr大小是："+arr.size());
		// 向arr中加入数据(数据类型是对象)
		Clerk clerk1 = new Clerk("宋江",54,1000.f);
		Clerk clerk2 = new Clerk("吴用",38,24000.f);
		// 将clerk1加入到arr中
		arr.add(clerk1);
		arr.add(clerk2);
		System.out.println("arr大小是："+arr.size());
		
		// 如何访问arr中的对象
		Clerk temp = (Clerk)arr.get(1);
		System.out.println("arr的第一个元素是："+temp.getName());
		
		// 遍历arr中所有的对象
		for (int i = 0; i < arr.size(); i ++) {
			Clerk temp1 = (Clerk)arr.get(i);
			System.out.println("arr的第"+i+"个元素的名字是："+temp1.getName());
		}
		// 删除
		arr.remove(1);
		
	}

}

// 定义一个员工类
class Clerk {
	private String name;
	private int age;
	private float sal;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	
	
    public	Clerk(String name, int age, float sal) {
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
    

    
    
}