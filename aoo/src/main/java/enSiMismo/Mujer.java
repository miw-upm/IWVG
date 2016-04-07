package enSiMismo;

public class Mujer extends Persona {

	@Override
	public boolean mismoSexo(Persona persona) {
		persona.accept(this);
		return mismoSexo;
	}
	
	@Override
	protected void accept(Persona persona){
		persona.visit(this);
	}

	@Override
	public void visit(Hombre hombre) {
		mismoSexo = false;
	}

	@Override
	public void visit(Mujer mujer) {
		mismoSexo = true;
	}

	

}
