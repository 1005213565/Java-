
public class Student {


	/*
	static int i = 1;
	static {
		// 当类被定义的时候，此代码已经被写入到代码区
		System.out.println("a");
		i++;
	}
	public Student() {
		i++;
	}
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Student t1 = new Student();
//        System.out.println(t1.i);
//        
//        Student t2 = new Student();
//        System.out.println(t2.i);
		
		Stu stu1 = new Stu(29,"aa",340);
		Stu stu2 = new Stu(28,"bb",350);
		System.out.println(Stu.totalFee);
		
	}

}

class Stu {
	/*!
	 * 实例变量是属于每个对象个体的属性
	 * 类变量是与类相关的，公共属性
	 * 类变量可以通过类名、类变量名直接访问
	 * */
    int age;
    String name;
	int  fee;
	static int totalFee;
	
	// 对象方法能访问静态变量
	public Stu(int age,String name,int fee) {
		this.age = age;
		this.name = name;
		totalFee += fee;
	}
	
	// 当一个变量你需要所有类的成员都能访问，采用类方法最好
	// 返回总学费(加一个static就是一个类方法（静态方法）)
	// java中规则：类变量原则上用类方法去访问和操作（类方法中不能访问非静态变量）
	public static int getTotalFee() {
		return totalFee;
	}
}












