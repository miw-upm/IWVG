package ticTacToe.v170;

public class TicTacToe {

    private Board board;
    
    private Player[] players;
    
    private Turn turn;
    
    private static final int NUM_PLAYERS = 2;
    
    public TicTacToe() {
        board = new Board(TicTacToe.NUM_PLAYERS);
        players = new Player[TicTacToe.NUM_PLAYERS];
        for(int i=0; i<TicTacToe.NUM_PLAYERS; i++){
            players[i] = new Player(i, TicTacToe.NUM_PLAYERS);
        }
        turn = new Turn(TicTacToe.NUM_PLAYERS);
    }
    
    public void play(){
       do {
           board.write();
           if (!board.complete()){
               players[turn.take()].put(board);
           } else {
        	   players[turn.take()].put(board);
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
