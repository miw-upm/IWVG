package enDiscriminador;

public class Main {

	public static void main(String[] args){
		Persona personah1 = new Hombre();
		Persona personam2 = new Mujer();
		Persona personah3 = new Hombre();
		Persona personam4 = new Mujer();
		
		System.out.println(personah1.mismoSexo(personam2));
		System.out.println(personah1.mismoSexo(personah3));
		System.out.println(personam4.mismoSexo(personah1));
		System.out.println(personam4.mismoSexo(personam2));
	}
}
