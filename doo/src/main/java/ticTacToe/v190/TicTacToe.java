package ticTacToe.v190;

public class TicTacToe {

    private Board board;
    
    private Player[] players;
    
    private Turn turn;
    
    private static final int NUM_PLAYERS = 2;
    
    public TicTacToe() {
        board = new Board(TicTacToe.NUM_PLAYERS);
        players = new Player[TicTacToe.NUM_PLAYERS];
        for(int i=0; i<TicTacToe.NUM_PLAYERS; i++){
            players[i] = new Player(i, TicTacToe.NUM_PLAYERS, board);
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
