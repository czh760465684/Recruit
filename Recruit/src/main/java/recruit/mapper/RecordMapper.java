package recruit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import recruit.entity.Record;


public interface RecordMapper {
	@Select("select * from Record")
	List<Record> recordAll();
	
	@Select("select * from Record where id=#{id}")
	int recordById(int id);
	
	List<Record> findRecord(@Param("stratIndex")int stratIndex,@Param("maxSize")int maxSize);
}
