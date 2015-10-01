package dobleDespacho;

public abstract class Persona {

	public abstract void recibir(Recepcionista recepcionista);
	
	public void recibir(){
		System.out.println("Buenas tardes");
	}

}
