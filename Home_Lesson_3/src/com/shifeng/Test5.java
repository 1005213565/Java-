
/*
 * 记事本界面：
 * 涉及到记事本界面的swing组件
 * 1.菜单组件:
 * JMenuBar   菜单条组件  树干
 * JMenu        菜单组件    树枝
 * JMenuItem 菜单项组件  树叶
 * 2.二级菜单制作
 * JMenu里面可以嵌套JMenu
 * 3.工具条组件
 * JToolBar  容器类组件
 * 
 * */

package com.shifeng;
import javax.swing.*;
import java.awt.*;

public class Test5 extends JFrame{

	// 菜单条组件
	JMenuBar mBar;
	JMenu menu1,menu2,menu3,menu4,menu5; // 菜单组件
	JMenuItem item2,item3,item4,item5,item6,item7; // 菜单元素
	
	JMenu xinjian; // 二级菜单
	JMenuItem fileItem,projectItem; 
	JTextArea textArea;
	
	// 工具条
	JToolBar toolBar;
	JButton button1,button2,button3,button4,button5,button6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test5 test5 = new Test5();
	}

	public Test5 () {
		// 创建组件
		toolBar = new JToolBar();
		button1 = new JButton("新建");
		// 设置提示文字
		button1.setToolTipText("新建文件");
		button2 = new JButton("打开");
		button2.setToolTipText("打开文件夹");
		button3 = new JButton("保存");
		button3.setToolTipText("保存文件");
		button4 = new JButton("复制");
		button4.setToolTipText("复制文件");
		button5 = new JButton("剪贴");
		button5.setToolTipText("剪贴文件夹");
		button6 = new JButton("粘贴");
		button6.setToolTipText("粘贴文件");
		
		mBar = new JMenuBar();
		
		menu1 = new JMenu("文件(F)");
		menu1.setMnemonic('F');// 设置辅助记符
		menu2 = new JMenu("编辑(E)"); 
		menu1.setMnemonic('E');// 设置辅助记符
		menu3 = new JMenu("格式(D)");
		menu1.setMnemonic('D');// 设置辅助记符
		menu4 = new JMenu("查看(V)");
		menu1.setMnemonic('E');// 设置辅助记符
		menu5 = new JMenu("帮助(H)");
		menu1.setMnemonic('H');// 设置辅助记符
		
		xinjian = new JMenu("新建");
		fileItem = new JMenuItem("文件");
		projectItem = new JMenuItem("项目");
		
		item2 = new JMenuItem("打开");
		item3 = new JMenuItem("保存(S)");
		item3.setMnemonic('S');
		// 给菜单添加快捷方式
//		item3.setAccelerator(keyStroke);
		item4 = new JMenuItem("另存为");
		item5 = new JMenuItem("页面设置");
		item6 = new JMenuItem("打印");
		item7 = new JMenuItem("退出");
		
		textArea = new JTextArea();
		// 将按钮添加到工具条上
		toolBar.add(button1);
		toolBar.add(button2);
		toolBar.add(button3);
		toolBar.add(button4);
		toolBar.add(button5);
		toolBar.add(button6);
		
		// 将菜单项添加到菜单上
		xinjian.add(fileItem);
		xinjian.add(projectItem);
		
		menu1.add(xinjian);
		menu1.add(item2);
		menu1.add(item3);
		menu1.add(item4);
		// 添加分割线
		menu1.addSeparator();
		menu1.add(item5);
		menu1.add(item6);
		menu1.add(item7);
		
		// 将菜单添加到菜单条上
		mBar.add(menu1);
		mBar.add(menu2);
		mBar.add(menu3);
		mBar.add(menu4);
		mBar.add(menu5);
		
		// 将菜单条添加到窗体上
		this.setJMenuBar(mBar);
		
		// 将工具条添加到窗体上
		this.add(toolBar,BorderLayout.NORTH);
		
		// 给textArea添加滚动条
		JScrollPane scrollPane = new JScrollPane(textArea);
		// 设置滚动方向
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	    this.add(scrollPane);
	   
	    this.setTitle("记事本");
	    this.setSize(700, 600);
	    this.setLocation(100, 100);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setVisible(true);
	
	}
}















