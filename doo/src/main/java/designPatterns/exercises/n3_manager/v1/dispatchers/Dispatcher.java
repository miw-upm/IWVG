package designPatterns.exercises.n3_manager.v1.dispatchers;

import java.io.BufferedReader;
import java.io.PrintWriter;

import designPatterns.exercises.n3_manager.v1.manager.Store;

public abstract class Dispatcher {

	protected Store store;
	
	protected BufferedReader in;
	
	protected PrintWriter out;
	
	public Dispatcher(Store store, BufferedReader in, PrintWriter out) {
		this.store = store;
		this.in = in;
		this.out = out;
	}
	
	public abstract void dispatch();
}
