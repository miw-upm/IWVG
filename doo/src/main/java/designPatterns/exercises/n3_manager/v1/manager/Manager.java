package designPatterns.exercises.n3_manager.v1.manager;

import designPatterns.exercises.n3_manager.v1.utils.IO;
import designPatterns.exercises.n3_manager.v1.utils.LimitedIntDialog;

public abstract class Manager {

	protected Store store;

	protected Manager() {
		store = this.createStore();
	}
	
	protected abstract Store createStore();

	protected void manage() {
		int option;
		do {
			this.showStore();
			option = this.executeMenu();
			if (option != 3) {
				int code = LimitedIntDialog.instance()
						.read("Código? ", 100);
				int amount = LimitedIntDialog.instance()
						.read("Cantidad? ", 100);
				switch (option) {
				case 1:
					store.add(code, amount);
					break;
				case 2:
					if (store.exist(code, amount)) {
						store.remove(code, amount);
					} else {
						IO.instance().writeln("Error!!! No hay existencias");
					}
					break;
				}
			}
		} while (option != 3);
	}

	private void showStore() {
		int[][] list = store.list();
		IO.instance().writeln("STORE");
		for (int[] product : list) {
			IO.instance().writeln(
					"Código: " + product[0] + ", cantidad:" + product[1]);
		}
		IO.instance().writeln();
	}

	private int executeMenu() {
		IO.instance().writeln("1. Alta de producto");
		IO.instance().writeln("2. Baja de producto");
		IO.instance().writeln("3. Salir");
		int option = LimitedIntDialog.instance().read("Opción? ", 3);
		return option;
	}

}
