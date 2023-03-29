package com.prj.flower.admin.order.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public interface AdminOrderController {
	//메인
	public ModelAndView adminOrderMain(@RequestParam Map<String, String> dateMap,
            HttpServletRequest request, HttpServletResponse response)  throws Exception;
	//주문정보수정
	public ResponseEntity modifyDeliveryState(@RequestParam Map<String, String> deliveryMap, 
            HttpServletRequest request, HttpServletResponse response)  throws Exception;
	//주문상세정보
	public ModelAndView orderDetail(@RequestParam("order_id") int order_id, 
            HttpServletRequest request, HttpServletResponse response)  throws Exception;
	
	
}
