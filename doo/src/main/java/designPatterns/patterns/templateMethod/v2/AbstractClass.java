package designPatterns.patterns.templateMethod.v2;

public abstract class AbstractClass {

	public void templateMethod() {
		System.out.println("Paso 1 por AbsrtractClass");
		this.primitiveOperation1();
		System.out.println("Paso 3 por AbsrtractClass");
		this.primitiveOperation2();
		System.out.println("Paso 5 por AbsrtractClass");
	}

	public abstract void primitiveOperation1();
	
	public abstract void primitiveOperation2();

}
