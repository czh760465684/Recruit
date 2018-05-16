package recruit.entity;

import java.sql.Date;

public class Record {
	public Record() {}
	
	public Record(String id, Seeker seeker, Recruit reruit, Date sendDate, String state) {
		this.id = id;
		this.seeker = seeker;
		this.reruit = reruit;
		this.sendDate = sendDate;
		this.state = state;
	}

	private String id;
	private Seeker seeker;
	private Recruit reruit;
	private Date sendDate;
	private String state;

	public Seeker getSeeker() {
		return seeker;
	}
	public void setSeeker(Seeker seeker) {
		this.seeker = seeker;
	}
	public Recruit getReruit() {
		return reruit;
	}
	public void setReruit(Recruit reruit) {
		this.reruit = reruit;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
