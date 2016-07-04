package designPatterns.patterns.singleton.v6.subclassifing.cpp;

import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry {

	private static SingletonRegistry singletonRegistry;

	public static SingletonRegistry instance() {
		if (singletonRegistry == null){
			singletonRegistry = new SingletonRegistry();
		}
		return singletonRegistry;
	}
	
	private SingletonRegistry () {
		
	}

	private Map<String, Singleton> singletonMap = new HashMap<String, Singleton>();

	protected void register(String name, Singleton singleton) {
		singletonMap.put(name, singleton);
	}
	
	protected Singleton lookup(String name) {
		return singletonMap.get(name);
	}

}
