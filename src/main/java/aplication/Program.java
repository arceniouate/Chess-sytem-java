package aplication;

import boardGame.Board;
import boardGame.Position;
import chess.ChessMach;

public class Program {
    public static void main(String[] args) {
        ChessMach chessMach=new ChessMach();
        UI.printBoard(chessMach.getPieces());
    }
}
