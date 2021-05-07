package ChessClient.GUI.Menu;

public enum BoardSize {

    SMALL(128),
    MEDIUM(256),
    LARGE(512);

    private int sizeY;
    private int sizeX;

    BoardSize(int size){
        this.sizeX = size;
        this.sizeY = size;
    }
}
