package org.post;

public class Post {
	
	private static PostPlatform post;
	
	public static PostPlatform getPost(){
		return post;
	}
	
	public static void setPost(PostPlatform p){
		post=p;
	}
	
}
