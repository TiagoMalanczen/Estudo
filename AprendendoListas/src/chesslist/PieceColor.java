package chesslist;

public enum PieceColor
{
    //=================Statics=================
    WHITE("White"),
    BLACK("Black");

    private String description;

    //=================Constructions=================

    PieceColor(String description) {
        this.description = description;
    }

    //=================Getters=================
    public String getDescription() {
        return description;
    }
}
