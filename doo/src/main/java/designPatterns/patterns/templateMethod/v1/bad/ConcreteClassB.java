package designPatterns.patterns.templateMethod.v1.bad;

public class ConcreteClassB extends AbstractClass {

	@Override
	public void templateMethod() {
		System.out.println("Paso 1 por AbsrtractClass");
		System.out.println("Paso 2 por ConcreteClassB");
		System.out.println("Paso 3 por AbsrtractClass");
		System.out.println("Paso 4 por ConcreteClassB");
		System.out.println("Paso 5 por AbsrtractClass");
	}
}
