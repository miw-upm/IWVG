package enDiscriminador;

public abstract class Persona {

	public boolean mismoSexo(Persona persona) {
		return new SexDiscriminator().mismoSexo(this, persona);
	}

	protected abstract void accept(PersonaVisitor personaVisitor);

}
