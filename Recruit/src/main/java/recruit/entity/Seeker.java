package recruit.entity;

public class Seeker{
	public Seeker() {}
	
	public Seeker(String id, String name, String phone, String address, String diploma, String work, String email,
			String password, String state) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.diploma = diploma;
		this.work = work;
		this.email = email;
		this.password = password;
		this.state = state;
	}

	private String id;
	private String name;
	private String phone;
	private String address;
	private String diploma;
	private String work;
	private String email;
	private String password;
	private String state;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
