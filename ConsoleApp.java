import java.io.IOException;
import java.util.Scanner;

public class ConsoleApp {

    public static void main(String[] arg) throws IOException {

        boolean respAccepted = false;
        Board board = new Board();
        Player prot = null;
        Player opp = null;
        MoveStrat strat = new RandomAI();

        while (!respAccepted) {
            Scanner scnr = new Scanner(System.in);
            System.out.println("What do you want to play as? O or X");
            String resp = scnr.nextLine();
            if (resp.equals("O")){

                respAccepted = true;
                prot = new HumanPlayer(Mark.O, board, scnr);
                opp = new AIPlayer(Mark.X, board, strat);
                opp = new HumanPlayer(Mark.X, board, scnr);


            }
            if (resp.equals("X")){
                respAccepted = true;
                prot = new HumanPlayer(Mark.X, board, scnr);
                opp = new AIPlayer(Mark.O, board, strat);
                opp = new HumanPlayer(Mark.O, board, scnr);

            }
        }



        Player starter = null;

        while (starter == null){

            Scanner scnr = new Scanner(System.in);
            System.out.println("Do you want to go first? Type yes or no");
            String resp = scnr.nextLine();
            if (resp.equals("yes")){

                starter = prot;

            } else if (resp.equals("no")){

                starter = opp;

            }

        }


        board.reset();

        board.setStarter(starter);
        Game game = new Game(prot, opp, starter, board);
        game.run();

    }



}
