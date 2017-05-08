
/*
 * qq登录：
 * */

package com.shifeng;

import javax.swing.*;
import javax.swing.text.DefaultEditorKit.PasteAction;

import java.awt.*;

public class Test4 extends JFrame {

	// 北部区域
	JLabel label;

	// 南部区域
	JButton button1, button2, button3;
	JPanel panel1;

	// 中部区域
	JTabbedPane tabbedPane; // 选项卡
	JPanel panel2, panel3, panel4;

	JLabel label2, label3, label4, label5;
	// 账号文本框
	JTextField textField;
	// 密码框
	JPasswordField passwordField;
	// 清除号码
	JButton button4;
	// 隐身登录、记住密码
	JCheckBox checkBox1, checkBox2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test4 test4 = new Test4();
	}

	public Test4() {

		// 创建组件
		label2 = new JLabel("QQ账号", JLabel.CENTER); // 字体居中
		label3 = new JLabel("QQ密码", JLabel.CENTER);
		label4 = new JLabel("忘记密码", JLabel.CENTER);
		// 设置字体样式
		label4.setFont(new Font("宋体", Font.PLAIN, 16));
		// 设置字体颜色
		label4.setForeground(Color.blue);
		// label的字用HTML修饰
		label5 = new JLabel("<html><a href = 'www.baidu.com'>申请密码保护</a></html>");
		// 设置光标移动到此label的时候，光标变成一只手
		label5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		// 输入号码框
		textField = new JTextField(10);
		// 输入密码框
		passwordField = new JPasswordField(10);
		// 清除按钮
		button4 = new JButton("清除");

		// 复选框
		checkBox1 = new JCheckBox("隐身登陆");
		checkBox2 = new JCheckBox("记住密码");

		// 北部区域
		label = new JLabel(new ImageIcon("Images/qq_top_icon.png"));

		// 南部区域
		panel1 = new JPanel();
		button1 = new JButton(new ImageIcon("Images/qq_login_icon.png"));
		button2 = new JButton(new ImageIcon("Images/qq_cancal_icon.png"));
		button3 = new JButton("向导");

		// 中部区域
		tabbedPane = new JTabbedPane();
		panel2 = new JPanel();
		panel3 = new JPanel();
		// 给面板设置背景颜色，红色
		panel3.setBackground(Color.red);
		panel4 = new JPanel();
		// 用三原色设置背景色
		panel4.setBackground(new Color(0, 0, 225));

		// 将面板添加到选项卡窗格上
		// 第一个参数代表选卡项名称，第二个参数是要添加的是哪个容器
		tabbedPane.add("QQ号码", panel2);
		tabbedPane.add("手机号码", panel3);
		tabbedPane.add("电子邮件", panel4);

		// 设置布局
		panel2.setLayout(new GridLayout(3, 3));

		// 添加组件
		this.add(label, BorderLayout.NORTH);
		this.add(panel1, BorderLayout.SOUTH);
		this.add(tabbedPane, BorderLayout.CENTER);

		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);

		panel2.add(label2);
		panel2.add(textField);
		panel2.add(button4);
		panel2.add(label3);
		panel2.add(passwordField);
		panel2.add(label4);
		panel2.add(checkBox1);
		panel2.add(checkBox2);
		panel2.add(label5);

		this.setTitle("QQ登录");
		this.setSize(340, 250);
		this.setLocation(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
