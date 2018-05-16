package recruit.biz;

import java.util.List;

import recruit.entity.Record;

public interface RecordBiz {
	List<Record> recordAll();
	int recordById(int id);
	List<Record> findRecord(int pageNum,int maxSize);
}
