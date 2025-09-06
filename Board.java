public class Board {

    private Mark[][] grid = new Mark[3][3];
    private int size;
    public boolean isFull;
    private int markCount = 0;
    private Player currPlayer;
    private Mark recentPlay;

    public Board(){

        this.reset();

    }

    public int getMarkCount() {
        return markCount;
    }

    public void setStarter(Player starter){

        if (currPlayer == null){

            currPlayer = starter;

        }

    }

    public void switchPlayer(Player player){

        if (recentPlay != player.mark){

            currPlayer = player;

        }


    }

    public Mark getCell(int r, int c){

        return this.grid[r][c];

    }

    public void reset(){

        for (int i = 0; i < 3; i++) {

            for (int x = 0; x < 3;x++) {

                grid[i][x] = Mark.NONE;

            }

        }

    }

    public void place(Move move){


        if (move.row < 3 && move.col < 3 && grid[move.row][move.col] == Mark.NONE && currPlayer.mark == move.mark){


            grid[move.row][move.col] = move.mark;
            recentPlay = move.mark;
            markCount++;
            if (markCount == 9){

                isFull = true;

            }


        }

    }

}
