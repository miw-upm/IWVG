package enDiscriminador;

public interface PersonaVisitor {

	public void visit(Hombre hombre);
	
	public void visit(Mujer mujer);
	
}
