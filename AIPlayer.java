import java.util.ArrayList;
import java.util.Random;

public class AIPlayer extends Player{

    private final MoveStrat strategy;

    public AIPlayer(Mark mark, Board board, MoveStrat strategy){

        this.board = board;
        this.mark = mark;
        this.strategy = strategy;

        strategy.setMark(mark);
        strategy.setBoard(board);

    }

    @Override
    public String toString() {

        return "AI Player Mark: " + this.mark;

    }

    @Override
    public Move nextMove() {

        return strategy.decideMove();

    }

}
