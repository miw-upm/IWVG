package designPatterns.exercises.n3_manager.v1.dispatchers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import designPatterns.exercises.n3_manager.v1.manager.Store;

public class AddDispatcher extends Dispatcher {

	public AddDispatcher(Store store, BufferedReader in, PrintWriter out) {
		super(store, in, out);
	}

	@Override
	public void dispatch() {
		try {
			int code = Integer.parseInt(in.readLine());
			int amount = Integer.parseInt(in.readLine());
			store.add(code, amount);
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
