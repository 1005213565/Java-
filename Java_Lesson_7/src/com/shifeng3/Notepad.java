
/*
 * 演示：记事本开发（界面加功能）
 * 
 * */

package com.shifeng3;
import  java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Notepad extends JFrame implements ActionListener{

	// 定义需要的组件
	JTextArea textArea = null;
	// 定义菜单条
	JMenuBar mBar = null;
	// 定义菜单栏
	JMenu menu = null;
	// 定义菜单项
	JMenuItem menuItem = null;
	JMenuItem menuItem2 = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Notepad name = new Notepad();
	}
	
	// 构建函数
	public Notepad () {
		// 创建组件
		textArea = new JTextArea();
		mBar = new JMenuBar();
		menu = new JMenu("文件");
		menu.setMnemonic('f'); // 快捷符
		menuItem = new JMenuItem("打开");
		// 注册监听
		menuItem.addActionListener(this);
		// 设置标记
		menuItem.setActionCommand("open");
		
		menuItem2 = new JMenuItem("保存");
		menuItem2.addActionListener(this);
		menuItem2.setActionCommand("save");
		
		// 加入
		this.setJMenuBar(mBar);
		mBar.add(menu);
		menu.add(menuItem);
		menu.add(menuItem2);
		
		// 放入JFrame
		this.add(textArea);
		this.setSize(500,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	// 监听事件
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 判断是哪个菜单被选中
		if (e.getActionCommand().equals("open")) {
			System.out.println("点击了打开按钮");
			// 文件选择组件
			JFileChooser fileChooser = new JFileChooser();
			// 设置选择文件对话框的名字
			fileChooser.setDialogTitle("请选择文件...");
			// 打开对话窗，null是使用对话框默认的
			fileChooser.showOpenDialog(null); 
			// 显示对话框
			fileChooser.setVisible(true);
			
			
			// 得到用户选择的绝对路径
			String filePath = fileChooser.getSelectedFile().getAbsolutePath();
			BufferedReader bufferedReader = null;
			try {
				FileReader fileReader = new FileReader(filePath);
				bufferedReader = new BufferedReader(fileReader);
				
				String tempStr = "";
				String allStr = "";
				while ((tempStr = bufferedReader.readLine()) != null) {
					allStr += tempStr + "\n";
				}
				textArea.setText(allStr);
			} catch (Exception e1) {
				e1.printStackTrace();
			}finally {
				try {
					bufferedReader.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
			
		}else if (e.getActionCommand().equals("save")) {
			// 出现保存对话框
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("另存为...");
			fileChooser.showSaveDialog(null);
			fileChooser.setVisible(true);
			
			// 得到保存文件的路径
			String stringPath = fileChooser.getSelectedFile().getAbsolutePath();
			
			// 准备写入到指定文件
			BufferedWriter bufferedWriter = null;
			try {
				FileWriter filterWriter = new FileWriter(stringPath);
				bufferedWriter = new BufferedWriter(filterWriter);
				System.out.println(this.textArea.getText());
				bufferedWriter.write(this.textArea.getText());
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}finally {
				try {
					bufferedWriter.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			
		}
		
	}

}









