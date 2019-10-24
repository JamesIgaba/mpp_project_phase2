package com.group3.mpp_phase2;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.group3.mpp_phase2.model.Post;
import com.group3.mpp_phase2.model.User;
import com.group3.mpp_phase2.service.UserService;

public class UserServiceTest {

	User user1 = new User("Jim", "Tesf", "wtesf@ginger.com", LocalDate.of(1980, 12, 30));
	User user2 = new User("James", "Igaba", "jigaba@ginger.com", LocalDate.of(1990, 12, 30));
	User user3 = new User("Jim", "Kat", "jkat@ginger.com", LocalDate.of(1980, 12, 25));
	
	List<User> users = Arrays.asList(user1,user2,user3);
	
	@Test
	public void getByEmailserviceTest() 
	{
	
		User expected = user1;
		User actual = UserService.getByEmailservice.apply(users, "wtesf@ginger.com");
		assertEquals(expected, actual);
	}
	
	@Test 
	public void getUsersByFirstNameTest()
	{
		List<User> expected = Arrays.asList(user1,user3);
		List<User> actual = UserService.getUsersByFirstName.apply("Jim",users);
		assertEquals(expected, actual);
	}
	
	@Test 
	public void getFriendsTest()
	{
		user1.addFriend(user2);
		user1.addFriend(user3);
		List<User> expected = Arrays.asList(user2,user3);
		List<User> actual = UserService.getFriends.apply(users, "wtesf@ginger.com");
		assertEquals(expected, actual);
	}
	
//	@Test 
//	public void getByAgeTest()
//	{	
//	
////		user1.setAge();
////		user2.setAge();
////		user3.setAge();
//		List<User> expected = Arrays.asList(user1,user3);
//		List<User> actual = UserService.getByAge.apply(users, 38);
//		assertEquals(expected, actual);
//	}
//	
	@Test 
	public void getFriendRequestsTest()
	{
		user1.addFriendRequest(user2);
		user1.addFriendRequest(user3);
		
		//user1.getFriendRequestList();
		List<User> expected = Arrays.asList(user2,user3);
		List<User> actual = UserService.getFriendRequests.apply(users, "wtesf@ginger.com");
		assertEquals(expected, actual);
	}
	@Test 
	public void  getTopKFamousUsersTest()
	{
		user1.addFriend(user2);
		user1.addFriend(user3);
		user2.addFriend(user1);
		user3.addFriend(user2);
	List<User> expected = Arrays.asList(user1);
	List<User> actual = UserService.getTopKFamousUsers.apply(users, 1);
	assertEquals(expected, actual);
	
	}
	
	@Test 
	public void getTopKUsersWithMostPostsTest()
	{
		Post p1 = new Post("123", "hello people");
		Post p2 = new Post("113", "Good day");
		Post p3 = new Post("124", "Thoughts?");
		Post p4 = new Post("223", "hey there");
		Post p5 = new Post("323", "keep on scrolling");
		user1.addPost(p1);
		user1.addPost(p2);
		user1.addPost(p3);
		user2.addPost(p4);
		user3.addPost(p5);
		
		List<User> expected = Arrays.asList(user1);
		List<User> actual = UserService.getTopKUsersWithMostPosts.apply(users, 1);
		assertEquals(expected, actual);
		
		
		
	}
	

}