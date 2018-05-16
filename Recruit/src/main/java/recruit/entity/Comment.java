package recruit.entity;

import java.sql.Date;

public class Comment {
	public Comment() {}
	
	public Comment(String id, Seeker seeker, Recruit recruit, String content, Date commentDate) {
		super();
		this.id = id;
		this.seeker = seeker;
		this.recruit = recruit;
		this.content = content;
		this.commentDate = commentDate;
	}

	private String id;
	private Seeker seeker;
	private Recruit recruit;
	private String content;
	private Date commentDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Seeker getSeeker() {
		return seeker;
	}
	public void setSeeker(Seeker seeker) {
		this.seeker = seeker;
	}
	public Recruit getRecruit() {
		return recruit;
	}
	public void setRecruit(Recruit recruit) {
		this.recruit = recruit;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	
	
}
