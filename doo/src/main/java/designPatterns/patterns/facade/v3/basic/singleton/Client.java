package designPatterns.patterns.facade.v3.basic.singleton;

import designPatterns.patterns.facade.v2.basic.subsystem.SubsystemFacade;

public class Client {

	public void exec(){
		SubsystemFacade subsystemFacade = new SubsystemFacade();
		subsystemFacade.m1_2();
		subsystemFacade.m3_4();
		subsystemFacade.m5();
		subsystemFacade.m6();
		//...
		X x = new X();
		x.m7();
		//...
		Y y = new Y();
		y.m8();
	}
	
	public static void main(String[] args) {
		new Client().exec();
	}
}
