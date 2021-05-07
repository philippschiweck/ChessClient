package ChessClient.Pieces;

public abstract class Piece {

    private int value;
    private Color color;
    private PieceType type;

    public Piece(Color color, PieceType type){
        this.color = color;
        this.type = type;
        this.value = type.getValue();
    }

    public Color getColor(){
        return color;
    }

    public int getValue(){
        return value;
    }

    public PieceType getType() {
        return type;
    }
}
