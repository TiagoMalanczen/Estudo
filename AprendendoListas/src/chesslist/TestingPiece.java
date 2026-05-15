package chesslist;

public class TestingPiece
{
    //=================Instantiating dates=================

    public static void main(String[] args) {
        Piece p1 = new Piece("h2", TypePiece.QUEEN, PieceColor.BLACK);
        Piece p2 = new Piece("f2", TypePiece.BISHO, PieceColor.BLACK);
        Piece p3 = new Piece("e2", TypePiece.KING, PieceColor.WHITE);
        Piece p4 = new Piece("f4", TypePiece.BISHO, PieceColor.WHITE);

        Cemetery cemetery = new Cemetery();

    //=================Testing=================
        cemetery.addCemetery(p1);
        cemetery.addCemetery(p2);
        cemetery.addCemetery(p3);
        cemetery.addCemetery(p4);

        cemetery.showPieces();
        System.out.println(cemetery.calculateTotalScore());;

        cemetery.removeByPosition("h2");
        System.out.println(cemetery.calculateTotalScore());;

        cemetery.filterByColor(PieceColor.BLACK);
        cemetery.filterByColor(PieceColor.WHITE);

    }
}
