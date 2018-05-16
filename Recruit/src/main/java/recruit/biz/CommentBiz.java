package recruit.biz;

import java.util.List;

import recruit.entity.Comment;

public interface CommentBiz {
	List<Comment> commentAll();
	int commentById(int id);
	
}
