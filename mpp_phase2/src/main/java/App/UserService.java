package App;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

import model.User;

public class UserService {
	
//	public static Function<List<User>,List<User>> getAllUsers = listOfAllUsers ->
//	
//	listOfAllUsers.stream()
//	.collect(Collectors.toList());
//	

	public static BiFunction<List<User>, String, User> getByEmailservice = (listOfAllUsers, emailId) ->

	listOfAllUsers.stream().filter(u -> u.getEmailId().equals(emailId)).findFirst().get();

	public static BiFunction<String, List<User>, List<User>> getUsersByFirstName = (firstName,
			listOfAllUsers) -> listOfAllUsers.stream().filter(u -> u.getFirstName().equals(firstName))
					.collect(Collectors.toList());

    public static BiFunction<List<User>, String, List<User>> getFriends = (listOfAllUsers, emailId) -> listOfAllUsers.stream()
			.filter(u -> u.getEmailId().equals(emailId)).flatMap(u -> u.getFriendsList().stream())
			.collect(Collectors.toList());

    public static BiFunction<List<User>, Integer, List<User>> getByAge = (listOfAllUsers, age) -> listOfAllUsers.stream()
			.filter(u -> u.getAge() == age).collect(Collectors.toList());

    public static BiFunction<List<User>, String, List<User>> getFriendRequests = (listOfAllUsers, emailId) ->

	listOfAllUsers.stream().filter(u -> u.getEmailId().equals(emailId)).flatMap(u -> u.getFriendRequestList().stream())
			.collect(Collectors.toList());

	public static BiFunction<List<User>, Integer, List<User>> getTopKFamousUsers = (listOfAllUsers, k) ->

	listOfAllUsers.stream().sorted((u1, u2) -> u2.getFriendsList().size() - u1.getFriendsList().size()).limit(k)
			.collect(Collectors.toList());

	public static BiFunction<List<User>, Integer, List<User>> getTopKUsersWithMostPosts = (listOfAllUsers, k) -> listOfAllUsers
			.stream().sorted((u1, u2) -> u2.getPostList().size() - u1.getPostList().size()).limit(k)
			.collect(Collectors.toList());

}
