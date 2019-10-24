package com.group3.mpp_phase2.model;

public class Like {

	String likeId;
	String likeUserId;
	
	public Like(String likeId, String likeUserId) {
		this.likeId = likeId;
		this.likeUserId = likeUserId;
	}
	
	public String getLikeId() {
		return likeId;
	}
	public void setLikeId(String likeId) {
		this.likeId = likeId;
	}
	public String getLikeUserId() {
		return likeUserId;
	}
	public void setLikeUserId(String likeUserId) {
		this.likeUserId = likeUserId;
	}
	
}
