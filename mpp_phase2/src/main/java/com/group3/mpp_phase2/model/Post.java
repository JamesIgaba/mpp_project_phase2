package com.group3.mpp_phase2.model;

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
	List<User> likesList;

	//constructor
	public Post(String postId, String content) {
		this.date = LocalDate.now();
		this.content = content;
		this.postId = postId;
		commentList = new LinkedList<Comment>();
		likesList = new LinkedList<User>();
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public List<User> getLikesList() {
		return likesList;
	}


	//add Comment
	public void addComment(Comment comment) {
		this.commentList.add(comment);
	}

	//add Like
	public void addLike(User user) {
		this.likesList.add(user);
	}


	public String getPostId() {
		return postId;
	}

	public User getUser() {
		return user;
	}

	public String getpostId() {
		return postId;
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

}

