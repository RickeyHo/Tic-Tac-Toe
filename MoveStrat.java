public interface MoveStrat {

    public void setBoard(Board board);
    public void setMark(Mark mark);
    public Move decideMove();

}
