package com.prj.flower.admin.member.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.prj.flower.member.vo.MemberVO;


public interface AdminMemberService {
	//회원리스트
	public ArrayList<MemberVO> listMember(HashMap condMap) throws Exception;
	//회원상세정보
	public MemberVO memberDetail(String member_id) throws Exception;
	//회원정보수정
	public void  modifyMemberInfo(HashMap memberMap) throws Exception;
}
