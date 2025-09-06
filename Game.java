import java.io.IOException;
import java.util.Scanner;


public class Game {

    Player currPlayer;
    Board board;
    Player prot;
    Player opp;

    public Game(Player prot, Player opp, Player currPlayer, Board board){

        this.currPlayer = currPlayer;
        this.board = board;
        this.prot = prot;
        this.opp = opp;

    }

    private void printBoard(){
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < 3; i++){

            for (int x = 0; x < 3; x++){
                if (board.getCell(i, x) != Mark.NONE){

                    System.out.print(board.getCell(i, x));

                } else {

                    System.out.print(" ");

                }

                if (x != 2){

                    System.out.print(" | ");

                }

            }
            System.out.println();
            if (i != 2){

                System.out.println("---------");

            }


        }

    }


    public void run() throws IOException {
        while (!board.isFull){

            this.board.place(currPlayer.nextMove());

            if (this.currPlayer == opp){

                this.currPlayer = prot;
                board.switchPlayer(prot);

            } else {
                this.currPlayer = opp;
                board.switchPlayer(opp);

            }

            this.printBoard();

        }


    }


}
