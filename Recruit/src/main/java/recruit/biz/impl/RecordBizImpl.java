package recruit.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import recruit.biz.RecordBiz;
import recruit.entity.Record;
import recruit.mapper.RecordMapper;

@Service
public class RecordBizImpl implements RecordBiz{

	@Autowired
	private RecordMapper mapper;
	
	@Override
	public List<Record> recordAll() {
		return mapper.recordAll();
	}

	@Override
	public int recordById(int id) {
		return mapper.recordById(id);
	}

	@Override
	public List<Record> findRecord(int pageNum, int maxSize) {
		return mapper.findRecord((pageNum-1)*maxSize, maxSize);
	}

}
