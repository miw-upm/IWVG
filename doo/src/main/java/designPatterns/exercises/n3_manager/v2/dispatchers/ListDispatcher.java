package designPatterns.exercises.n3_manager.v2.dispatchers;

import designPatterns.exercises.n3_manager.v2.manager.Server;
import designPatterns.exercises.n3_manager.v2.manager.Store;
import designPatterns.exercises.n3_manager.v2.store.FrameType;

public class ListDispatcher extends Dispatcher {

	public ListDispatcher(Store store, Server server) {
		super(store, server);
	}

	@Override
	public void dispatch() {
		int[][] result = store.list();
		server.println(FrameType.ACK.name());
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
