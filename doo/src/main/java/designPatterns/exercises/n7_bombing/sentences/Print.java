package designPatterns.exercises.n7_bombing.sentences;

public class Print extends Sentence {

	private String string;
	
	public Print(String string){
		super();
		this.string = string;
	}
	
	@Override
	public void exec() {
		System.out.println(string);
	}

	@Override
	public String toString() {
		return "\nPrint [string=" + string + "]";
	}

}
