package chess;

public enum Color {
	WHITE("blancas"),
	BLACK("negras");
	
	private String name;
	
	private Color(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
