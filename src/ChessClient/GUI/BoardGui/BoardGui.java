package ChessClient.GUI.BoardGui;

import ChessClient.Chesslogic.Board.BoardState;
import ChessClient.Chesslogic.Board.FieldPosition;
import ChessClient.GUI.Menu.Settings;
import ChessClient.Pieces.ChessColor;
import ChessClient.Pieces.Piece;
import ChessClient.Pieces.PieceIcons;
import ChessClient.Pieces.PieceTypes.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BoardGui extends JLayeredPane {

    private BoardState boardState;
    private Dimension boardSize;
    private Settings settings;

    private PieceIcons pieceIcons;

    public BoardGui(BoardState boardState, Settings settings){
        this.boardState = boardState;
        this.settings = settings;
        this.boardSize = new Dimension(settings.getBoardsize().getSizeX(), settings.getBoardsize().getSizeY());
        this.pieceIcons = new PieceIcons(settings);

        initBoardGui();


        updateBoardState();
    }

    private void initBoardGui(){
        this.setLayout( new GridLayout(8, 8) );
        this.setPreferredSize( boardSize );
        this.setBounds(0, 0, boardSize.width, boardSize.height);

        for (int i = 0; i < 64; i++) {
            JPanel square = new JPanel(new BorderLayout());
            this.add(square);

            int row = (i / 8) % 2;
            if (row == 0)
                square.setBackground( i % 2 == 0 ? Color.white : Color.gray );
            else
                square.setBackground( i % 2 == 0 ? Color.gray : Color.white );
        }


    }

    private void updateBoardState(){

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

                    //Add current PieceIcon to JLabel, add label to corresponding field
                    JLabel piece = new JLabel( currentIcon, JLabel.CENTER );//current.getPiece().getPieceIcon()
                    JPanel panel = (JPanel)this.getComponent(8 * i + j);
                    panel.add(piece);

                }
            }
        }
    }



}
