package org.post;

import org.post.plugin.PluginManager;

public interface PostPlatform {

	PostManager getPostManager();
	
	PluginManager getPluginManager();
	
}
