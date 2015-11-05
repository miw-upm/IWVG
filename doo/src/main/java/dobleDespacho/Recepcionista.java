package dobleDespacho;

public class Recepcionista {

	public void atender(Persona persona) {
		persona.aceptar(this);		
	}
	
	public void visitar(Mujer mujer) {
		mujer.alagar();	
		mujer.piropear();
	}

	public void visitar(Hombre hombre) {
		hombre.palmearEspalda(this);
	}

	public void recibirPropina(int euros) {
		System.out.println("Me gané " + euros + " euros");
	}
	


}
