package designPatterns.patterns.facade.v3.basic.singleton.subsystem;

import designPatterns.patterns.facade.v1.bad.subsystem.A;
import designPatterns.patterns.facade.v1.bad.subsystem.B;
import designPatterns.patterns.facade.v1.bad.subsystem.C;
import designPatterns.patterns.facade.v1.bad.subsystem.D;

public class SubsystemFacade {

	private SubsystemFacade subsystemFacade;

	public SubsystemFacade instance() {
		if (subsystemFacade == null) {
			subsystemFacade = new SubsystemFacade();
		}
		return subsystemFacade;
	}

	private A a;
	private B b;
	private C c;
	private D d;

	private SubsystemFacade() {
		a = new A();
		b = new B();
		c = new C();
		d = new D();
	}

	public void m1_2() {
		a.m1();
		a.m2();
	}

	public void m3_4() {
		b.m3();
		b.m4(a);
	}

	public void m5() {
		c.m5();
	}

	public void m6() {
		d.m6(d);
	}

}
