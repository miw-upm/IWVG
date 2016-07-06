package designPatterns.exercises.n3_manager.v1.manager;

import designPatterns.exercises.n3_manager.v1.dispatchers.DispatcherPrototype;
import designPatterns.exercises.n3_manager.v1.store.FrameType;
import designPatterns.exercises.n3_manager.v1.store.StoreImplementation;

public class ServerManager {

	private Store store;

	private Server server;

	private DispatcherPrototype dispatcherPrototype;

	public ServerManager() {
		store = new StoreImplementation();
		server = new Server();
		dispatcherPrototype = new DispatcherPrototype(store, server);
	}

	private void serve() {
		FrameType frameType = null;
		do {
			String string = server.readLine();
			System.out.println("llego por socket: " + string);
			frameType = FrameType.parser(string);
			if (frameType != FrameType.CLOSE) {
				dispatcherPrototype.dispatch(frameType);
			}
		} while (frameType != FrameType.CLOSE);
		server.close();
	}

	public static void main(String[] args) {
		new ServerManager().serve();
	}

}
