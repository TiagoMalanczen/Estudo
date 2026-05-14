package chesslist;

import java.util.ArrayList;
import java.util.List;

public class Cemetery {
    //=================Instantiating dates=================
    private List<Piece> cemetery;

    //=================Construction=================
    public Cemetery() {
        this.cemetery = new ArrayList<>();
    }

    //=================Methods=================
    public void addCemetery(Piece piece){
        this.cemetery.add(piece);
        System.out.println("================");
        System.out.println(piece.getTypePiece()+" "+  piece.getPieceColor() + " add cemetery");
    }

    public void showPieces(){
       if (cemetery.isEmpty()){
           System.out.println("Empty cemetery");
       }
       else {
           System.out.println();
           System.out.println("Pieces cemetery: ");
           for (Piece p: cemetery){
               p.printData();
               System.out.println("============");
           }
       }
    }
    public int calculateTotalScore(){
         int value = 0;
        if (cemetery.isEmpty()){
            System.out.println("Empty cemetery");
            return 0;
        }
        else {
            for (Piece p: cemetery){
                value += p.getTypePiece().getValue();
            }
            System.out.println("Total = ");
            return value;
        }
    }

    public void removeByPosition(String position){
        for (Piece p : cemetery){
            if (p.getPosition().equals(position)){
                cemetery.remove(p);
                return;
            }
        }
    }
    public void filterByColor(PieceColor color){
        System.out.println("============");
        for (Piece p : cemetery){
        if (color.equals(p.getPieceColor())){
            System.out.println(p.getTypePiece());
        }
        }
    }
}
