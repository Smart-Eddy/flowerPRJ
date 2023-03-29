package com.prj.flower.mypage.service;

import java.util.List;
import java.util.Map;

import com.prj.flower.member.vo.MemberVO;
import com.prj.flower.order.vo.OrderVO;



public interface MyPageService{
	//주문 상품 리스트
	public List<OrderVO> listMyOrderGoods(String member_id) throws Exception;
	//주문조회
	public List findMyOrderInfo(String order_id) throws Exception;
	//주문내역
	public List<OrderVO> listMyOrderHistory(Map dateMap) throws Exception;
	//내 정보수정
	public MemberVO  modifyMyInfo(Map memberMap) throws Exception;
	//주문취소
	public void cancelOrder(String order_id) throws Exception;
	//내 정보조회
	public MemberVO myDetailInfo(String member_id) throws Exception;

}
