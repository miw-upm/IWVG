package designPatterns.patterns.builder;

public class Director {

	private Builder builder;
	
	public void set(Builder builder){
		this.builder = builder;
	}
	
	public Product construct(){
		builder.builderPartA();
		builder.builderPartB();
		builder.builderPartB();
		builder.builderPartA();
		builder.builderPartB();
		return builder.getResult();
	}
}
