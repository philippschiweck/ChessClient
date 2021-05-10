package ChessClient.Pieces;

import ChessClient.GUI.Menu.Settings;
import ChessClient.Pieces.PieceTypes.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public final class PieceIcons {

    private Settings settings;

    //Load and Scale individual piece images to imageIcon
    private ImageIcon wPawn;
    private ImageIcon bPawn;

    private ImageIcon wKnight;
    private ImageIcon bKnight;

    private ImageIcon wBishop;
    private ImageIcon bBishop;

    private ImageIcon wRook;
    private ImageIcon bRook;

    private ImageIcon wQueen;
    private ImageIcon bQueen;

    private ImageIcon wKing;
    private ImageIcon bKing;


    public PieceIcons(Settings settings){
        this.settings = settings;
        //Load and Scale individual piece images to imageIcon
        wPawn = getScaledPieceImage(new Pawn(ChessColor.WHITE).getPieceIcon());
        bPawn = getScaledPieceImage(new Pawn(ChessColor.BLACK).getPieceIcon());

        wKnight = getScaledPieceImage(new Knight(ChessColor.WHITE).getPieceIcon());
        bKnight = getScaledPieceImage(new Knight(ChessColor.BLACK).getPieceIcon());

        wBishop = getScaledPieceImage(new Bishop(ChessColor.WHITE).getPieceIcon());
        bBishop = getScaledPieceImage(new Bishop(ChessColor.BLACK).getPieceIcon());

        wRook = getScaledPieceImage(new Rook(ChessColor.WHITE).getPieceIcon());
        bRook = getScaledPieceImage(new Rook(ChessColor.BLACK).getPieceIcon());

        wQueen = getScaledPieceImage(new Queen(ChessColor.WHITE).getPieceIcon());
        bQueen = getScaledPieceImage(new Queen(ChessColor.BLACK).getPieceIcon());

        wKing = getScaledPieceImage(new King(ChessColor.WHITE).getPieceIcon());
        bKing = getScaledPieceImage(new King(ChessColor.BLACK).getPieceIcon());
    }


    private ImageIcon getScaledPieceImage(String path){
        BufferedImage img;
        Image scaled = null;
        try{
            //Read Image corresponding to current piece
            img = ImageIO.read(new File(path));
            //Scale down image according to current boardsize (one square is 1/8th of the entire baord)
            scaled = img.getScaledInstance(settings.getBoardsize().getSizeX() / 8, settings.getBoardsize().getSizeX() / 8, Image.SCALE_SMOOTH);
        } catch (IOException e){
            e.printStackTrace();
        }

        return new ImageIcon(scaled);
    }

    public ImageIcon getbBishop() {
        return bBishop;
    }

    public ImageIcon getwPawn() {
        return wPawn;
    }

    public ImageIcon getbPawn() {
        return bPawn;
    }

    public ImageIcon getwKnight() {
        return wKnight;
    }

    public ImageIcon getbKnight() {
        return bKnight;
    }

    public ImageIcon getwBishop() {
        return wBishop;
    }

    public ImageIcon getwRook() {
        return wRook;
    }

    public ImageIcon getbRook() {
        return bRook;
    }

    public ImageIcon getwQueen() {
        return wQueen;
    }

    public ImageIcon getbQueen() {
        return bQueen;
    }

    public ImageIcon getwKing() {
        return wKing;
    }

    public ImageIcon getbKing() {
        return bKing;
    }
}
