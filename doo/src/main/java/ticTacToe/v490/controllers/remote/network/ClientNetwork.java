package ticTacToe.v490.controllers.remote.network;

public class ClientNetwork {

	private static ClientNetwork clientNetwork;
	
	public static ClientNetwork instance() {
		if (clientNetwork != null){
			clientNetwork = new ClientNetwork();
		}
		return clientNetwork;
	}
	
	private ClientNetwork() {
		
	}
	
	public void send(Object object) {
		this.send(object);
	}
	
	public void send(Object object1, Object object2) {
		this.send(object1);
		this.send(object2);
	}
	
	public void send(Object object1, Object object2, Object object3) {
		this.send(object1);
		this.send(object2);
		this.send(object3);
	}
	
	public Object sendReceive(Object object) {
		this.send(object);
		return this.receive();
	}

	public Object sendReceive(Object object1, Object object2) {
		this.send(object1, object2);
		return this.receive();
	}
	
	public Object sendReceive(Object object1, Object object2, Object object3) {
		this.send(object1, object2, object3);
		return this.receive();
	}
			
	private Object receive() {
		return null;
	}

}
