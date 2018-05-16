package recruit.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import recruit.biz.CategoryBiz;
import recruit.biz.RecruitBiz;
import recruit.entity.Category;

@Controller
@RequestMapping("/list")
public class CategoryController {
	
	@Autowired
	private CategoryBiz categorydao;
	
	@Autowired
	private RecruitBiz recruitdao;
	
	@RequestMapping("/homepage")
	public String categoryAll(Model model) {
		
		List<Category> diyijifenlei=categorydao.findCategory(1);
		List<Category> dierjifenlei=categorydao.findCategory(2);
		List<Category> disanjifenlei=categorydao.findCategory(3);
		
		model.addAttribute("diyijifenlei",diyijifenlei);
		model.addAttribute("dierjifenlei",dierjifenlei);
		model.addAttribute("disanjifenlei",disanjifenlei);
		model.addAttribute("clist", categorydao.categoryAll());
		model.addAttribute("chlist", categorydao.categoryHotAll());
		model.addAttribute("recruitnewlist", recruitdao.recruitNewAll());
		model.addAttribute("recruitlist", recruitdao.recruitAll());
		
		return "list/homepage";
	}
}
