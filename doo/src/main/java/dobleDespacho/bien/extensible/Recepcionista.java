package dobleDespacho.bien.extensible;

public class Recepcionista implements VisitadorPersona{

	public void recibir(Persona persona) {
		System.out.println("!!!!!!!!!! Soy un recpcionista que se alegra de su visita");
		persona.aceptar(this);		
	}
	
	@Override
	public void visitar(Mujer mujer) {
		System.out.println("!!!!!!!!!! Soy un recpcionista que se admira de su belleza");
		mujer.escucharHalago();	
		System.out.println("!!!!!!!!!! Soy un recpcionista que se admira de su existencia");
		mujer.escucharPiropo();
	}

	@Override
	public void visitar(Hombre hombre) {
		hombre.recibirPalmada(this);
	}

	public void recibirPropina(int euros) {
		System.out.println("!!!!!!!!!! Soy un recpcionista que gané " + euros + " euros");
	}
	
	public void agradecerVisita() {
		System.out.println("!!!!!!!!!! Soy un recpcionista que agradece la visita");
	}

}
