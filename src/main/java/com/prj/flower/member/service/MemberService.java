package com.prj.flower.member.service;

import java.util.Map;

import com.prj.flower.member.vo.MemberVO;



public interface MemberService {
	//로그인
	public MemberVO login(Map  loginMap) throws Exception;
	//회원가입
	public void addMember(MemberVO memberVO) throws Exception;
	//ID중복조회
	public String overlapped(String id) throws Exception;
}
