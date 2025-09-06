public enum Mark {
    X, O, NONE;
    @Override
    public String toString() {
        return switch (this) {
            case X -> "X";
            case O -> "O";
            case NONE -> " ";
        };
    }
}
