package org.post;

import java.io.File;

public interface Postizer<T> {

	void load(File source);
	
	T postize();
	
	void write(File target);
	
}
