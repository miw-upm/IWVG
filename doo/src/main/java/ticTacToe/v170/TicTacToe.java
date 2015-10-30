package ticTacToe.v170;

public class TicTacToe {

    private Board board;
    
    private Player[] players;
    
    private Turn turn;
    
    public static final int NUM_PLAYERS = 2;
    
    public TicTacToe() {
        board = new Board();
        players = new Player[TicTacToe.NUM_PLAYERS];
        for(int i=0; i<TicTacToe.NUM_PLAYERS; i++){
            players[i] = new Player(i, board);
        }
        turn = new Turn(players);
    }
    
    public void play(){
       do {
           board.write();
           if (!board.complete()){
               turn.take().put();
           } else {
               turn.take().move();
           }
           turn.change();
       } while(!board.existTicTacToe());
       board.write();
       turn.notTake().win();
    }
    
    public static void main(String[] args){
        new TicTacToe().play();
    }
}
