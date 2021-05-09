package ChessClient.Chesslogic.Board;

import ChessClient.Pieces.ChessColor;
import ChessClient.Pieces.PieceTypes.*;

public final class BoardSetup {

    //Class is non instantiable
    private BoardSetup(){}

    public static FieldPosition[][] createInitialSetup(){

        FieldPosition[][] initialSetup = new FieldPosition[8][8];

        for(int i = 0; i < initialSetup.length; i++){
            for(int j = 0; j < initialSetup[i].length; j++){
                char column = 'a';
                initialSetup[i][j] = new FieldPosition(null, (char)(column + i), j);
            }
        }

        //White Backrank
        initialSetup[0][0].setPiece(new Rook(ChessColor.WHITE));
        initialSetup[0][1].setPiece(new Knight(ChessColor.WHITE));
        initialSetup[0][2].setPiece(new Bishop(ChessColor.WHITE));
        initialSetup[0][3].setPiece(new Queen(ChessColor.WHITE));
        initialSetup[0][4].setPiece(new King(ChessColor.WHITE));
        initialSetup[0][5].setPiece(new Bishop(ChessColor.WHITE));
        initialSetup[0][6].setPiece(new Knight(ChessColor.WHITE));
        initialSetup[0][7].setPiece(new Rook(ChessColor.WHITE));
        //White Pawns
        for(int i = 0; i < initialSetup[1].length; i++){
            initialSetup[1][i].setPiece(new Pawn(ChessColor.WHITE));
        }

        //Black Pawns
        for(int i = 0; i < initialSetup[1].length; i++){
            initialSetup[6][i].setPiece(new Pawn(ChessColor.BLACK));
        }

        //Black Backrank
        initialSetup[7][0].setPiece(new Rook(ChessColor.BLACK));
        initialSetup[7][1].setPiece(new Knight(ChessColor.BLACK));
        initialSetup[7][2].setPiece(new Bishop(ChessColor.BLACK));
        initialSetup[7][3].setPiece(new Queen(ChessColor.BLACK));
        initialSetup[7][4].setPiece(new King(ChessColor.BLACK));
        initialSetup[7][5].setPiece(new Bishop(ChessColor.BLACK));
        initialSetup[7][6].setPiece(new Knight(ChessColor.BLACK));
        initialSetup[7][7].setPiece(new Rook(ChessColor.BLACK));

        return initialSetup;
    }

}
