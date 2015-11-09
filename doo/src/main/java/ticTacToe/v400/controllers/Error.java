package ticTacToe.v400.controllers;

public enum Error {
	
	NOT_EMPTY("Esa casilla ya está ocupada"),
	REPEATED_COORDINATE("No se puede poner de donde se quitó"),
	NOT_PROPERTY("Esa casilla no está ocupada por ninguna de tus fichas");
	
	private String message;
	
	private Error(String message){
		this.message = message;
	}
	
	@Override
	public String toString(){
		return message;
	}
}
