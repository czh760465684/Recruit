package recruit.biz;

import java.util.List;

import recruit.entity.Recruit;

public interface RecruitBiz {
	List<Recruit> recruitAll();
	
	List<Recruit> recruitNewAll();
	
	Recruit recruitById(int id);
	
	Recruit recruitByCategoryid(int categoryid);
	
	int getRecruitByName(int id,String name);
	
	List<Recruit> getRecruit(String cname,String address,String diploma,String work,int today,int state,int stratIndex,int maxSize);
	
	List<Recruit> findRecruit(String name,String state,int strat,int maxSize);
	
	int findRecruitCount(String name,String state);
	
	void update(Recruit recruit);
	
	void add(Recruit recruit);
	
	void del(int id);
}


