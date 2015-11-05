package dobleDespacho;

public abstract class Persona {

	public abstract void aceptar(Recepcionista recepcionista);
	
	public void recibir(){
		System.out.println("Buenas tardes");
	}

}
