package com.elegant.common.utils;

import java.util.Random;

/**
 * 各种id生成策略
 * 
 * IDUtils
 * 创建人:cool-狼 
 * 时间：2018年1月22日-下午5:48:35 
 * @version 1.0.0
 *
 */
public class IDUtils {

	/**
	 * 图片名生成
	 * 方法名：genImageName
	 * 创建人：cool-狼 
	 * 时间：2018年1月22日-下午5:48:44 
	 * 手机:18850149410
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	public static String genImageName() {
		//取当前时间的长整形值包含毫秒
		long millis = System.currentTimeMillis();
		//long millis = System.nanoTime(); // 纳秒
		//加上三位随机数
		Random random = new Random();
		int end3 = random.nextInt(999);
		//如果不足三位前面补0
		String str = millis + String.format("%03d", end3);
		
		return str;
	}
	
	/**
	 * id生成或者token生成
	 * 方法名：genItemId
	 * 创建人：cool-狼 
	 * 时间：2018年1月22日-下午5:48:53 
	 * 手机:18850149410
	 * @return long
	 * @exception 
	 * @since  1.0.0
	 */
	public static long genItemId() {
		//取当前时间的长整形值包含毫秒
		long millis = System.currentTimeMillis();
		//long millis = System.nanoTime();
		//加上两位随机数
		Random random = new Random();
		int end2 = random.nextInt(99);
		//如果不足两位前面补0
		String str = millis + String.format("%02d", end2);
		long id = new Long(str);
		return id;
	}
	
	public static void main(String[] args) {
		for(int i=0;i< 100;i++)
		System.out.println(genItemId());
	}
}
