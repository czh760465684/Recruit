package recruit.entity;

import java.sql.Date;

public class Recruit {
	public Recruit() {}
	
	public Recruit(int id) {
		super();
		this.id = id;
	}
	private int id;
	private String name;
	private String categoryName;
	private int categoryId;
	private String companyName;
	private String tempt;
	private String detail;
	private String salary;
	private String address;
	private String aredetailed;
	private String diploma;
	private String work;
	private Date publishDate;
	private String state;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}
	public String getAredetailed() {
		return aredetailed;
	}

	public void setAredetailed(String aredetailed) {
		this.aredetailed = aredetailed;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTempt() {
		return tempt;
	}
	public void setTempt(String tempt) {
		this.tempt = tempt;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDiploma() {
		return diploma;
	}
	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
}
