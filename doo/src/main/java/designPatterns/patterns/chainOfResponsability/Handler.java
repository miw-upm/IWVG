package designPatterns.patterns.chainOfResponsability;

public abstract class Handler {

	protected Handler nextHandler;
	
	protected Handler(Handler nextHandler){
		this.nextHandler = nextHandler;
	}
	public abstract void handlerRequest();
}
