
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person("石峰");
	    System.out.println("公共有="+Person.total);
	}

}
// 定义一个类
class Person {
	int age;
	String name;
	// total是静态变量，因此它可以被任何对象访问(包括类)
	static int total = 0;
	// 构造方法一
	public Person (int _age, String _name) {
		System.out.println("我是构造方法一");
		this.age = _age;
		this.name = _name;
		this.total++;
	}
	
	// 构造方法二
	public Person(String _name) {
		System.out.println("我是构造方法二");
		this.name = _name;
		this.total++;
	}
}