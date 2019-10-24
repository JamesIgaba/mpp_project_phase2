package model;

public class Comment {

	String commentId;
	String commentContent;
	String commentUserId;
	String postId;
	
	public Comment(String commentId, String commentContent) {
		this.commentContent = commentContent;
		this.commentId = commentId;
	}
	
	public String getCommentId() {
		return commentId;
	}

	public String getCommentUserId() {
		return commentUserId;
	}
	
	public String getPostId() {
		return postId;
	}
	
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	@Override
	public String toString() {
		return commentContent;
	}
	
	
}
