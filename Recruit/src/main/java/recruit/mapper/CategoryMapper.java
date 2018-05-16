package recruit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import recruit.entity.Category;

public interface CategoryMapper{
	List<Category> findByParentId(String parentId);
	
	@Select("SELECT * FROM Category")
	List<Category> categoryAll();
	
	@Select("SELECT * FROM Category WHERE parentid=7 ORDER BY parentid DESC LIMIT 8")
	List<Category> categoryHotAll();
	
	@Select("select * from Category where id=#{id}")
	Category findCategoryById(int id);

	int getCategoryByName(
			@Param("id") int id,
			@Param("name") String name);
	
	List<Category> findCategory(@Param("level")int level);
	
	List<Category> findCategoryByParentId(@Param("pid")int pid,@Param("name")String name,
			@Param("stratIndex") int stratIndex,@Param("maxSize") int maxSize);
	
	@Select("select * from Category where parentId=#{pid}")
	List<Category> findCategoryByPid(@Param("pid")int pid);
	
	@Insert("insert into category(`name`,parentid) VALUES(#{name},#{parentId});")
	void add(Category category);
	
	@Update("update category set name=#{name} where id=#{id}")
	void update(Category category);
	
	int findCategoryCount(@Param("pid") int pid,
			@Param("name") String name);
}
