import java.util.ArrayList;
import java.util.Random;

public class RandomAI implements MoveStrat{

    Board board = null;
    Mark mark = null;

    public void setBoard(Board board) {
        if (this.board == null) this.board = board;
    }
    public void setMark(Mark mark) {
        if (this.mark == null) {this.mark = mark;}
    }

    public Move decideMove() {

        Random random = new Random(); //just learned about this object from StackOverflow

        ArrayList<Move> moves = new ArrayList<>();
        for (int i = 0; i < 3; i++){

            for (int x = 0; x < 3; x++){

                if (this.board.getCell(i, x) == Mark.NONE){

                    moves.add(new Move(i, x, this.mark));

                }
            }
        }

        return moves.get(random.nextInt(moves.size()));

    }

}
