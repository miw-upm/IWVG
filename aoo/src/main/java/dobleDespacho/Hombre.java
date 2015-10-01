package dobleDespacho;

public class Hombre extends Persona {

	public void palmearEspalda(Recepcionista recepcionista) {
		System.out.println("Soy un hombre vanidoso");
		recepcionista.recibirPropina(3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void recibir(Recepcionista recepcionista) {
		recepcionista.atender(this);
	}
}
