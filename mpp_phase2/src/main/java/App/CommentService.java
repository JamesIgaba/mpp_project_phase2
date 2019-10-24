package App;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

import model.Comment;
import model.Post;

public class CommentService {
	public static BiFunction<List<Comment>, String, Long> getCommentWordCount = (listOfAllComments,commentId) ->
	listOfAllComments.stream()
	.filter(c -> c.getCommentId().equals(commentId) )
	.map(c -> c.getCommentContent())
	.flatMap(cc -> Arrays.stream(cc.split(" ")))
	.count();
	
	public static Function<List<Comment>,List<String>>  getAllCommentIds = list-> // write its tests
	list.stream()
		.map(c->c.getCommentId())
		.collect(Collectors.toList());
}