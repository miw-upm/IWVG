package desingPatterns.tickets.store;

import java.util.HashMap;
import java.util.Map;

public class Store {

	private Map<Integer, Product> products;
	
	public Store(){
		products = new HashMap<Integer, Product>();
		for(int i=1; i<=1000; i++){
			products.put(i, new Product(i,1000+i));
		}
	}
	
	public int getPrice(int id, int units){
		return products.get(id).getPrice(units);
	}
	
	public void add(int id, int units) {
		products.get(id).add(units);
	}
	
	public void remove(int id, int units) {
		products.get(id).remove(units);
	}
}
