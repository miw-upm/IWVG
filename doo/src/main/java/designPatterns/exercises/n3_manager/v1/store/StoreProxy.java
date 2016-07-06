package designPatterns.exercises.n3_manager.v1.store;

import designPatterns.exercises.n3_manager.v1.manager.Store;

public class StoreProxy implements Store {

	private Client client;
	
	public StoreProxy() {
		client = new Client();
	}
	
	@Override
	public void add(int code, int amount) {
		client.println(FrameType.ADD.name());
		client.println(code);
		client.println(amount);
	}

	@Override
	public boolean exist(int code, int amount) {
		client.println(FrameType.EXIST.name());
		client.println(code);
		client.println(amount);
		return client.readBoolean();
	}

	@Override
	public void remove(int code, int amount) {
		client.println(FrameType.REMOVE.name());
		client.println(code);
		client.println(amount);
	}

	@Override
	public int[][] list() {
		client.println(FrameType.LIST.name());
		int[][] result = new int[0][2];
			int lines = client.readInt();
			result = new int[lines][2];
			for(int i=0; i<lines; i++){
				result[i][0] = client.readInt();
				result[i][1] = client.readInt();
			}
		return result;
	}
	
	public void close() {
		client.close();
	}

}
