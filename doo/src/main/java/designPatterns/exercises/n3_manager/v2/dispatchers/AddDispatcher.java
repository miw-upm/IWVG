package designPatterns.exercises.n3_manager.v2.dispatchers;

import designPatterns.exercises.n3_manager.v2.store.FrameType;
import designPatterns.exercises.n3_manager.v2.manager.Server;
import designPatterns.exercises.n3_manager.v2.manager.Store;

public class AddDispatcher extends Dispatcher {

	public AddDispatcher(Store store, Server server) {
		super(store, server);
	}

	@Override
	public void dispatch() {
		try {
			int code = Integer.parseInt(server.readLine());
			int amount = Integer.parseInt(server.readLine());
			store.add(code, amount);
			server.println(FrameType.ACK.name());
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public Dispatcher clone() {
		return new AddDispatcher(store, server);
	}

}
