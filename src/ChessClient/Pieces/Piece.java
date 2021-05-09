package ChessClient.Pieces;


public abstract class Piece {

    private int value;
    private ChessColor color;
    private PieceType type;
    private String pieceIcon;

    public Piece(ChessColor color, PieceType type, String imagePath){
        this.color = color;
        this.type = type;
        this.value = type.getValue();
        this.pieceIcon = imagePath;
    }

    public ChessColor getColor(){
        return color;
    }

    public int getValue(){
        return value;
    }

    public PieceType getType() {
        return type;
    }
}
