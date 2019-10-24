package App;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import model.Comment;
import App.CommentService;

public class CommentServiceTest {

	@Test
	public void getCommentWordCountTest() {
	//List<Comment>, String, Long> getCommentWordCount = (listOfAllComments,commentId) ->
		
		Comment comment1 = new Comment("user1comment", "hello world we are the champions");
		Comment comment2 = new Comment("user2comment", "uganda kenya tanzania");
		
		List<Comment> commentList = Arrays.asList(comment1,comment2);
		
		String commentId = comment1.getCommentId();
		
		Long actual = CommentService.getCommentWordCount.apply(commentList, commentId);
		
		Long expected = (long)6;
		
		assertEquals(expected,actual);
	}

}
