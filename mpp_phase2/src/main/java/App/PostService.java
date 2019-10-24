package App;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

import FuncInterface.TriFunction;
import model.Comment;
import model.Like;
import model.Post;
import model.User;

public class PostService {
	public static TriFunction< List<User>, Integer, Set<String>, List<String>> getTopKWordsInPostWithoutStopWords =
			(listOfAllUsers,k,stopWords) -> 
	listOfAllUsers.stream()
	.flatMap(u -> u.getPostList().stream())
	.map(p -> p.getContent())
	.flatMap(c -> Arrays.stream(c.split(" ")))
	.filter(w -> !stopWords.contains(w))
	.collect(Collectors.groupingBy( Function.identity(), Collectors.counting()))
	.entrySet().stream()
	.sorted( (e1,e2) -> e2.getValue().compareTo( e1.getValue() ))
	.map(Map.Entry::getKey)
	.limit(k)
	.collect( Collectors.toList() );
	
	public static BiFunction<List<Post>, String, Post> getpostById = (listOfAllPosts, postId) ->
	listOfAllPosts.stream()
	.filter(p -> p.getpostId().equals( postId))
	.findFirst()
	.get();	
	
	public static BiFunction< List<Post>, String, List<Comment>> getPostComments = (listOfAllPosts,postId) ->
	listOfAllPosts.stream()
	.filter(p -> p.getpostId().equals(postId) )
	.flatMap(p -> p.getCommentList().stream())
	.collect(Collectors.toList());
	
	public static BiFunction< List<Post>, String, Long> getPostCommentCount = (listOfAllPosts, postId) ->
	listOfAllPosts.stream()
	.filter(p -> p.getpostId().equals(postId))
	.flatMap(p -> p.getCommentList().stream())
	.count();

	public static BiFunction< List<Post> ,Integer,List<Post>> getTopKPostsWithMostCommments = (listOfAllPosts, k) ->
	listOfAllPosts.stream()
	.sorted( (p1,p2) -> p2.getCommentList().size() - p1.getCommentList().size())
	.limit(k)
	.collect(Collectors.toList());
	
	public static Function< List<Post>, Post> getPostWithMostComments = (listOfAllPosts) ->
	listOfAllPosts.stream()
	.max( (p1,p2) -> p1.getCommentList().size() - p2.getCommentList().size())
	.get();
	
	public static BiFunction< List<Post>, String,List<Like>> getPostLikes = (listOfAllPosts,postId) ->
	listOfAllPosts.stream()
	.filter(p -> p.getpostId().equals(postId))
	.flatMap(p -> p.getLikesList().parallelStream())
	.collect(Collectors.toList());
	
	public static Function<List<Post>,List<String>>  getAllPostsIds = list-> // write its tests
	list.stream()
		.map(p->p.getpostId())
		.collect(Collectors.toList());
}
