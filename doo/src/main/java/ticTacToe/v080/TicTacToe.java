package ticTacToe.v080;

public class TicTacToe {

    private Board board;
    private Player[] players;
    private int turn;
    
    public TicTacToe() {
        board = new Board();
        turn = 0;
        players = new Player[2];
        for(int i=0; i<2; i++){
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
           turn = (turn+1)%2;
       } while(!board.existTicTacToe());
       board.write();
       players[(turn+1)%2].win();
    }
    
    public static void main(String[] args){
        new TicTacToe().play();
    }
}
