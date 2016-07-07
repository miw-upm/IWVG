package designPatterns.patterns.chainOfResponsability;

import java.util.Random;

public class ConcreteHandlerA extends Handler {

	public ConcreteHandlerA(Handler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void handlerRequest() {
		Random random = new Random(System.currentTimeMillis());
		if (random.nextInt(10)<=7){
			System.out.println("Decide ConcreteHandlerA");
		} else {
			nextHandler.handlerRequest();
		}
	}

}
