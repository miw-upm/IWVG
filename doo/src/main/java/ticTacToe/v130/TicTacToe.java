package ticTacToe.v130;

public class TicTacToe {

    private Board board;
    
    private Player[] players;
    
    private Turn turn;
    
    public TicTacToe() {
        board = new Board();
        turn = new Turn();
        players = new Player[2];
        for(int i=0; i<2; i++){
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
