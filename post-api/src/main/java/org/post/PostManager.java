package org.post;

public interface PostManager {

	void registerPostizer(Postizer<?> postizer);
	
	Postizer<?> getPostizer(String id);
	
	void unregisterPostizer(String id);
	
	void unregisterPostizer(Postizer<?> postizer);
	
}
