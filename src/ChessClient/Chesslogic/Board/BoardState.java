package ChessClient.Chesslogic.Board;

import ChessClient.Chesslogic.Game;

public class BoardState {

    private FieldPosition[][] boardState;
    private Game game;

    public BoardState(Game game){

        this.game = game;

        this.boardState = BoardSetup.createInitialSetup();

    }
}
