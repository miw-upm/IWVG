package enSiMismo;

public abstract class Persona implements PersonaVisitor {

	protected boolean mismoSexo;
	
	public abstract boolean mismoSexo(Persona persona);

	protected abstract void accept(Persona persona);
}
