package recruit.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import recruit.biz.CategoryBiz;
import recruit.biz.RecruitBiz;
import recruit.entity.Recruit;

@Controller
@RequestMapping("/list")
public class RecruitController {
	
	@Autowired
	private RecruitBiz recruitdao;
	@Autowired
	private CategoryBiz categorydao;
	
	
	@RequestMapping("/jobdetail")
	public String recruitById(Model model,Integer id) {
		model.addAttribute("recruitid", recruitdao.recruitById(id));
		model.addAttribute("clist", categorydao.categoryAll());
		return "list/jobdetail";
	}
	
	
	@RequestMapping("/list")
	public String getRecruitByName(String cname,String address,String diploma,
			String work,Integer today,Integer page,Integer maxSize,Model model) {
		today=today==null?0:today;
		page=page==null?1:page;
		maxSize=maxSize==null?10:maxSize;
		List<Recruit> recruits=recruitdao.getRecruit(cname, address, diploma, work, today, 1, page, maxSize);
		model.addAttribute("recruits",recruits);
		return "list/list";
	}

	@RequestMapping("/create")
	public String username(Model model,Integer id) {
		model.addAttribute("recruitid", recruitdao.recruitById(id));
		return "list/create";
	}
	@RequestMapping("/person")
	public String person(Model model) {
		return "list/person";
	}
}
