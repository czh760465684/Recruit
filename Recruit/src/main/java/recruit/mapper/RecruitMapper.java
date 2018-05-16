package recruit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import recruit.entity.Recruit;


public interface RecruitMapper {
	@Select(" SELECT r.*,c.name as categoryName FROM Recruit AS r LEFT JOIN Category AS c ON(r.categoryid=c.id) ORDER BY publishdate LIMIT 20")
	List<Recruit> recruitAll();

	@Select("select * from Recruit where id=#{id}")
	Recruit recruitById(int id);
	
	@Select("SELECT r.*,c.name AS categoryName FROM Recruit AS r LEFT JOIN Category AS c ON(r.categoryid=c.id) ORDER BY publishdate DESC LIMIT 20")
	List<Recruit> recruitNewAll();
	
	@Select("SELECT r.*,c.name AS categoryName ,c.`id` FROM Recruit AS r LEFT JOIN Category AS c ON(r.categoryid=c.id) WHERE categoryid=#{categoryid}")
	Recruit recruitByCategoryid(int categoryid);
	
	int getRecruitByName(
			@Param("id") int id,
			@Param("name") String name);
	
	List<Recruit> getRecruit(@Param("cname") String cname,@Param("address") String address,@Param("diploma") String diploma,@Param("work") String work,@Param("today") int today,@Param("state") int state,@Param("stratIndex") int stratIndex,@Param("maxSize") int maxSize);
	
	List<Recruit> findRecruit(@Param("name") String name,@Param("state") String state,@Param("stratIndex") int stratIndex,@Param("maxSize") int maxSize);
	
	int findRecruitCount(@Param("name") String name,@Param("state") String state);
	
	void update(Recruit recruit);
	
	void add(Recruit recruit);
	
	void del(int id);
}
