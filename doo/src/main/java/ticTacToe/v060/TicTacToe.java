package ticTacToe.v060;

public class TicTacToe {

    private Board board;
    
    private int turn;
    
    public TicTacToe() {
        board = new Board();
        turn = 0;
    }
    
    public void play(){
       do {
           board.write();
           if (!board.complete()){
               board.put(turn);
           } else {
        	   board.move(turn);
           }
           turn = (turn+1)%2;
       } while(!board.existTicTacToe());
       board.write();
       board.win((turn+1)%2);
    }
    
    public static void main(String[] args){
        new TicTacToe().play();
    }
}
