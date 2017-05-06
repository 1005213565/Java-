
/*
 * 雇员作业：
 * 
 * 
 * */
package com.shifeng;

import java.util.*; // 集合需要引入的头文件
import java.io.*; // 控制台输入需要引入的头文件

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 创建员工管理对象
		EmpManage emManage = new EmpManage();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    // 做出一个简单菜单
		while (true) {
			
			System.out.println("选择你要进行的操作：");
			System.out.println("1.表示添加一个雇员");
			System.out.println("2.查找一个雇员");
			System.out.println("3.修改一个雇员工资");
			System.out.println("4.删除有一个雇员");
			System.out.println("5.退出系统");
			
			String operType = br.readLine();
			if (operType.equals("1")) {
				System.out.println("请输入编号");
				String empNo = br.readLine();
				
				System.out.println("请输入名字");
				String name = br.readLine();
				
				System.out.println("请输入工资");
				String  salStr = br.readLine();
				float sal = Float.parseFloat(salStr);
				
				// 创建一个雇员
				Emp emp = new Emp(name, empNo, sal);
				// 把创建的雇员加入到雇员管理类中
				emManage.addEmp(emp);
				
			}else if (operType.equals("2")) {
				
				System.out.println("请输入你要查找的员工号");
				emManage.showInfo(br.readLine());
				
			}else if (operType.equals("3")) {
				
				System.out.println("请输入你要修改工资的员工号");
				String empNo = br.readLine();
				System.out.println("请输入你要修改工资的员工的工资");
				float sal = Float.parseFloat(br.readLine());
				emManage.modifyEmpInfo(empNo, sal);
				
			}else if (operType.equals("4")) {
				System.out.println("请输入你要删除雇员的员工号");
				String empNo = br.readLine();
				emManage.removeEmp(empNo);
			}else if (operType.equals("5")) {
				// 退出系统
				System.exit(0);
			}
		}
		
	}

}

// 雇员管理类
class EmpManage {

	private ArrayList arr = null;

	public EmpManage() {

		arr = new ArrayList();
	}

	// 加入员工
	public void addEmp(Emp emp) {

		arr.add(emp);
	}

	// 显示员工的相关信息
	public Emp showInfo(String empNo) {
		Emp tempEmp = null;
		// 遍历整个ArrayList
		for (int i = 0; i < arr.size(); i++) {

			Emp emp = (Emp) arr.get(i);
			if (emp.getEmpNo().equals(empNo)) { // 字符串相等是对比的是地址是否相等
				tempEmp = emp;
				System.out.println("找到员工，他的信息是：");
				System.out.println("编号：" + emp.getEmpNo());
				System.out.println("姓名：" + emp.getName());
				System.out.println("薪水：" + emp.getSal());
				break;
			}
		}
		return tempEmp;
	}

	// 修改员工薪水
	public void modifyEmpInfo(String empNo, float sal) {

		Emp tempEmp = null;
		// 遍历整个ArrayList
		for (int i = 0; i < arr.size(); i++) {

			Emp emp = (Emp) arr.get(i);
			if (emp.getEmpNo().equals(empNo)) { // 字符串相等是对比的是地址是否相等

				tempEmp = emp;
				break;
			}
		}
		tempEmp.setSal(sal);
	}
	
	// 员工离职，删除该员工
	public void removeEmp(String empNo) {

		Emp tempEmp = null;
		// 遍历整个ArrayList
		for (int i = 0; i < arr.size(); i++) {

			Emp emp = (Emp) arr.get(i);
			if (emp.getEmpNo().equals(empNo)) { // 字符串相等是对比的是地址是否相等

				tempEmp = emp;
				break;
			}
		}
		arr.remove(tempEmp);
	}
	
	// 按照薪水，从低到高排序
	public void sortArrFormLowToHigh() {

		// 遍历整个ArrayList
		for (int i = 0; i < arr.size(); i++) {

			Emp insertVal = (Emp)arr.get(i);
			// insertVal准备和前一个数比较
			int index = i - 1;
			Emp tempEmp = (Emp)arr.get(index);
			while (index >= 0 && insertVal.getSal() < tempEmp.getSal()) {
				
				// 将把arr[index]向后移动
				
				
//				arr.set(index + 1, tempEmp) = arr.get(index); 
//				
//				arr[index + 1] = arr[index];
//				// 让index向前移动
//				index--;
			}

			// 将inserval插入到适当位置
//			arr[index + 1] = insertVal;
		}
	}
	
	
}

// 雇员类
class Emp {

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

	public Emp(String name, String empNo, float sal) {
		this.name = name;
		this.empNo = empNo;
		this.sal = sal;
	}

}