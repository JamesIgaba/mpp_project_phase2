package Main;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.group3.mpp_phase2.service.PostService;

public class Main {

	public static void main(String[] args) {//throws IOException, ParseException {
		 consoleApp();
	}
		
		 public static void consoleApp() {
		        System.out.println("                        Welcome to Ginger Project ");
		        System.out.println();
		        System.out.println(" please choose the number ");
		        System.out.println();
		        System.out.print("1-get all post ids\n2-get post by Id \n3-get post comments \n4-get post comment count "+
		                "\n5-get top K words in a post \n6-get top K posts by Comments \n7-get top post by comments "+
		                "\n8-get post likes \n9- get all comment ids \n10- get comment word count");//8 off
		        System.out.println('\n');
		        System.out.println("choice : ");
		        Scanner sc = new Scanner(System.in);
		        int num = sc.nextInt();

		        selectQuestion(num);
		 }
		    
		    public static void selectQuestion(int questionNum) {//throws IOException, ParseException {
		    	TestPosts tp = new TestPosts();
		    	Set<String> stopwords = new HashSet<>();
		    	stopwords.add("is");
		    	stopwords.add("the");
 		        Scanner sc = new Scanner(System.in);
		        switch (questionNum){
		            case 1 :{
		                System.out.println("Here are all post ids");
		                System.out.println(PostService.getAllPostsIds.apply(tp.getAllPost()));
		                break;
		            }
		            
		            case 2:{
		            	System.out.println("Enter any of the ids to view the details of the post");
		            	String k = sc.next();
		            	
		                System.out.println(PostService.getpostById.apply(tp.getAllPost(), k));
		                break;
		            }
		            
		            case 3:{
		            	System.out.println("Enter any of the post ids to view the comments");
		            	String k = sc.next();
		            	
		                System.out.println(PostService.getPostComments.apply(tp.getAllPost(), k));
		                break;
		            }
		            
		            case 4:{
		            	System.out.println("Enter any of the post ids to get a count of their comments");
		            	String k = sc.next();
		            	
		                System.out.println(PostService.getPostCommentCount.apply(tp.getAllPost(), k));
		                break;
		            }
		            
		            case 5:{
		            	System.out.println("Get top K words in a post");
		            	System.out.println("Please enter number of needed words");
		            	int k = sc.nextInt();
		            	
		              // System.out.println(PostService.getTopKWordsInPostWithoutStopWords.apply(tp.getAllPost(), k, stopwords));
		                break;
		            }
		            
		            case 6:{
		            	System.out.println("Get top K posts by comment");
		            	System.out.println("Please enter number of posts");
		            	int k = sc.nextInt();
		            	
		                System.out.println(PostService.getTopKPostsWithMostCommments.apply(tp.getAllPost(), k));
		                break;
		            }
		            
		            case 7:{
		            	System.out.println("get top post by comments");
		            	
		                System.out.println(PostService.getPostWithMostComments.apply(tp.getAllPost()));
		                break;
		            }
		            
		            case 8:{
		            	System.out.println("Get top K posts by comment");
		            	System.out.println("Please enter number of posts");
		            	int k = sc.nextInt();
		            	
		                System.out.println(PostService.getTopKPostsWithMostCommments.apply(tp.getAllPost(), k));
		                break;
		            }
		            case 9 :{
		                System.out.println("Here are all comment ids");
		                System.out.println(CommentService.getAllCommentIds.apply(tp.getAllComments()));
		                break;
		            }
		            case 10:{
		            	System.out.println("Enter any of the comment ids to get a count of their words");
		            	String k = sc.next();
		            	
		                System.out.println(CommentService.getCommentWordCount.apply(tp.getAllComments(), k));
		                break;
		            }
		            default: {
		                System.out.println("please enter number between 1 : 10");
		                consoleApp();
		            }

		        }
		        System.out.println();
		        System.out.println("-------------------------------------------------------");
		        System.out.println();
		        System.out.println("select another function");


		        int num = sc.nextInt();
		        selectQuestion(num);
		    }


		        }

	

