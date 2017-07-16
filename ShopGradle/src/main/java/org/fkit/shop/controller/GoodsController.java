package org.fkit.shop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.fkit.shop.domain.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.fkit.shop.service.GoodsService;
@Controller
public class GoodsController {

/**
 * 自动注入GoodService
 * */
@Autowired
@Qualifier("goodsService")

private GoodsService goodsService;

/**
 * 处理/main请求
 * */
@RequestMapping(value="/drinking")
public String main(Model model){
List<Goods> goods_list = goodsService.getAll();
// 将图书集合添加到model当中
model.addAttribute("goods_list", goods_list);
// 跳转到wenyibook页面
return "drinkings";
	
}


}
