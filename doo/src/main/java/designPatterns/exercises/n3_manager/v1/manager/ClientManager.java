package designPatterns.exercises.n3_manager.v1.manager;

import designPatterns.exercises.n3_manager.v1.store.StoreProxy;

public class ClientManager extends Manager {

	public ClientManager() {
		store = new StoreProxy();
	}
	
	public static void main(String[] args) {
		new ClientManager().manage();
	}
}
