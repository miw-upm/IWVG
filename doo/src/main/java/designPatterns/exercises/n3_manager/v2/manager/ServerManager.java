package designPatterns.exercises.n3_manager.v2.manager;

import designPatterns.exercises.n3_manager.v2.dispatchers.DispatcherPrototype;
import designPatterns.exercises.n3_manager.v2.store.FrameType;
import designPatterns.exercises.n3_manager.v2.store.StoreImplementation;

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
			try {
				String string = server.readLine();
				System.out.println("llego por socket: " + string);
				frameType = FrameType.parser(string);
//				this.randomError();
				if (frameType != FrameType.CLOSE) {
					dispatcherPrototype.dispatch(frameType);
				}
			} catch (Exception ex) {
//				this.recoverError();
			}
		} while (frameType != FrameType.CLOSE);
		server.close();
	}

//	private void randomError() throws Exception {
//		Random random = new Random(System.currentTimeMillis());
//		if (random.nextInt(5) > 0) {
//			server.close();
//			throw new Exception("Errror provocado");
//		}
//	}
//
//	private void recoverError() {
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		server = new Server();
//		dispatcherPrototype = new DispatcherPrototype(store, server);
//	}

	public static void main(String[] args) {
		new ServerManager().serve();
	}

}
