package com.prj.flower.order.service;

import java.util.List;
import java.util.Map;

import com.prj.flower.order.vo.OrderVO;



public interface OrderService {
	//주문리스트
	public List<OrderVO> listMyOrderGoods(OrderVO orderVO) throws Exception;
	//주문하기
	public void addNewOrder(List<OrderVO> myOrderList) throws Exception;
	public OrderVO findMyOrder(String order_id) throws Exception;
	//포인트
	public int updatePoint(Map<String, String> map);
	
	
	
}