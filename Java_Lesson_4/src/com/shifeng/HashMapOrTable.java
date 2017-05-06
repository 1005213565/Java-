/*
 * HashMap:
 * 设置值：put
 * 取值：get
 * 
 * Hashtable:
 * 
 * 
 * HashMap与Hashtable的区别
 *相同点： HashMap与Hashtable都是java的集合类，都可以用来存放java对象，这是他们的
 * 相同点。
 * 不同点：Hashtable是线程同步的(安全的，但是慢)，HashMap是线程异步的(不同的，快)
 * HashMap可以让你将空值作为一个表的条目的key或value，但是Hashtable是不能放入空值null的
 * 
 * 
 * Veator与ArrayList的区别
 * 1.Veator是同步的,ArrayList是异步的
 * 2.数据增长：Veator在增长的情况下是增长的一倍，ArrayList是增长一半的
 * 如果有大量数据，则使用Veator有优势，能避免资源的开销
 * */


package com.shifeng;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class HashMapOrTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 创建一个HashMap对象
		HashMap hMap = new HashMap<>();
		Empy emp1 = new Empy("张三", "s001", 3.4f);
		Empy emp2 = new Empy("李四", "s002", 5.4f);
		// 将emp放入到hMap中
		hMap.put("s001", emp1);
		hMap.put("s002", emp2);
		// 如果你要查找编号为s002的人
		if (hMap.containsKey("s001")) { // 返回的是bool值
			// 取出元素
			Empy tempEmp = (Empy)hMap.get("s001");
			System.out.println("有该员工是"+tempEmp.getName());
		}else {
			System.out.println("没有该员工");
		}
		
		// 遍历HashMap中所有的Key和value
		// 迭代器
		Iterator iterator = hMap.keySet().iterator();
		// hasNext有没有下一个
		while (iterator.hasNext()) {
			
			// 取出key
			String key = iterator.next().toString();
			// 通过key取出value
			Empy tempEmpy = (Empy)hMap.get(key);
			System.out.println("名字"+tempEmpy.getName());
			System.out.println("薪水"+tempEmpy.getSal());
		}
		
		
		/*
		 * Hashtable:
		 * 
		 * */
	
		
		
	}
}

//雇员类
class Empy {

	private String name;
	private String empNo;
	private float sal;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public Empy(String name, String empNo, float sal) {
		this.name = name;
		this.empNo = empNo;
		this.sal = sal;
	}

}