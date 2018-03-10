package com.elegant.dao.shop;

import java.util.List;

import com.elegant.pojo.Shop;
import com.elegant.pojo.TzParams;

/**
 * 店铺实体Mapper
 * IShopMapper
 * 创建人:冯小梁 
 * 时间：2018年02月08日 19:57:31
 * @version 1.0.0
 * 
 */
public interface IShopMapper {

	/**
	 * 
	 * com.tz.dao.shop 
	 * 方法名：findShops
	 * 创建人：冯小梁 
	 * 手机号码:18850149410
	 * 时间：2018年02月08日 19:57:31
	 * @param params
	 * @return 
	 * 返回类型：List<Shop>
	 * @exception 
	 * @since  1.0.0
	 */
	public List<Shop> findShops(TzParams params);
	
	/**
	 * 求总数
	 * com.tz.dao.shop 
	 * 方法名：count
	 * 创建人：冯小梁 
	 * 手机号码:18850149410
	 * 时间：2018年02月08日 19:57:31
	 * @param id
	 * @return 
	 * 返回类型：List<Shop>
	 * @exception 
	 * @since  1.0.0
	 */
	public int count(TzParams params);
	
	/**
	 * 
	 * com.tz.dao.shop 
	 * 方法名：getShop
	 * 创建人：冯小梁 
	 * 手机号码:18850149410
	 * 时间：2018年02月08日 19:57:31
	 * @param id
	 * @return 
	 * 返回类型：List<Shop>
	 * @exception 
	 * @since  1.0.0
	 */
	public Shop get(Integer id);
	
	/**
	 * 保存店铺实体
	 * com.tz.dao.shop 
	 * 方法名：save
	 * 创建人：冯小梁 
	 * 手机号码:18850149410
	 * 时间：2018年02月08日 19:57:31
	 * @param shop
	 * @return 
	 * 返回类型：Shop
	 * @exception 
	 * @since  1.0.0
	 */
	public int save(Shop shop);
	
	/**
	 * 更新店铺实体
	 * com.tz.dao.shop 
	 * 方法名：update
	 * 创建人：冯小梁 
	 * 手机号码:18850149410
	 * 时间：2018年02月08日 19:57:31
	 * @param shop
	 * @return 
	 * 返回类型：int
	 * @exception 
	 * @since  1.0.0
	 */
	public int update(Shop shop);
	
	/**
	 * 删除店铺实体
	 * com.tz.dao.shop 
	 * 方法名：delete
	 * 创建人：冯小梁 
	 * 手机号码:18850149410
	 * 时间：2018年02月08日 19:57:31 
	 * @param params
	 * @return 
	 * 返回类型：int
	 * @exception 
	 * @since  1.0.0
	 */
	public int delete(TzParams params);
	
}
