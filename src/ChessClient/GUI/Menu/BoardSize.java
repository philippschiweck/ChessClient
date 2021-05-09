package ChessClient.GUI.Menu;

public enum BoardSize {

    SMALL(256),
    MEDIUM(512),
    LARGE(1024);

    private int sizeY;
    private int sizeX;

    BoardSize(int size){
        this.sizeX = size;
        this.sizeY = size;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }
}
