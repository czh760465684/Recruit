package recruit.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import recruit.biz.CategoryBiz;
import recruit.biz.RecordBiz;

@Controller
@RequestMapping("/list")
public class RecordController {
	
	@Autowired
	private RecordBiz recorddao;
	
	
}
