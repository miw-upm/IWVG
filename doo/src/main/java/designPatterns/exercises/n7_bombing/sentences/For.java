package designPatterns.exercises.n7_bombing.sentences;

public class For extends CompositeSentence {
	
	private int times;
	
	public For(int times){
		super();
		this.times = times;
	}

	@Override
	public void exec() {
		for(int i=0; i<times; i++){
			super.exec();
		}
	}

	@Override
	public String toString() {
		return "\nFor [\ntimes=" + times + super.toString() + "\n] For";
	}
	
	

}
