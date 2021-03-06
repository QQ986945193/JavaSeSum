package com.qq986945193.javasetools.knowledge;

/**
 * @author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

/**
 * 增强for循环的使用详解
 */
public class ForEach {
	/**
	 * 用来如果集合删除，最好使用iterator
	 * 不要在 foreach 循环里进行元素的 remove / add 操作。 remove 元素请使用 Iterator
		方式，如果并发操作，需要对 Iterator 对象加锁。
	 */
	@Test
	public void testFor() {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		
		// 正例：
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String item = iterator.next();
			if ("2".equals(item)) {
				iterator.remove();
			}
			
		}
		
		// 反例：
	/*	for (String item : list) {
			if ("2".equals(item)) {
				list.remove(item);
			}
			System.out.println(item);
		}*/
		
		//执行完删除之后，进行遍历
		for (String itemEnd : list) {
			System.out.println(itemEnd);
		}
	}

	/**
	 * 增强for循环的语法：
	 * <p/>
	 * for(数据类型 自定义变量名:要循环的集合或者数组){ 这里面写所要遍历的元素或者适当代码即可 }
	 */

	public static void main(String args[]) {
		// 定义一个数组
		int arrs[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int sum = 0;
		for (int i : arrs) {
			sum += arrs[i];
			// 打印出每个元素的值
			System.out.println(i);
		}
		// 打印出此数组的和
		System.out.print(sum);

		forList();
	}

	/**
	 * 增强for循环遍历集合元素
	 */
	private static void forList() {
		List<String> lists = new ArrayList();
		lists.add("hello");
		lists.add("1");
		lists.add("2");
		lists.add("3");
		System.out.println(lists.size());
		for (String string : lists) {
			System.out.println(string);
		}

	}

}
