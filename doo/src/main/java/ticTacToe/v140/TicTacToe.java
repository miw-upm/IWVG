package ticTacToe.v140;

public class TicTacToe {

    private Board board;
    
    private Player[] players;
    
    private Turn turn;
    
    public static final int NUM_PLAYERS = 2;
    
    public TicTacToe() {
        board = new Board();
        turn = new Turn();
        players = new Player[TicTacToe.NUM_PLAYERS];
        for(int i=0; i<TicTacToe.NUM_PLAYERS; i++){
            players[i] = new Player(i);
        }
    }
    
    public void play(){
       do {
           board.write();
           if (!board.complete()){
               players[turn.take()].put(board);
           } else {
               players[turn.take()].move(board);
           }
           turn.change();
       } while(!board.existTicTacToe());
       board.write();
       players[turn.notTake()].win();
    }
    
    public static void main(String[] args){
        new TicTacToe().play();
    }
}
