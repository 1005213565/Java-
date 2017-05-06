
/*
 * LinkedList类是双向列表，列表中的每个节点都包含了对前一个后后一个元素的引用
 * 
 * LinkedList的构造函数如下：
 * 1.public LinkedList():----------生成空的链表
 * 2.public LinkedList(Collection col):复制构造函数
 * 
 * */

package com.shifeng;
import java.util.*;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         // 创建链表
         LinkedList<String> linkedList = new LinkedList<String>();
         // 链表添加元素
		linkedList.add("1");
		// for循环遍历
		for (int i = 0; i < linkedList.size(); i++) {
			linkedList.get(i);
		}
		
	}

}
