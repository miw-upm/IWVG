package ticTacToe.version110;

public class TicTacToe {

    private Board board;
    
    private Player[] players;
    
    private int turn;
    
    public static final int NUM_PLAYERS = 2;
    
    public TicTacToe() {
        board = new Board();
        turn = 0;
        players = new Player[TicTacToe.NUM_PLAYERS];
        for(int i=0; i<TicTacToe.NUM_PLAYERS; i++){
            players[i] = new Player(i);
        }
    }
    
    public void play(){
       do {
           board.write();
           if (!board.complete()){
               players[turn].put(board);
           } else {
               players[turn].move(board);
           }
           turn = (turn+1)%TicTacToe.NUM_PLAYERS;
       } while(!board.existTicTacToe());
       board.write();
       players[(turn+1)%TicTacToe.NUM_PLAYERS].win();
    }
    
    public static void main(String[] args){
        new TicTacToe().play();
    }
}
