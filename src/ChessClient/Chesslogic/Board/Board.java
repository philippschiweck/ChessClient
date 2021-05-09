package ChessClient.Chesslogic.Board;

import ChessClient.Chesslogic.BoardSetup;

public class Board {

    private Field[][] boardState;

    public Board(){

        this.boardState = BoardSetup.createInitialSetup();

    }
}
