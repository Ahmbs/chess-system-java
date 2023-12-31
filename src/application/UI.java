package application;

import chess.ChessPiece;

public class UI {
    public static void printBoard(ChessPiece[][] pieces){
        for (int i = 0; i < pieces.length; i++){
            System.out.println((8 -i) + " ");
            for (int j = 0; j < pieces.length; j++){
                printPiece(pieces[i][j]);
            }
        }
    }
    private static void printPiece(ChessPiece piece){
        if(piece == null){
            System.out.println("-");
        }
        else {
            System.out.println(piece);
        }
        System.out.println(" ");
    }
}
