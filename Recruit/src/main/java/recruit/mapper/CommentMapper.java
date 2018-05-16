package recruit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import recruit.entity.Comment;

public interface CommentMapper {
	
	@Select("select * from Comment")
	List<Comment> commentAll();
	
	@Select("select * from Comment where id=#{id}")
	int commentById(int id);
	
} 
