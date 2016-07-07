package designPatterns.patterns.chainOfResponsability;


public class ConcreteHandlerB extends Handler {

	protected ConcreteHandlerB() {
		super(null);
	}

	@Override
	public void handlerRequest() {
		System.out.println("Decide ConcreteHandlerB");
	}

}
