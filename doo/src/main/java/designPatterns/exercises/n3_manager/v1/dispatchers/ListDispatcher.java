package designPatterns.exercises.n3_manager.v1.dispatchers;

import designPatterns.exercises.n3_manager.v1.manager.Server;
import designPatterns.exercises.n3_manager.v1.manager.Store;

public class ListDispatcher extends Dispatcher {

	public ListDispatcher(Store store, Server server) {
		super(store, server);
	}

	@Override
	public void dispatch() {
		int[][] result = store.list();
		server.println(result.length);
		for(int[] product : result){
			server.println(product[0]);
			server.println(product[1]);
		}
	}

	@Override
	public Dispatcher clone() {
		return new ListDispatcher(store, server);
	}
}
