package com.study.spring.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.spring.domain.MemberVO;
import com.study.spring.service.MemberService;

@Controller
public class MemberController {
	@Inject
	private MemberService service;
	
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String member(Locale locale, Model model) {
		List<MemberVO> list = service.getList();
		model.addAttribute("list", list );
		return "memberList";
	}
}
