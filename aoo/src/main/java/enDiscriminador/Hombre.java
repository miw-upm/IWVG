package enDiscriminador;

public class Hombre extends Persona {

	protected void accept(PersonaVisitor personaVisitor) {
		personaVisitor.visit(this);		
	}

}
