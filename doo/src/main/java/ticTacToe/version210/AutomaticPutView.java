package ticTacToe.version210;

public class AutomaticPutView extends ColocateView {

	public AutomaticPutView(ColocateController controller){
		super(controller, "Pone");
	}
	
	@Override
	protected void colocate(char colorValue) {
		AutomaticPutController automaticPutController = (AutomaticPutController)colocateController;
		Coordinate target = automaticPutController.getTarget();
		io.writeln("Se va a colocar un " + colorValue + " en " + target);
		io.readString("Pulse <Enter> para continuar");
		automaticPutController.put(target);
	}
}
