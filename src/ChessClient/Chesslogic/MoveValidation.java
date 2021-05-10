package ChessClient.Chesslogic;

import ChessClient.Chesslogic.Board.BoardState;
import ChessClient.Chesslogic.Board.FieldPosition;

public final class MoveValidation {

    public static boolean checkForCheckmate(){
        boolean checkMate = false;


        return checkMate;
    }

    public static boolean isMoveInbounds(int targetCol, int targetRow){
        return (targetCol >= 0 && targetCol <= 7) && (targetRow >= 0 && targetRow <= 7);
    }

    public static boolean isNotSameField(int currentCol, int currentRow, int targetCol, int targetRow){
        return (currentCol != targetCol && currentRow != targetRow);
    }



}
