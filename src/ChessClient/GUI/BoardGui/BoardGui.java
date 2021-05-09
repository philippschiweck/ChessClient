package ChessClient.GUI.BoardGui;

import ChessClient.Chesslogic.Board.BoardState;
import ChessClient.Chesslogic.Board.FieldPosition;
import ChessClient.GUI.Menu.Settings;

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

    public BoardGui(BoardState boardState, Settings settings){
        this.boardState = boardState;
        this.settings = settings;
        this.boardSize = new Dimension(settings.getBoardsize().getSizeX(), settings.getBoardsize().getSizeY());

        initBoardGui();


        addPieces();
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

    private void addPieces(){

        for(int i = 0; i < boardState.getBoardState().length; i++){
            for(int j = 0; j < boardState.getBoardState()[i].length; j++){
                FieldPosition current = boardState.getBoardState()[i][j];
                if(current.getPiece() != null){
                    BufferedImage img;
                    try{
                        img = ImageIO.read(new File(current.getPiece().getPieceIcon()));
                        Image scaled = img.getScaledInstance(settings.getBoardsize().getSizeX() / 8, settings.getBoardsize().getSizeX() / 8, Image.SCALE_SMOOTH);
                        JLabel piece = new JLabel( new ImageIcon(scaled), JLabel.CENTER );//current.getPiece().getPieceIcon()
                        JPanel panel = (JPanel)this.getComponent(8 * i + j);
                        panel.add(piece);
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
