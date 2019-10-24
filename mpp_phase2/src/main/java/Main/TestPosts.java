package TestData;

import java.util.Arrays;
import java.util.List;
import model.*;

public class TestPosts {
	List<Post>allPosts;
	List<Comment>allComments;
	public List<Comment> getAllComments() {
		
		 Comment c1 = new Comment("1", "The very first ");
		 Comment c2 = new Comment("2", "The very second ");
		 Comment c3 = new Comment("3", "The very third ");
		 Comment c4 = new Comment("4", "The very fourth ");
		 Comment c5 = new Comment("5", "The very fifth ");
		 Comment c6 = new Comment("6", "The very sixth ");
		 Comment c7 = new Comment("7", "The very seventh ");
		 Comment c8 = new Comment("8", "The very eight ");
		 Comment c9 = new Comment("9", "The very nineth ");
		 Comment c10 = new Comment("10", "The very tenth ");
		 Comment c11 = new Comment("11", "The very eleventh ");
		 Comment c12 = new Comment("12", "The very twelveth ");
		 Comment c13 = new Comment("13", "The very thirteenth ");
		 Comment c14 = new Comment("14", "The very fourteenth ");
		 Comment c15 = new Comment("15", "The very fifteen ");
		 Comment c16 = new Comment("16", "The very sixteen ");
		 Comment c17 = new Comment("17", "The very seventeen ");
		 Comment c18 = new Comment("18", "The very eighteen ");
		 Comment c19 = new Comment("19", "The very ninteen ");
		 Comment c20 = new Comment("20", "The very twenteith ");
		 
		 allComments = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20);
		return allComments;
	}
	public List<Post> getAllPost(){
	//posts
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
	
	//Comments.
	 Comment c1 = new Comment("1", "The very first ");
	 Comment c2 = new Comment("2", "The very second ");
	 Comment c3 = new Comment("3", "The very third ");
	 Comment c4 = new Comment("4", "The very fourth ");
	 Comment c5 = new Comment("5", "The very fifth ");
	 Comment c6 = new Comment("6", "The very sixth ");
	 Comment c7 = new Comment("7", "The very seventh ");
	 Comment c8 = new Comment("8", "The very eight ");
	 Comment c9 = new Comment("9", "The very nineth ");
	 Comment c10 = new Comment("10", "The very tenth ");
	 Comment c11 = new Comment("11", "The very eleventh ");
	 Comment c12 = new Comment("12", "The very twelveth ");
	 Comment c13 = new Comment("13", "The very thirteenth ");
	 Comment c14 = new Comment("14", "The very fourteenth ");
	 Comment c15 = new Comment("15", "The very fifteen ");
	 Comment c16 = new Comment("16", "The very sixteen ");
	 Comment c17 = new Comment("17", "The very seventeen ");
	 Comment c18 = new Comment("18", "The very eighteen ");
	 Comment c19 = new Comment("19", "The very ninteen ");
	 Comment c20 = new Comment("20", "The very twenteith ");
	 
	 	p1.addComment(c1);
		p1.addComment(c2);
		p1.addComment(c3);
		
		p2.addComment(c4);
		p2.addComment(c5);
		p2.addComment(c6);
		p2.addComment(c7);
		
		p3.addComment(c8);
		p3.addComment(c9);
		p3.addComment(c10);
		p3.addComment(c11);
		p3.addComment(c12);
		
		p4.addComment(c13);
		p4.addComment(c14);
		p4.addComment(c15);
		p4.addComment(c16);
		p4.addComment(c17);
		p4.addComment(c18);
		
		p5.addComment(c19);
		p5.addComment(c20);
		
		p6.addComment(c1);
		p6.addComment(c2);
		p6.addComment(c3);
		
		p7.addComment(c4);
		p7.addComment(c5);
		p7.addComment(c6);
		p7.addComment(c7);
		
		p8.addComment(c8);
		p8.addComment(c9);
		p8.addComment(c10);
		p8.addComment(c11);
		p8.addComment(c12);
		
		p9.addComment(c13);
		p9.addComment(c14);
		p9.addComment(c15);
		p9.addComment(c16);
		p9.addComment(c17);
		p9.addComment(c18);
		
		p10.addComment(c19);
		p10.addComment(c20);
		
	 allPosts = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20);
	
	 
	 return allPosts;
}
}
