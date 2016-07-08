package designPatterns.exercises.n5_vending.observer.devices;

import designPatterns.exercises.n5_vending.basic.devices.PanelColleague;

public class DeactiveEvent extends Event {

	public DeactiveEvent(PanelColleague panelColleague) {
		super(panelColleague);
	}

}