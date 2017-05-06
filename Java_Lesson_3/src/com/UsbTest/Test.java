/**
 * 功能：接口讲解
 * 
 * 前期绑定：在编译的时候，能确定的类型就是前期绑定
 * 后期绑定：在编译的时候，不能确定的类型就是后期绑定
 * 
 * 
 * final:可以修饰变量或者方法
 * 在以下的情况下，程序可有需要使用final
 * 1.当不希望父类的某个方法被子类覆盖，可以用final关键字修饰
 * 2.当不希望类的某个变量的值被修改，可以用final修饰（如果用final修饰了变量，则必须赋初始值，否则编译不过）
 * 3.当不希望类被继承时，可以用final修饰
 * 
 * 
 * final注意事项：
 * 1.final修饰的变量又叫常量，一般用xx_xx_xx来命名
 * 2.final修饰的变量在定义的时候，必须赋值，并且以后不能再赋值
 * 
 * 
 * final什么时候用？
 * 1.因为安全的考虑，类的某个方法不允许修改。
 * 2.类不会被其他类继承
 * 3.某些变量值是固定的，比如圆周率
 * 
 * 
 * */
package com.UsbTest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		// 接口不能实例化，直接使用里面的变量
		System.out.println(Usb.a);
		
		// 创建了一个电脑
		Computer computer = new Computer();
		// 创建照相机
		Camera camera1 = new Camera();
		// 创建了一个手机
		Phone phone1 = new Phone();
		// 电脑连接手机
		computer.useUsb(camera1);
		// 电脑连接照相机
		computer.useUsb(phone1);
		// 电脑使用了kkk接口，连接了照相机
		computer.useKkk(camera1);
		
	}

}

// final修饰类，则表示该类不能被继承
final class Aaa{
   int a = 0;// java中的基本数据类型，最好给赋初始值，为了避免在不同平台下出现的问题
   // 圆周率 final修饰的变量一般用下划线配合字母命名
   final float rate_a = 3.1415926f;
	// 给方法用final修饰，则表示不可以被修改（覆盖）
	final public void sendMes(){
		System.out.println("发送消息");
	}
}













/*
 * usb接口 接口(接口不能被实例化)
    抽象类中可以有实现的方法（此方法不是抽象方法）
    1.接口里面的方法不能再本接口内实现
    2.接口里面可以有变量（但是必须要初始化(本质上是静态的，而且是final，不能用private修饰)）
    3.在java中，我们经常把经常用的变量，定义在接口中，作为全局变量使用，访问形式：接口.变量名
    4.一个接口不能继承其他的类，说那是可以继承别的接口
 * 
 * */
interface Usb {
	
	 int a = 0;
	// 接口里面声明了两个方法
	
	// 开始工作
	public void start();
	// 停止工作
	public void stop();
	
	
}

//总接口
interface Base {
	public void eat();
}

// 一个接口继承自总接口
interface Kkk extends Base{
	public void cry();
}

// 编写了一个照相机类，并实现了usb接口
// 当一个类实现了一个接口（要实现接口，必须把接口里面的方法通通实现）
class Camera implements Usb,Kkk { // 实现了多个接口
	public void start(){
		System.out.println("我是照相机，开始工作了。。。");
	}
	
	public void stop() {
		System.out.println("我是照相机，停止工作了。。。");
	}
	
	public void cry() {
		
		System.out.println("我是照相机，我实现了Kkk");
	}
	
	public void eat() {
		System.out.println("我是Kkk接口继承自Base接口的方法");
	}
}


// 编写手机 
class Phone implements Usb {
	
	public void start() {
		System.out.println("我是手机，开始工作了。。。");
	}
	
	public void stop() {
		System.out.println("我是手机，停止工作了。。。");
	}
}


// 计算机
class Computer {
	
	// 开始使用usb接口
	public void useUsb(Usb usb) {
		usb.start();
		usb.stop();
	}
	
	// 使用Kkk接口
	public void useKkk(Kkk kkk) {
		kkk.cry();
		kkk.eat();
	}
	
}