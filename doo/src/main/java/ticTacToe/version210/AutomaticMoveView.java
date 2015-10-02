package ticTacToe.version210;

public class AutomaticMoveView extends ColocateView {

	public AutomaticMoveView(ColocateController controller){
		super(controller, "Mueve");
	}
	
	@Override
	protected void colocate(char colorValue) {
		AutomaticMoveController automaticMoveController = (AutomaticMoveController)colocateController;
		Coordinate origin = automaticMoveController.getOrigin();
		io.writeln("Se va a quita un " + colorValue + " de " + origin);
		io.readString("Pulse <Enter> para continuar");
		automaticMoveController.remove(origin);
		Coordinate target = automaticMoveController.getTarget(origin);
		io.writeln("Se va a poner un " + colorValue + " en " + target);
		io.readString("Pulse <Enter> para continuar");
		automaticMoveController.put(target);
	}
	
}
