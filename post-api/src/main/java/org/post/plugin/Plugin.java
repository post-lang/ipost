package org.post.plugin;

public interface Plugin {
	
	void getName();
	
	void onLoad();
	
	void onUnload();
	
}
