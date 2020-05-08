package chess;

import boardGame.Board;
import boardGame.Piece;

public class ChessPiece  extends Piece {
private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    /**
     * queo so que a cor seja acessa não modificd
     * @return cor
     */
    public Color getColor() {
        return color;
    }


}
