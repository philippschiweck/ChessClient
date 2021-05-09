package ChessClient.Chesslogic.Board;

import ChessClient.Chesslogic.Board.Field;

public final class BoardSetup {

    //Class is non instantiable
    private BoardSetup(){}

    public static Field[][] createInitialSetup(){

        Field[][] initialSetup = new Field[8][8];

        for(int i = 0; i < initialSetup.length; i++){
            for(int j = 0; j < initialSetup[i].length; j++){
                char column = 'a';
                initialSetup[i][j] = new Field(null, (char)(column + i), j);
            }
        }

        return initialSetup;
    }

}
