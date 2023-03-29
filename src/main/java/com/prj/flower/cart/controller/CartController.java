package com.prj.flower.cart.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

public interface CartController {
	//메인
	public ModelAndView myCartMain(HttpServletRequest request, HttpServletResponse response)  throws Exception;
	//장바구니추가
	public @ResponseBody String addGoodsInCart(@RequestParam("goods_id") int goods_id, @RequestParam("order_goods_qty") int qty, HttpServletRequest request, HttpServletResponse response)  throws Exception;
	//상품갯수변경
	public  @ResponseBody String modifyCartQty(@RequestParam("goods_id") int goods_id,@RequestParam("cart_goods_qty") int cart_goods_qty,
			                  HttpServletRequest request, HttpServletResponse response)  throws Exception;
	//상품삭제
	public ModelAndView removeCartGoods(@RequestParam("cart_id") int cart_id,HttpServletRequest request, HttpServletResponse response)  throws Exception;
	
	

}