package ChessClient.GUI.Menu;

public class Settings {

    private BoardSize boardsize;

    public Settings(){
        //Default Settings
        this.boardsize = BoardSize.MEDIUM;
    }

    public BoardSize getBoardsize() {

        return boardsize;
    }
}
