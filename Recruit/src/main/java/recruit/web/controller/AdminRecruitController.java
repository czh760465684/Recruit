package recruit.web.controller;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import recruit.biz.CategoryBiz;
import recruit.biz.RecruitBiz;
import recruit.entity.Category;
import recruit.entity.Recruit;

@Controller
@RequestMapping("admin")
public class AdminRecruitController {
	@Autowired
	private RecruitBiz recruitBiz;
	
	@Autowired
	private CategoryBiz categoryBiz;
	
	@RequestMapping("recruit")
	public String recruit(Model model) {
		List<Category> list=categoryBiz.findCategory(1);
		model.addAttribute("categoryList",list);
		return "admin/recruit";
	}

	@RequestMapping("recruitList")
	@ResponseBody
	public Map<String,Object> findRecruit(String state,String name,Integer strat,Integer length){
		state=state==null?"ÒÑ·¢²¼":state;
		List<Recruit> recruitList=recruitBiz.findRecruit(name, state, strat, length);
		int rows=recruitBiz.findRecruitCount(name, state);
		HashMap<String, Object> map = new HashMap<>();
		map.put("data", recruitList);
		map.put("recordsTotal", rows);
		map.put("recordsFiltered", rows);
		return map;
	}
	
	@RequestMapping("findRecruit")
	@ResponseBody
	public Map<String,Object> findRecruitById(int id){
		Recruit recruit=recruitBiz.recruitById(id);
		Category threeCategory=categoryBiz.findCategoryById(recruit.getCategoryId());
		Category twoCategory=categoryBiz.findCategoryById(Integer.parseInt(threeCategory.getParentId()));
		Category oneCategory=categoryBiz.findCategoryById(Integer.parseInt(twoCategory.getParentId()));
		HashMap<String, Object> map = new HashMap<>();
		map.put("recruit", recruit);
		map.put("threeCategory",threeCategory);
		map.put("twoCategory", twoCategory);
		map.put("oneCategory", oneCategory);
		return map;
	}
	
	@RequestMapping("saveRecruit")
	@ResponseBody
	public boolean saveRecruit(Recruit recruit) {
		Date date=new Date(System.currentTimeMillis());
		recruit.setPublishDate(date);
		if(recruit.getId()>0) {
			recruitBiz.update(recruit);
		}else {
			recruitBiz.add(recruit);
		}
		return true;
	}
	@RequestMapping("delRecruit")
	@ResponseBody
	public boolean delRecruit(int id) {
		recruitBiz.del(id);
		return true;
	}
}
