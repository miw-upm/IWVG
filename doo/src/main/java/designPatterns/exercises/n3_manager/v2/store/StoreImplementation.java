package designPatterns.exercises.n3_manager.v2.store;

import java.util.HashMap;
import java.util.Map;

import designPatterns.exercises.n3_manager.v2.manager.Store;

public class StoreImplementation implements Store {

	private Map<Integer, Product> productMap;

	public StoreImplementation() {
		productMap = new HashMap<Integer, Product>();
	}

	@Override
	public void add(int code, int amount) {
		Product product = productMap.get(code);
		if (product != null) {
			product.add(amount);
		} else {
			productMap.put(code, new Product(code, amount));
		}
	}

	@Override
	public boolean exist(int code, int amount) {
		Product product = productMap.get(code);
		if (product == null) {
			return false;
		} else {
			return product.exist(amount);
		}
	}

	@Override
	public void remove(int code, int amount) {
		Product product = productMap.get(code);
		product.remove(amount);
		if (!product.exist(1)) {
			productMap.remove(code);
		}
	}

	@Override
	public int[][] list() {
		int[][] list = new int[productMap.values().size()][2];
		int i = 0;
		for (int code : productMap.keySet()) {
			list[i][0] = code;
			list[i][1] = productMap.get(code).amount();
			i++;
		}
		return list;
	}

}
