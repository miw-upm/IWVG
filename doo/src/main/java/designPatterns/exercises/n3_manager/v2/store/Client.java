package designPatterns.exercises.n3_manager.v2.store;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	private Socket socket;

	private PrintWriter out;

	private BufferedReader in;

	Client() throws Exception {
		socket = new Socket("localhost", 2020);
		System.out.println("Cliente> Establecida conexion");
		OutputStream outStream = socket.getOutputStream();
		InputStream inStream = socket.getInputStream();
		out = new PrintWriter(outStream);
		in = new BufferedReader(new InputStreamReader(inStream));
	}

	void println(String value) {
		out.println(value);
		out.flush();
	}

	void println(int value) {
		out.println("" + value);
		out.flush();
	}

	boolean readBoolean() throws Exception {
		return Boolean.parseBoolean(in.readLine());
	}

	int readInt() throws Exception {
		return Integer.parseInt(in.readLine());
	}
	
	void readACK() throws Exception {
		if (!in.readLine().equals(FrameType.ACK.name())) {
			throw new Exception();
		}
	}

	void close() {
		try {
			out.println(FrameType.CLOSE.name());
			out.flush();
			in.close();
			out.close();
			socket.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
