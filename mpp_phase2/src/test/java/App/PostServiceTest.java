package App;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import model.Comment;
import model.Like;
import model.Post;
import model.User;


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
	Set<String> stopWords = new HashSet<>(); 
	
	
	
	@Test
	public void getTopKWordsInPostWithoutStopWordsTest() {
		
		stopWords.add("it");
		stopWords.add("is");
		stopWords.add("the");
		stopWords.add("how");
		stopWords.add("I");
		stopWords.add("am");
		stopWords.add("by");
		
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
	
	
	
	@Test
	public void getPostCommentsTest() {
		
		post2.addComment(comment1);
		post2.addComment(comment2);
		post2.addComment(comment3);
		
		List<Comment> expected = Arrays.asList(comment1, comment2, comment3);
		List<Comment> actual = PostService.getPostComments.apply(posts, "p2");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getPostCommentCountTest() {
		
		post2.addComment(comment1);
		post2.addComment(comment2);
		
		Long expected = (long) 2;
		Long actual = PostService.getPostCommentCount.apply(posts, "p2");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getTopKPostsWithMostCommmentsTest() {
		
		post2.addComment(comment1);
		post2.addComment(comment2);
		post3.addComment(comment3);
		
		List<Post> expected = Arrays.asList(post2,post3,post1);
		List<Post> actual = PostService.getTopKPostsWithMostCommments.apply(posts, 3);
		
		assertEquals(expected, actual);
	}

	@Test
	public void getPostWithMostCommentsTest() {
		
		post2.addComment(comment1);
		post2.addComment(comment2);
		post3.addComment(comment3);
		
		Post expected = post2;
		Post actual = PostService.getPostWithMostComments.apply(posts);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getPostLikesTest() {
		
		post1.addLike(like1);
		post1.addLike(like2);
		post2.addLike(like3);
		
		List<Like> expected = Arrays.asList(like1, like2);
		List<Like> actual = PostService.getPostLikes.apply(posts, "p1");
		
		assertEquals(expected, actual);
	}
	
	
}
