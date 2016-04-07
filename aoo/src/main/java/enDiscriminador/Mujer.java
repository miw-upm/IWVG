package enDiscriminador;

public class Mujer extends Persona {

	protected void accept(PersonaVisitor personaVisitor) {
		personaVisitor.visit(this);		
	}
}
