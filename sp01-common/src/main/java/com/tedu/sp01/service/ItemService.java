package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	//获取商品列表
	List<Item> getItems(String orderId);
	//减少库存
	void decreaseNumbers(List<Item>list);


}
