package com.prj.flower.admin.goods.service;

import java.util.List;
import java.util.Map;

import com.prj.flower.goods.vo.GoodsVO;
import com.prj.flower.goods.vo.ImageFileVO;
import com.prj.flower.order.vo.OrderVO;


public interface AdminGoodsService {
	//상품추가
	public int  addNewGoods(Map newGoodsMap) throws Exception;
	//상품리스트
	public List<GoodsVO> listNewGoods(Map condMap) throws Exception;
	//상품상세정보
	public Map goodsDetail(int goods_id) throws Exception;
	//상품이미지
	public List goodsImageFile(int goods_id) throws Exception;
	//상품정보수정
	public void modifyGoodsInfo(Map goodsMap) throws Exception;
	//상품이미지수정
	public void modifyGoodsImage(List<ImageFileVO> imageFileList) throws Exception;
	//주문상품조회
	public List<OrderVO> listOrderGoods(Map condMap) throws Exception;
	//주문정보수정
	public void modifyOrderGoods(Map orderMap) throws Exception;
	//상품이미지삭제
	public void removeGoodsImage(int image_id) throws Exception;
	//상품이미지추가
	public void addNewGoodsImage(List imageFileList) throws Exception;
	
}
