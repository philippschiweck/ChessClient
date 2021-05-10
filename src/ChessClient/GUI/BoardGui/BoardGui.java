package ChessClient.GUI.BoardGui;

import ChessClient.Chesslogic.Board.BoardState;
import ChessClient.Chesslogic.Board.FieldPosition;
import ChessClient.GUI.Menu.Settings;
import ChessClient.Chesslogic.Pieces.ChessColor;
import ChessClient.Chesslogic.Pieces.Piece;
import ChessClient.GUI.Pieces.PieceIcons;

import javax.swing.*;
import java.awt.*;


/**
 * BoardGui extends JLayeredPane and contains an 8x8 GridLayout displaying the Chess Squares. PieceIcons are placed in the positions according to the BoardState whenever
 * the board is updated.
 */
public class BoardGui extends JLayeredPane {

    private BoardState boardState;
    private Dimension boardSize;
    private Settings settings;

    private PieceIcons pieceIcons;

    public BoardGui(BoardState boardState, Settings settings){

        //TODO Board Gui and initial Boardstate are currently not correct. (White Pieces need to be on the bottom / the board needs to be turned around)

        this.boardState = boardState;
        this.settings = settings;
        this.boardSize = new Dimension(settings.getBoardsize().getSizeX(), settings.getBoardsize().getSizeY());
        this.pieceIcons = new PieceIcons(settings);


        initBoardGui();

        //Update initial Boardstate
        updateBoardState();
    }


    /**
     * Initializes the BoardGui with an 8x8 GridLayout and colors the corresponding Fields with either gray or white.
     */
    private void initBoardGui(){
        this.setLayout( new GridLayout(8, 8) );
        this.setPreferredSize( boardSize );
        this.setBounds(0, 0, boardSize.width, boardSize.height);

        for (int i = 0; i < 64; i++) {
            Square square = new Square(new BorderLayout());
            this.add(square);

            int row = (i / 8) % 2;
            if (row == 0)
                square.setBackground( i % 2 == 0 ? Color.white : Color.gray );
            else
                square.setBackground( i % 2 == 0 ? Color.gray : Color.white );
        }
    }

    /**
     * Updates the current PieceIcons shown in the GUI according to the current BoardState.
     *
     */
    public void updateBoardState(){

        //Iteration with i and j is needed for getting LayeredPane component to add piece image
        for(int i = 0; i < boardState.getBoardState().length; i++){
            for(int j = 0; j < boardState.getBoardState()[i].length; j++){
                FieldPosition currentField = boardState.getBoardState()[i][j];
                if(currentField.getPiece() != null){
                    //Get current Piece
                    Piece currentPiece = currentField.getPiece();
                    ImageIcon currentIcon = null;

                    //set corresponding ImageIcon for color/PieceType
                    //Terrifying Switch statement
                    switch(currentPiece.getType()){
                        case KING: {
                            currentIcon = currentPiece.getColor() == ChessColor.WHITE ?  pieceIcons.getwKing() : pieceIcons.getbKing();
                            break;
                        }
                        case QUEEN: {
                            currentIcon = currentPiece.getColor() == ChessColor.WHITE ?  pieceIcons.getwQueen() : pieceIcons.getbQueen();
                            break;
                        }
                        case ROOK: {
                            currentIcon = currentPiece.getColor() == ChessColor.WHITE ?  pieceIcons.getwRook() : pieceIcons.getbRook();
                            break;
                        }
                        case BISHOP: {
                            currentIcon = currentPiece.getColor() == ChessColor.WHITE ?  pieceIcons.getwBishop() : pieceIcons.getbBishop();
                            break;
                        }
                        case KNIGHT: {
                            currentIcon = currentPiece.getColor() == ChessColor.WHITE ?  pieceIcons.getwKnight() : pieceIcons.getbKnight();
                            break;
                        }
                        case PAWN: {
                            currentIcon = currentPiece.getColor() == ChessColor.WHITE ?  pieceIcons.getwPawn() : pieceIcons.getbPawn();
                            break;
                        }
                    }

                    //Add current PieceIcon to Icon, add label to corresponding field
                    Icon piece = new Icon( currentIcon, JLabel.CENTER );//current.getPiece().getPieceIcon()
                    Square panel = (Square)this.getComponent(8 * i + j);
                    panel.add(piece);
                }
            }
        }
    }
}
