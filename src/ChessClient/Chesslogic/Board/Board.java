package ChessClient.Chesslogic.Board;

import ChessClient.Chesslogic.BoardSetup;
import ChessClient.Chesslogic.Game;

public class Board {

    private Field[][] boardState;
    private Game game;

    public Board(Game game){

        this.game = game;

        this.boardState = BoardSetup.createInitialSetup();

    }
}
