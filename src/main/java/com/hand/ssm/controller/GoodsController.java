package com.hand.ssm.controller;

import com.hand.ssm.dto.Goods;
import com.hand.ssm.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wangz
 */
@Controller
public class GoodsController {

	@Resource
	private GoodsService goodsService;

	@RequestMapping("/good")
	public String getGood(ModelAndView modelAndView, HttpServletRequest request, HttpServletResponse response){
		long id = Long.valueOf(request.getParameter("id"));
		Goods goods = goodsService.getGood(id);
		modelAndView.addObject("good", goods);
		return "success";
	}

}
