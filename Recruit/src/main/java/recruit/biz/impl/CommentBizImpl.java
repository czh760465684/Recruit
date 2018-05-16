package recruit.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import recruit.biz.CommentBiz;
import recruit.entity.Comment;
import recruit.mapper.CommentMapper;


@Service
public class CommentBizImpl implements CommentBiz{

	@Autowired
	private CommentMapper mapper;
	
	@Override
	public List<Comment> commentAll() {
		return mapper.commentAll();
	}

	@Override
	public int commentById(int id) {
		return mapper.commentById(id);
	}

	

}
