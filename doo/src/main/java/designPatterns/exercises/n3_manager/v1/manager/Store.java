package designPatterns.exercises.n3_manager.v1.manager;

public interface Store {

	void add(int code, int amount);

	boolean exist(int code, int amount);

	void remove(int code, int amount);
	
	int[][] list();

}
