package designPatterns.patterns.templateMethod.v2;

public class ConcreteClassB extends AbstractClass {

	@Override
	public void primitiveOperation1() {
		System.out.println("Paso 2 por ConcreteClassB");
	}

	@Override
	public void primitiveOperation2() {
		System.out.println("Paso 4 por ConcreteClassB");
	}

}
