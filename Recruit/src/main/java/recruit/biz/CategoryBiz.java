package recruit.biz;

import java.util.List;

import recruit.entity.Category;
public interface CategoryBiz { 
	
	List<Category> categoryAll();

	List<Category> categoryHotAll();
	
	Category findCategoryById(int id);
	
	int getCategoryByName(
			 int id,
			 String name);
	
	List<Category> findCategory(int level);
	
	List<Category> findCategoryByParentId(int pid,String name,
			int pageNum,int maxSize);
	
	List<Category> findCategoryByPid(int pid);
	
	void add(Category category);
	
	void update(Category category);
	
	int findCategoryCount(int pid,String name);
}
