package recruit.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import recruit.biz.RecruitBiz;
import recruit.entity.Recruit;
import recruit.mapper.RecruitMapper;



@Service
public class RecruitBizImpl implements RecruitBiz{

	@Autowired
	private RecruitMapper mapper;
	
	@Override
	public List<Recruit> recruitAll() {
		return mapper.recruitAll();
	}
	
	@Override
	public Recruit recruitById(int id) {
		return mapper.recruitById(id);
	}

	@Override
	public int getRecruitByName(int id, String name) {
		return mapper.getRecruitByName(id, name);
	}

	@Override
	public List<Recruit> recruitNewAll() {
		return mapper.recruitNewAll();
	}

	@Override
	public Recruit recruitByCategoryid(int categoryid) {
		return mapper.recruitByCategoryid(categoryid);
	}

	@Override
	public List<Recruit> getRecruit(String cname, String address, String diploma, String work, int today, int state,
			int pageNum, int maxSize) {
		return mapper.getRecruit(cname, address, diploma, work, today, state, (pageNum-1)*maxSize, maxSize);
	}

	@Override
	public List<Recruit> findRecruit(String name,String state,int strat,int maxSize) {
		return mapper.findRecruit(name, state,strat,maxSize);
	}

	@Override
	public int findRecruitCount(String name, String state) {
		return mapper.findRecruitCount(name, state);
	}

	@Override
	public void update(Recruit recruit) {
		mapper.update(recruit);
	}

	@Override
	public void add(Recruit recruit) {
		mapper.add(recruit);
	}

	@Override
	public void del(int id) {
		mapper.del(id);
	}

}
