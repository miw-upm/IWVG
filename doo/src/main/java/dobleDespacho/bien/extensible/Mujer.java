package dobleDespacho.bien.extensible;

public class Mujer extends Persona {

	public void escucharHalago() {
		System.out.println("++++++++++ Soy una mujer ruborizada");
	}

	public void escucharPiropo() {
		System.out.println("++++++++++ Soy una mujer más ruborizada");
	}	
	
	@Override
	public void aceptar(VisitadorPersona visitadorPersona) {
		visitadorPersona.visitar(this);
	}

}
