package com.prj.flower.admin.member.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



public interface AdminMemberController {
	//메인
	public ModelAndView adminGoodsMain(@RequestParam Map<String, String> dateMap,HttpServletRequest request, HttpServletResponse response)  throws Exception;
	//회원상세정보
	public ModelAndView memberDetail(HttpServletRequest request, HttpServletResponse response)  throws Exception;
	//회원정보수정
	public void modifyMemberInfo(HttpServletRequest request, HttpServletResponse response)  throws Exception;
	//회원탈퇴
	public ModelAndView deleteMember(HttpServletRequest request, HttpServletResponse response)  throws Exception;
}
