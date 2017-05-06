
/*
 * 功能：说明继承的重要性
 * extends是继承
 * */
package com.shifeng;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pupil p1  = new Pupil();
		p1.name = "小学生";
		p1.printName();
	}

}

// 学生父类
class Stu {
	protected int age;
	protected String name;
	protected float fee;
	int num;
	protected void printName() {
		System.out.println("名字"+this.name);
	}
}

// 小学生类
class Pupil extends Stu{
	
	public void pay(float fee){
	
		this.fee = fee;
	}
}
// 中学生类
class MiddleStu extends Stu{
	
	public void pay(float fee){
	
		this.fee = fee*0.8f;
	}
}
// 大学生类
class ColStu extends Stu{
	
	public void pay(float fee){
	
		this.fee = fee*0.2f;
	}
}













