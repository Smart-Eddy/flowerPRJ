package com.prj.flower.cart.service;

import java.util.List;
import java.util.Map;

import com.prj.flower.cart.vo.CartVO;



public interface CartService {
	//장바구니리스트
	public Map<String ,List> myCartList(CartVO cartVO) throws Exception;
	//상품찾기
	public boolean findCartGoods(CartVO cartVO) throws Exception;
	//상품 장바구니추가
	public void addGoodsInCart(CartVO cartVO) throws Exception;
	//상품갯수수정
	public boolean modifyCartQty(CartVO cartVO) throws Exception;
	//상품삭제
	public void removeCartGoods(int cart_id) throws Exception;
	//상품갯수
	public int getQty(String member_id);
}