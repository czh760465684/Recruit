package recruit.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import recruit.biz.CommentBiz;


@Controller
@RequestMapping("/list")
public class CommentController {
	
	@Autowired
	private CommentBiz commentdao;
	
//	@RequestMapping("/")
//	public String commentAll(Model model) {
//		model.addAttribute("commentlist", commentdao.commentAll());
//		return "";
//	}
//	
//	
//	@RequestMapping("/")
//	public String commentById(Model model,int id) {
//		model.addAttribute("commentid", commentdao.commentById(id));
//		return "";
//	}
	
	
	
}
