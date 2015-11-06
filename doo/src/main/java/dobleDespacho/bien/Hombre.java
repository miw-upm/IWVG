package dobleDespacho.bien;

public class Hombre extends Persona {

	public void recibirPalmada(Recepcionista recepcionista) {
		System.out.println("---------- Soy un hombre lleno de vanidad");
		recepcionista.recibirPropina(3);
	}	
	
	@Override
	public void aceptar(Recepcionista recepcionista) {
		recepcionista.visitar(this);
	}
}
