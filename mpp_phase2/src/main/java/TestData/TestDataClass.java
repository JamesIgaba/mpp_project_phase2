package TestData;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import model.Post;
import model.User;

public class TestDataClass {

	List<User> listOfAllUsers;


	public List<User> getListOfAllUsers() {
		
		// USERS

		User user1 = new User("Andrew", "Walugembe", "awalugembe@gmail.com", LocalDate.of(1991, 10, 1));
		User user2 = new User("Jim", "Katunguka", "jkatunguka@gmail.com", LocalDate.of(1994, 10, 23));
		User user3 = new User("Abdul", "Rahman", "arahman@gmail.com", LocalDate.of(2005, 9, 11));
		 User user4 = new User("Wina", "Test", "wtest@gmail.com", LocalDate.of(1999, 10, 15));
		 User user5 = new User("James", "Igaba", "jigaba@gmail.com", LocalDate.of(1996, 7, 8));
		 User user6 = new User("Gilbert", "Sebaduka", "gsebaduka@gmail.com", LocalDate.of(2006, 2, 3));
		 User user7 = new User("Felix", "Didier", "fdidier@gmail.com", LocalDate.of(1998, 6, 22));
		 User user8 = new User("Eric", "James", "ejames@gmail.com", LocalDate.of(1990, 5, 1));
		 User user9 = new User("Mohammed", "Ezat", "mohammedezat@gmail.com", LocalDate.of(1992, 6, 6));
		 User user10 = new User("Ibrahim", "Elbaloty", "ielbaloty@gmail.com", LocalDate.of(2010, 7, 30));

		 User user11 = new User("Sameer", "Maharjan", "s.Maharjan@gmail.com", LocalDate.of(2015, 6, 3));
		 User user12 = new User("Jean", "Delape", "jdelape@gmail.com", LocalDate.of(1997, 2, 12));
		 User user13 = new User("Julius", "Jingo", "juliusjingo@gmail.com", LocalDate.of(1993, 11, 1));
		 User user14 = new User("paul", "Tumwine", "paulTumwine@gmail.com", LocalDate.of(2005, 12, 30));
		 User user15 = new User("Duncan", "Sanya", "duncanSanya@gmail.com", LocalDate.of(1997, 8, 13));

		// POSTS
		 Post p1 = new Post("1", "The very first post");
		 Post p2 = new Post("2", "The very second post");
		 Post p3 = new Post("3", "The very third post");
		 Post p4 = new Post("4", "The very fourth post");
		 Post p5 = new Post("5", "The very fifth post");
		 Post p6 = new Post("6", "The very sixth post");
		 Post p7 = new Post("7", "The very seventh post");
		 Post p8 = new Post("8", "The very eight post");
		 Post p9 = new Post("9", "The very nineth post");
		 Post p10 = new Post("10", "The very tenth post");
		 Post p11 = new Post("11", "The very eleventh post");
		 Post p12 = new Post("12", "The very twelveth post");
		 Post p13 = new Post("13", "The very thirteenth post");
		 Post p14 = new Post("14", "The very fourteenth post");
		 Post p15 = new Post("15", "The very fifteen post");
		 Post p16 = new Post("16", "The very sixteen post");
		 Post p17 = new Post("17", "The very seventeen post");
		 Post p18 = new Post("18", "The very eighteen post");
		 Post p19 = new Post("19", "The very ninteen post");
		 Post p20 = new Post("20", "The very twenteith post");

		listOfAllUsers = Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9,
				user10, user11, user12, user13, user14, user15);

		user1.setFriendsList(Arrays.asList(user3,user5,user7,user14));
		user1.setFriendRequestList(Arrays.asList(user10,user12,user13));
		user1.setPostList(Arrays.asList(p1,p16,p17));
		
		user2.setFriendsList(Arrays.asList(user3,user8,user7,user15,user1,user2,user5));
		user2.setFriendRequestList(Arrays.asList(user14,user9,user13));
		user2.setPostList(Arrays.asList(p2,p18,p19));
		
		user3.setFriendsList(Arrays.asList(user7,user11,user13,user9));
		user3.setFriendRequestList(Arrays.asList(user1,user2,user5));
		user3.setPostList(Arrays.asList(p3,p20));
		
		user4.setFriendsList(Arrays.asList(user13,user14,user12,user15,user11,user13,user9));
		user4.setFriendRequestList(Arrays.asList(user6,user7,user8));
		user4.setPostList(Arrays.asList(p4));
		
		user5.setFriendsList(Arrays.asList(user1,user2,user3,user4));
		user5.setFriendRequestList(Arrays.asList(user10,user11,user12));
		user5.setPostList(Arrays.asList(p5));
		
		user6.setFriendsList(Arrays.asList(user2,user3,user4,user5));
		user6.setFriendRequestList(Arrays.asList(user12,user13,user14));
		user6.setPostList(Arrays.asList(p6));
		
		user7.setFriendsList(Arrays.asList(user8,user9,user10,user11));
		user7.setFriendRequestList(Arrays.asList(user3,user2,user5));
		user7.setPostList(Arrays.asList(p7));
		
		user8.setFriendsList(Arrays.asList(user9,user10,user11,user12,user7,user8,user2));
		user8.setFriendRequestList(Arrays.asList(user4,user6,user5));
		user8.setPostList(Arrays.asList(p8));
		
		user9.setFriendsList(Arrays.asList(user6,user7,user8,user2));
		user9.setFriendRequestList(Arrays.asList(user12,user13,user14));
		user9.setPostList(Arrays.asList(p9));
		
		user10.setFriendsList(Arrays.asList(user3,user4,user5,user7));
		user10.setFriendRequestList(Arrays.asList(user13,user11,user14));
		user10.setPostList(Arrays.asList(p10));
		
		user11.setFriendsList(Arrays.asList(user4,user3,user6,user5));
		user11.setFriendRequestList(Arrays.asList(user15,user2,user9));
		user11.setPostList(Arrays.asList(p11));
		
		user12.setFriendsList(Arrays.asList(user6,user5,user7,user9));
		user12.setFriendRequestList(Arrays.asList(user4,user8,user1));
		user12.setPostList(Arrays.asList(p12));
		
		user13.setFriendsList(Arrays.asList(user1,user3,user5,user7));
		user13.setFriendRequestList(Arrays.asList(user9,user12,user2));
		user13.setPostList(Arrays.asList(p13));
		
		user14.setFriendsList(Arrays.asList(user2,user4,user6,user8));
		user14.setFriendRequestList(Arrays.asList(user7,user8,user9));
		user14.setPostList(Arrays.asList(p14));
		
		user15.setFriendsList(Arrays.asList(user5,user1,user7,user10));
		user15.setFriendRequestList(Arrays.asList(user3,user2,user14));
		user15.setPostList(Arrays.asList(p3));
		

		
		return listOfAllUsers;
	}

}
