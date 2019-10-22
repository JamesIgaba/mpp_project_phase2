package com.group3.mpp_phase2.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedList;
import java.util.List;

public class User {

	//fields
	String firstName;
	String lastName;
	String emailId;

	int age;
	LocalDate dateOfBirth;

	List<User> friendsList;
	List<User> friendRequestList;
	List<Post> postList;

	//constructor
	public User(String firstName, String lastName, String emailId, LocalDate dateOfBirth ) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;

		this.dateOfBirth = dateOfBirth ;
		friendsList = new LinkedList<User>();
		friendRequestList = new LinkedList<User>();
		postList = new LinkedList<Post>();
	}

	public List<Post> getPostList() {
		return postList;
	}

	public int getAge() {
		Period p = Period.between(this.dateOfBirth, LocalDate.now());
		this.age = p.getYears();
		return age;
	}

	public List<User> getFriendsList() {
		return friendsList;
	}

	//for real application make addFriend method
	public void setFriendsList(List<User> friendsList) {
		this.friendsList = friendsList;
	}

	//add Friend Request
	public void addFriendRequest(User user) {
		friendRequestList.add(user);
	}

	//add Friend
	public void addFriend(User user) {
		this.friendsList.add(user);

	}

	//add Post
	public void addPost(Post post) {
		this.postList.add(post);

	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public List<User> getFriendRequestList() {
		return friendRequestList;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}	

}


