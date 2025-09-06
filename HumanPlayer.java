import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class HumanPlayer extends Player{


    private final Scanner scnr;

    public HumanPlayer(Mark mark, Board board, Scanner scnr){

        this.scnr = scnr;
        this.mark = mark;
        this.board = board;

    }

    @Override
    public Mark getMark() {
        return super.getMark();
    }

    @Override
    public String toString() {
        return "Player " + this.mark;
    }

    @Override
    public Move nextMove() throws IOException {

        System.out.println(this.toString()  + " Make your move! Type in a number from 1 - 3 for your column and another number right after for your row.");

        while (scnr.hasNext()) {
            String moveCode = scnr.nextLine();

            if (moveCode.length() == 2) {
                int col = Integer.valueOf(moveCode.charAt(0)) - 48 - 1;
                int row = 2 - (Integer.valueOf(moveCode.charAt(1)) - 48 - 1);
                if (0 <= row && row < 3 && 0 <= col && col < 3 && this.board.getCell(row, col) == Mark.NONE) {

                    return new Move(row, col, this.getMark());

                }
            }
            System.out.println(this.toString()  + " Make your move! Type in a number from 1 - 3 for your column and another number right after for your row.");

        }

        //System.exit(0);
        return null;
    }

}
