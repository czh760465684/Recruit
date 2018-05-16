package recruit.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import recruit.biz.CategoryBiz;
import recruit.biz.RecruitBiz;
import recruit.entity.Category;
import recruit.entity.Recruit;
import recruit.mapper.CategoryMapper;

@Service
public class CategoryBizImpl implements CategoryBiz{

	@Autowired
	private CategoryMapper mapper;
	
	@Override
	public List<Category> categoryAll() {
		return mapper.categoryAll();
	}

	@Override
	public Category findCategoryById(int id) {
		return mapper.findCategoryById(id);
	}

	@Override
	public int getCategoryByName(int id, String name) {
		return mapper.getCategoryByName(id, name);
	}

	@Override
	public List<Category> findCategory(int level) {
		return mapper.findCategory(level);
	}

	@Override
	public List<Category> categoryHotAll() {
		return mapper.categoryHotAll();
	}

	@Override
	public List<Category> findCategoryByParentId(int pid, String name, int pageNum, int maxSize) {
		return mapper.findCategoryByParentId(pid, name, (pageNum-1)*maxSize, maxSize);
	}

	@Override
	public void add(Category category) {
		mapper.add(category);
	}

	@Override
	public void update(Category category) {
		mapper.update(category);
	}

	@Override
	public int findCategoryCount(int pid, String name) {
		return mapper.findCategoryCount(pid, name);
	}

	@Override
	public List<Category> findCategoryByPid(int pid) {
		return mapper.findCategoryByPid(pid);
	}

	
}
