package chesslist;

public class Piece {
    //=================Statics=================
    private String position;
    private TypePiece typePiece;
    private PieceColor pieceColor;

    //=================Constructions=================
    public Piece(String position, TypePiece typePiece, PieceColor pieceColor) {
        this.position = position;
        this.typePiece = typePiece;
        this.pieceColor = pieceColor;
    }

    //=================Methods=================
    public void printData(){
        System.out.println("================");
        System.out.println("Type piece  = " + typePiece.getName());
        System.out.println("Color piece = " + pieceColor.getDescription());
        System.out.println("Positon = " + position);


    }

    //=================Getters=================
    public String getPosition() {
        return position;
    }

    public TypePiece getTypePiece() {
        return typePiece;
    }

    public PieceColor getPieceColor() {
        return pieceColor;
    }
}
