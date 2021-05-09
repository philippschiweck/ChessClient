package ChessClient.Chesslogic.Board;

public class Board {

    private Field[][] boardState;

    public Board(){
        boardState = new Field[8][8];
        for(int i = 0; i < boardState.length; i++){
            for(int j = 0; j < boardState[i].length; j++){
                char column = 'a';
                boardState[i][j] = new Field(null, (char)(column + i), j);
            }
        }
    }
}
