package com.prj.flower.admin.order.service;

import java.util.List;
import java.util.Map;

import com.prj.flower.order.vo.OrderVO;


public interface AdminOrderService {
	//주문리스트
	public List<OrderVO>listNewOrder(Map condMap) throws Exception;
	//주문상태수정
	public void  modifyDeliveryState(Map deliveryMap) throws Exception;
	//주문상세정보
	public Map orderDetail(int order_id) throws Exception;
}
