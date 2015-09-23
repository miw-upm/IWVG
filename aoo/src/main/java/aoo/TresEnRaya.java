package aoo;

public class TresEnRaya {

    private Tablero tablero;
    private Jugador[] jugadores;
    private Turno turno;
    
    public TresEnRaya() {
        tablero = new Tablero();
        turno = new Turno();
        for(int i=0; i<2; i++){
            jugadores[i] = new Jugador(i);
        }
    }
    public void jugar(){
       do {
           tablero.mostrar();
           if (!tablero.completo()){
               jugadores[turno.toca()].poner(tablero);
           } else {
               jugadores[turno.toca()].mover(tablero);
           }
           turno.cambiar();
       } while(!tablero.hayTresEnRaya());
    }
    
    public static void main(String[] args){
        new TresEnRaya().jugar();
    }
}
