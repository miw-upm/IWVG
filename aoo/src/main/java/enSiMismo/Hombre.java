package enSiMismo;

public class Hombre extends Persona {

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
		mismoSexo = true;
		
	}

	@Override
	public void visit(Mujer mujer) {
		mismoSexo = false;
	}

}
