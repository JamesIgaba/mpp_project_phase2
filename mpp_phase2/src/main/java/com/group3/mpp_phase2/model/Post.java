package com.group3.mpp_phase2.model;

import java.util.List;
import java.time.LocalDate;
import java.util.LinkedList;

public class Post {
	// fields
	String postId;
	String content;
	String commentUserId;
	LocalDate date;
	
	List<Comment> commentList;
	List<Like> likes;
	

	//constructor
	public Post(String postId, String content) {
		this.date = LocalDate.now();
		this.content = content;
		this.postId = postId;
		commentList = new LinkedList<Comment>();
		likes = new LinkedList<Like>();
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	
	//add Comment
	public void addComment(Comment comment) {
		this.commentList.add(comment);
	}
	
	//add Like
	public void addLike(Like like) {
		this.likes.add(like);
	}
	


	public String getPostId() {
		return postId;
	}

	public String getUser() {
		return commentUserId;
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

	public List<Like> getLikes() {
		return likes;
	}

	public void setLikes(List<Like> likes) {
		this.likes = likes;
	}

}
