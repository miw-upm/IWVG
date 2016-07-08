package designPatterns.exercises.n5_vending.observer.devices;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observerList;
	
	protected Subject(){
		observerList = new ArrayList<Observer>();
	}
	
	public void attach(Observer observer){
		observerList.add(observer);
	}
	
	public void dettach(Observer observer){
		observerList.remove(observer);
	}
	
	public void notifies() {
		for(Observer observer : observerList){
			observer.update();
		}
	}
}
