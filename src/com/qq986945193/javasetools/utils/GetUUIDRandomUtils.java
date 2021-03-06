package com.qq986945193.javasetools.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @Author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 * @OsChina空间: https://my.oschina.net/mcxiaobing
 */

/**
 * 生成32位的随机数 16位数字组成
 */
public class GetUUIDRandomUtils {
	/**
	 * 获取一个32位的随机数 16位数字组成。并去掉“-”并且转换为大写
	 * 
	 */
	public static String getUUIDRandomNum() {
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();
	}

	/**
	 * 生成随机数唯一码：UUID 20位 根据时间生成
	 */
	public static String getRandomUUID() {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");// 设置日期格式
		String str = "";
		for (int i = 0; i < 6; i++) {
			str += String.valueOf((int) (Math.random() * 9));
		}
		// new Date()为获取当前系统时间
		return df.format(new Date()) + str;
	}
	/*
	 * @Test public void test(){ System.out.println(getUUIDRandomNum());
	 * System.out.println(getRandomUUID()); }
	 */
}
