package com.group3.mpp_phase2.service;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import com.group3.mpp_phase2.model.User;

public class UserService {
	
	public static BiFunction< List<User>, Integer, List<User>> getTopKUsersWithMostPosts = (listOfAllUsers, k) ->
	listOfAllUsers.stream()
	.sorted( (u1,u2) -> u2.getPostList().size() - u1.getPostList().size())
	.limit(k)
	.collect(Collectors.toList());
	
}
