package com.prj.flower.goods.service;

import java.util.List;
import java.util.Map;

import com.prj.flower.goods.vo.GoodsVO;
import com.prj.flower.goods.vo.ImageFileVO;



public interface GoodsService {
	//상품리스트
	public Map<String,List<GoodsVO>> listGoods() throws Exception;
	//상품상세정보
	public Map goodsDetail(String _goods_id) throws Exception;
	//상품검색
	public List<String> keywordSearch(String keyword) throws Exception;
	public List<GoodsVO> searchGoods(String searchWord) throws Exception;
	//상품ID조회
	public int selectGoodsId(String goods_title) throws Exception;
}
