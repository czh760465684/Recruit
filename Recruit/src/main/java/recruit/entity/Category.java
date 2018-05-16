package recruit.entity;

public class Category {
	public Category() {}
	
	
	public Category(String id, String name, String parentId) {
		this.id = id;
		this.name = name;
		this.parentId = parentId;
	}

	private String id;
	private String name;
	private String parentId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}


	public String getParentId() {
		return parentId;
	}


	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	
}
