package com.prj.flower.q_board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;


public interface BoardController {
	//게시판조회
	public ModelAndView listArticles(HttpServletRequest request, HttpServletResponse response) throws Exception;
	//새 글추가
	public ResponseEntity addNewArticle(MultipartHttpServletRequest multipartRequest,HttpServletResponse response) throws Exception;
	//상세 글 확인
	public ModelAndView viewArticle(@RequestParam("articleNO") int articleNO,
			                        HttpServletRequest request, HttpServletResponse response) throws Exception;
	//글 수정
	public ResponseEntity modArticle(MultipartHttpServletRequest multipartRequest,  HttpServletResponse response) throws Exception;
	//글 삭제
	public ResponseEntity  removeArticle(@RequestParam("articleNO") int articleNO,
                              HttpServletRequest request, HttpServletResponse response) throws Exception;
	//답글
	public ResponseEntity addReply(MultipartHttpServletRequest multipartRequest, HttpServletResponse response) throws Exception;
	//답글페이지
	public ModelAndView replyForm(@RequestParam("parentNO")int parentNO, HttpServletRequest request,HttpServletResponse response) throws Exception;

}