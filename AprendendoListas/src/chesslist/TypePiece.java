package chesslist;

public enum TypePiece {

    //=================Statics=================
    QUEEN("Queen", 8),
    KING("King", 10),
    PAWN("Pawn", 1),
    KNIGHT("Knight", 3),
    ROOK("Rook", 5),
    BISHO("Bisho", 3);

    private String name;
    private int value;
    //=================Constructions=================

    TypePiece(String name, int value) {
        this.name = name;
        this.value = value;
    }
    //=================Getters=================

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
