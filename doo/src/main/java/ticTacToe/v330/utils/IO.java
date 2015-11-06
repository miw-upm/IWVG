package ticTacToe.v330.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IO {

	private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
			System.in));

	public String readString(String title) {
		String input = null;
		boolean ok = false;
		do {
			this.write(title);
			try {
				input = bufferedReader.readLine();
				ok = true;
			} catch (Exception ex) {
				this.writeError("de cadena de caracteres");
			}
		} while (!ok);
		return input;
	}

	public int readInt(String title) {
		int input = 0;
		boolean ok = false;
		do {
			try {
				input = Integer.parseInt(this.readString(title));
				ok = true;
			} catch (Exception ex) {
				this.writeError("entero");
			}
		} while (!ok);
		return input;
	}

	public float readFloat(String title) {
		float input = 0;
		boolean ok = false;
		do {
			try {
				input = Float.parseFloat(this.readString(title));
				ok = true;
			} catch (Exception ex) {
				this.writeError("real");
			}
		} while (!ok);
		return input;
	}

	public double readDouble(String title) {
		double input = 0.0;
		boolean ok = false;
		do {
			try {
				input = Double.parseDouble(this.readString(title));
				ok = true;
			} catch (Exception ex) {
				this.writeError("real");
			}
		} while (!ok);
		return input;
	}

	public long readLong(String title) {
		long input = 0;
		boolean ok = false;
		do {
			try {
				input = Long.parseLong(this.readString(title));
				ok = true;
			} catch (Exception ex) {
				this.writeError("entero");
			}
		} while (!ok);
		return input;
	}

	public byte readByte(String title) {
		byte input = 0;
		boolean ok = false;
		do {
			try {
				input = Byte.parseByte(this.readString(title));
				ok = true;
			} catch (Exception ex) {
				this.writeError("entero");
			}
		} while (!ok);
		return input;
	}

	public short readShort(String title) {
		short input = 0;
		boolean ok = false;
		do {
			try {
				input = Short.parseShort(this.readString(title));
				ok = true;
			} catch (Exception ex) {
				this.writeError("entero");
			}
		} while (!ok);
		return input;
	}

	public char readChar(String title) {
		char charValue = ' ';
		boolean ok = false;
		do {
			String input = this.readString(title);
			if (input.length() != 1) {
				this.writeError("caracter");
			} else {
				charValue = input.charAt(0);
				ok = true;
			}
		} while (!ok);
		return charValue;
	}

	public boolean readBoolean(String title) {
		boolean booleanValue = true;
		boolean ok = false;
		do {
			String input = this.readString(title);
			if (input.equalsIgnoreCase("true")
					|| input.equalsIgnoreCase("false")) {
				booleanValue = Boolean.valueOf(input).booleanValue();
				ok = true;
			} else {
				this.writeError("logico");
			}
		} while (!ok);
		return booleanValue;
	}

	public void write(String string) {
		System.out.print(string);
	}

	public void writeln(String string) {
		System.out.println(string);
	}

	public void write(int string) {
		System.out.print(string);
	}

	public void writeln(int string) {
		System.out.println(string);
	}

	public void write(float string) {
		System.out.print(string);
	}

	public void writeln(float string) {
		System.out.println(string);
	}

	public void write(double string) {
		System.out.print(string);
	}

	public void writeln(double string) {
		System.out.println(string);
	}

	public void write(long string) {
		System.out.print(string);
	}

	public void writeln(long string) {
		System.out.println(string);
	}

	public void write(byte string) {
		System.out.print(string);
	}

	public void writeln(byte string) {
		System.out.println(string);
	}

	public void write(short string) {
		System.out.print(string);
	}

	public void writeln(short string) {
		System.out.println(string);
	}

	public void write(char string) {
		System.out.print(string);
	}

	public void writeln(char string) {
		System.out.println(string);
	}

	public void write(boolean string) {
		System.out.print(string);
	}

	public void writeln(boolean string) {
		System.out.println(string);
	}

	public void writeln() {
		System.out.println();
	}

	private void writeError(String formato) {
		System.out.println("ERROR DE FORMATO! "
				+ "Introduzca un valor con formato " + formato + ".");
	}
}
