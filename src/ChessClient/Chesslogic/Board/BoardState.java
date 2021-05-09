package ChessClient.Chesslogic.Board;

import ChessClient.Chesslogic.Game;

public class BoardState {

    private FieldPosition[][] boardState;
    private Game game;

    public BoardState(Game game){

        this.game = game;

        this.boardState = BoardSetup.createInitialSetup();

        for(int i = 0; i < boardState.length; i++){
            for(int j = 0; j < boardState[i].length; j++){
                System.out.print(boardState[i][j].getPiece());
            }
            System.out.println();
        }
    }

    public FieldPosition[][] getBoardState() {
        return boardState;
    }
}
