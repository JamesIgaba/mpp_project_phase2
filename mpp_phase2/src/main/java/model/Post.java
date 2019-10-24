package model;

import java.util.List;
import java.time.LocalDate;
import java.util.LinkedList;

public class Post {
	// fields
	String postId;
	String content;
	User user;
	LocalDate date;
	
	List<Comment> commentList;
	List<Like> likesList;
	

	//constructor
	public Post(String postId, String content) {
		this.date = LocalDate.now();
		this.content = content;
		this.postId = postId;
		commentList = new LinkedList<>();
		likesList = new LinkedList<>();
	}

	public List<Comment> getCommentList() {
		return commentList;
	}
	
	public List<Like> getLikesList() {
		return likesList;
	}

	
	//add Comment
	public void addComment(Comment comment) {
		this.commentList.add(comment);
	}
	
	//add Like
	public void addLike(Like user) {
		this.likesList.add(user);
	}


	public String getpostId() {
		return postId;
	}

	public User getUser() {
		return user;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return content;
	}

	

}

