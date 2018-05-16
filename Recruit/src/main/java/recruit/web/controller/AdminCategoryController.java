package recruit.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import recruit.biz.CategoryBiz;
import recruit.biz.RecordBiz;
import recruit.biz.RecruitBiz;
import recruit.entity.Category;
import recruit.entity.Record;
import recruit.entity.Recruit;

@Controller
@RequestMapping("admin")
public class AdminCategoryController {
	@Autowired
	private CategoryBiz categoryBiz;
	
	@RequestMapping("index")
	public String index() {
		return "admin/index";
	}
	
	@RequestMapping("category")
	public String category() {
		return "admin/category";
	}

	@RequestMapping("categoryList")
	@ResponseBody
	public Map<String,Object> findCategory(Integer pid,String name,Integer pageNum,Integer maxSize) {
		pid=pid==null?-1:pid;
		pageNum=pageNum==null?1:pageNum;
		maxSize=maxSize==null?20:maxSize;
		List<Category> categoryList=categoryBiz.findCategoryByParentId(pid, name, pageNum, maxSize);
		int rows=categoryBiz.findCategoryCount(pid, name);
		HashMap<String, Object> map = new HashMap<>();
		map.put("data", categoryList);
		map.put("recordsTotal", rows);
		map.put("recordsFiltered", rows);
		return map;
	}
	@RequestMapping("findCategory")
	@ResponseBody
	public Map<String,Object> findCategoryByPid(Integer pid){
		pid=pid==null?-1:pid;
		List<Category> list=categoryBiz.findCategoryByPid(pid);
		HashMap<String, Object> map = new HashMap<>();
		map.put("list",list);
		return map;
	}
	@RequestMapping("findCategoryByLevel")
	@ResponseBody
	public Map<String,Object> findCategoryByLevel(){
		List<Category> oneCategorys=categoryBiz.findCategory(1);
		List<Category> twoCategorys=categoryBiz.findCategory(2);
		List<Category> threeCategorys=categoryBiz.findCategory(3);
		HashMap<String, Object> map = new HashMap<>();
		map.put("oneCategorys", oneCategorys);
		map.put("twoCategorys", twoCategorys);
		map.put("threeCategorys", threeCategorys);
		return map;
	}
}
