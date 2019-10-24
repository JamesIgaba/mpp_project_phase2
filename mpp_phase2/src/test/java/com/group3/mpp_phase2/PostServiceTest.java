package com.group3.mpp_phase2;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import com.group3.mpp_phase2.model.Comment;
import com.group3.mpp_phase2.model.Like;
import com.group3.mpp_phase2.model.Post;
import com.group3.mpp_phase2.model.User;
import com.group3.mpp_phase2.service.PostService;

public class PostServiceTest {
	
	User user1 = new User("James", "Igaba", "jigaba@ginger.com", LocalDate.of(1935, 8, 28));
	User user2 = new User("Wina", "Tesf", "wtesf@ginger.com", LocalDate.of(1965, 10, 9));
	User user3 = new User("Jim", "Kat", "jkat@ginger.com", LocalDate.of(1980, 7, 4));

	Post post1 = new Post("p1", "the weather is cool");
	Post post2 = new Post("p2", "weather is getting worse by the day.");
	Post post3 = new Post("p3", "I am loving how cool the weather is");
	
	Comment comment1 = new Comment("c1", "sure it is.");
	Comment comment2 = new Comment("c2", "winter is coming!");
	Comment comment3 = new Comment("c3", "Don't get too comfortable");
	
	Like like1 = new Like("l1", "u1");
	Like like2 = new Like("l2", "u3");
	Like like3 = new Like("l3", "u4");

	private List<Post> posts = Arrays.asList(post1,post2,post3);
	private List<User> users = Arrays.asList(user1, user2, user3);
	Set<String> stopWords = Set.of("it","is","the","how","I","am","by");
	
	@Test
	public void getTopKWordsInPostWithoutStopWordsTest() {
		
		user1.addPost(post2);
		user2.addPost(post3);
		user3.addPost(post1);
		
		List<String> actual = Arrays.asList("weather", "cool");
		List<String> expected = PostService.getTopKWordsInPostWithoutStopWords.apply(users, 2, stopWords);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getpostByIdTest() {
		Post expected = post2;
		Post actual = PostService.getpostById.apply(posts, "p2");
		
		assertEquals(expected, actual);
	}
	
}
