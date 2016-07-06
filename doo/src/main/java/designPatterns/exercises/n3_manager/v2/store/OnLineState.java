package designPatterns.exercises.n3_manager.v2.store;

public class OnLineState implements LineState {

	private Client client;
	
	private int[][] storeState;

	private OffLineState offLineState;

	public OnLineState() throws Exception {
		client = new Client();
	}

	@Override
	public void add(int code, int amount) {
		try {
			client.println(FrameType.ADD.name());
			client.println(code);
			client.println(amount);
			client.readACK();
		} catch (Exception ex) {
			offLineState = new OffLineState(storeState);
			offLineState.add(code, amount);
		}
	}

	@Override
	public boolean exist(int code, int amount) {
		try {
			client.println(FrameType.EXIST.name());
			client.println(code);
			client.println(amount);
			client.readACK();
			return client.readBoolean();
		} catch (Exception ex) {
			offLineState = new OffLineState(storeState);
			return offLineState.exist(code, amount);
		}
	}

	@Override
	public void remove(int code, int amount) {
		try {
			client.println(FrameType.REMOVE.name());
			client.println(code);
			client.println(amount);
			client.readACK();
		} catch (Exception ex) {
			offLineState = new OffLineState(storeState);
			offLineState.remove(code, amount);
		}
	}

	@Override
	public int[][] list() {
		try {
			client.println(FrameType.LIST.name());
			client.readACK();
			storeState = new int[0][2];
			int lines = client.readInt();
			storeState = new int[lines][2];
			for (int i = 0; i < lines; i++) {
				storeState[i][0] = client.readInt();
				storeState[i][1] = client.readInt();
			}
			return storeState;
		} catch (Exception ex) {
			offLineState = new OffLineState(storeState);
			return offLineState.list();
		}
	}

	public void close() {
		client.close();
	}

	@Override
	public LineState nextState() {
		if (offLineState != null) {
			return offLineState;
		} else {
			return this;
		}
	}

}
