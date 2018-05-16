package recruit.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import recruit.biz.RecordBiz;
import recruit.entity.Record;

@Controller
@RequestMapping("admin")
public class AdminRecordController {
	@Autowired
	private RecordBiz recordBiz;
	
	@RequestMapping("record")
	public String record() {
		return "admin/record";
	}
	
	@RequestMapping("recordList")
	@ResponseBody
	public Map<String,Object> findRecord(Integer pageNum,Integer maxSize){
		pageNum=pageNum==null?1:pageNum;
		maxSize=maxSize==null?20:maxSize;
		List<Record> recordList=recordBiz.findRecord(pageNum, maxSize);
		HashMap<String, Object> map = new HashMap<>();
		map.put("data", recordList);
		return map;
	}
}
