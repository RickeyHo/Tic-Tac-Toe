import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class JUnitTest {


    @Test
    void attemptToDrawOverExistingMark() throws IOException {
        Scanner scnr = new Scanner(System.in);
        Board board = new Board();
        Player playerA = new HumanPlayer(Mark.O, board, scnr);
        Player playerB = new HumanPlayer(Mark.X, board, scnr);
        Move A = new Move(0, 0, Mark.O);
        Move B = new Move(0, 0, Mark.X);
        board.setStarter(playerA);
        board.reset();

        board.place(A);
        board.switchPlayer(playerB);
        board.place(B);

        assertEquals(Mark.O, board.getCell(0, 0));

    }
    @Test
    void attemptToMarkWhenItsNotYourTurn() throws IOException {
        Scanner scnr = new Scanner(System.in);
        Board board = new Board();
        Move B = new Move(0, 0, Mark.X);
        board.setStarter(new HumanPlayer(Mark.O, board, scnr));
        board.reset();

        board.place(B);

        assertEquals(Mark.NONE, board.getCell(0, 0));

    }


}
