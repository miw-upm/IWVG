package designPatterns.exercises.n5_vending.observer.devices;

import designPatterns.exercises.n5_vending.basic.devices.PanelColleague;

public class Event {

	private PanelColleague panelColleague;

	public Event(PanelColleague panelColleague){
		this.panelColleague = panelColleague;
	}
	
	public PanelColleague getPanelColleague(){
		return panelColleague;
	}
}
