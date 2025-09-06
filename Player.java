import java.io.IOException;

public abstract class Player {

    Board board;
    Mark mark;
    public abstract Move nextMove() throws IOException;

    public Mark getMark() {
        return mark;
    }

}
