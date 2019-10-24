import java.util.Scanner;

import App.CommentService;
import App.PostService;
import App.UserService;
import TestData.TestDataClass;
import TestData.TestPosts;

public class Main {

	TestDataClass tdc = new TestDataClass();
	

	public static void main(String[] args) {
		System.out.println("                        WELCOME TO GINGER SOCIAL MEDIA NETWORK ");
		System.out.println();
		System.out.println(" please choose the number ");
		System.out.println();
		System.out.print("1- All Ginger Users" + "\n2-enter firstName of a user to view their details "
				+ "\n3-Enter emailId of user to view and link up with their friends "
				+ "\n4-Enter emailId of the user to see their pending friend requests "
				+ "\n5-Top k Famous Users by number of friends " + "\n6-Top k Famous Users by number of posts "
				+ "\n7-Enter age to display user above that age " + "\n8-Enter emailId to search user by emailId "
				+ "\n9-get all post ids"
				+ "\n10-get post by Id "
				+ "\n11-get post comments "
				+ "\n12-get post comment count "+
                "\n13-get top K words in a post "
                + "\n14-get top K posts by Comments "
                + "\n15-get top post by comments "
                + "\n16- get all comment ids "
                + "\n17- get comment word count"
				);
			
		System.out.println('\n');
		System.out.println("choice : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		selectQuetion(num);
	}

	public static void selectQuetion(int quetionNum) {
		TestDataClass tdc =new TestDataClass();
		TestPosts tp = new TestPosts();
		Scanner sc = new Scanner(System.in);
		switch (quetionNum) {
		case 1: {
			System.out.println("Function: getAllUsers");
			
			tdc.getListOfAllUsers()
			.parallelStream()
			.forEach( u -> System.out.println(u));
			
			break;
		}
		case 2: {
			System.out.println("Function: getUsersByFirstName");
			System.out.println("Enter FirstName");
			String FirstName = sc.nextLine();

			System.out.println(UserService.getUsersByFirstName.apply(FirstName, tdc.getListOfAllUsers()));

			break;
		}
		case 3: {
			System.out.println("Function: getFriends");
			System.out.println("Enter emailId");
			String emailId = sc.nextLine();

			System.out.println(UserService.getFriends.apply(tdc.getListOfAllUsers(), emailId));
			break;
		}
		case 4: {
			System.out.println("Function: getFriendRequests");
			System.out.println("Enter emailId");
			String emailId = sc.nextLine();

			System.out.println(UserService.getFriendRequests.apply(tdc.getListOfAllUsers(), emailId));
			break;
		}
		case 5: {
			System.out.println("Function: getTopKFamousUsers");
			System.out.println("Enter k(limit)");
			int k = sc.nextInt();

			System.out.println(UserService.getTopKFamousUsers.apply(tdc.getListOfAllUsers(), k));
			break;
		}
		case 6: {
			System.out.println("Function: getTopKUsersWithMostPosts");
			System.out.println("Enter k(limit)");
			int k = sc.nextInt();

			System.out.println(UserService.getTopKUsersWithMostPosts.apply(tdc.getListOfAllUsers(), k));
			break;
		}
		case 7: {
			System.out.println("Function: getByAge");
			System.out.println("Enter k(limit)");
			int k = sc.nextInt();

			System.out.println(UserService.getByAge.apply(tdc.getListOfAllUsers(), k));
			break;
		}
		case 8: {
			System.out.println("Function: getByEmailId");
			System.out.println("Enter emailId");
			String emailId = sc.nextLine();

			System.out.println(UserService.getByEmailservice.apply(tdc.getListOfAllUsers(), emailId));
			break;
		}
		   case 9 :{
               System.out.println("Here are all post ids");
               System.out.println(PostService.getAllPostsIds.apply(tp.getAllPost()));
               break;
           }
           
           case 10:{
           	System.out.println("Enter any of the ids to view the details of the post");
           	String k = sc.next();
           	
               System.out.println(PostService.getpostById.apply(tp.getAllPost(), k));
               break;
           }
           
           case 11:{
           	System.out.println("Enter any of the post ids to view the comments");
           	String k = sc.next();
           	
               System.out.println(PostService.getPostComments.apply(tp.getAllPost(), k));
               break;
           }
           
           case 12:{
           	System.out.println("Enter any of the post ids to get a count of their comments");
           	String k = sc.next();
           	
               System.out.println(PostService.getPostCommentCount.apply(tp.getAllPost(), k));
               break;
           }
           
           case 13:{
           	System.out.println("Get top K words in a post");
           	System.out.println("Please enter number of needed words");
           	int k = sc.nextInt();
           	
             // System.out.println(PostService.getTopKWordsInPostWithoutStopWords.apply(tp.getAllPost(), k, stopwords));
               break;
           }
           
           case 14:{
           	System.out.println("Get top K posts by comment");
           	System.out.println("Please enter number of posts");
           	int k = sc.nextInt();
           	
               System.out.println(PostService.getTopKPostsWithMostCommments.apply(tp.getAllPost(), k));
               break;
           }
           
           case 15:{
           	System.out.println("get top post by comments");
           	
               System.out.println(PostService.getPostWithMostComments.apply(tp.getAllPost()));
               break;
           }
           
           case 16 :{
               System.out.println("Here are all comment ids");
               System.out.println(CommentService.getAllCommentIds.apply(tp.getAllComments()));
               break;
           }
           case 17:{
           	System.out.println("Enter any of the comment ids to get a count of their words");
           	String k = sc.next();
           	
               System.out.println(CommentService.getCommentWordCount.apply(tp.getAllComments(), k));
               break;
           }
           default: {
               System.out.println("please enter number between 1 : 17");
              
           }
          

		}
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.println();
		System.out.println("select another function");

		int num = sc.nextInt();
		selectQuetion(num);
	}

}
