package org.post.plugin;

import java.io.File;
import java.util.List;

public interface PluginManager {

	List<Plugin> loadAll(File pluginsFolder);
	
	Plugin load(File file);
	
	List<Plugin> getPlugins();
	
	Plugin getPlugin(String name);
	
	void unloadAll();
	
	void unload(Plugin plugin);
	
}
