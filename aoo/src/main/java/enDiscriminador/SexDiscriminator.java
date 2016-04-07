package enDiscriminador;

public class SexDiscriminator implements PersonaVisitor {

	private boolean esHombre;
	
	public boolean mismoSexo(Persona persona1, Persona persona2) {
		persona1.accept(this);
		boolean esHombre1 = esHombre;
		persona2.accept(this);
		boolean esHombre2 = esHombre;
		return esHombre1 == esHombre2;
	}

	@Override
	public void visit(Hombre hombre) {
		esHombre = true;
	}

	@Override
	public void visit(Mujer mujer) {
		esHombre = false;	
	}

}
