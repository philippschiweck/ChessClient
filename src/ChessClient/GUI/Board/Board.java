package ChessClient.GUI.Board;

import ChessClient.Pieces.Piece;

public class Board {

    private Field[][] boardState;

    Board(){
        boardState = new Field[8][8];
    }
}
