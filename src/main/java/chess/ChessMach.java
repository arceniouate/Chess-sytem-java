package chess;

import boardGame.Board;

/***
 * nessa classe termos as regras do xadre
 */
public class ChessMach {
    /**
     * tabuleiro de chader
     */
    private Board board;

    /***
     *  essa clasee e reposnacel por saber qual e a dimensaão  do taboleiro de  xadrex
     */
    public ChessMach() {
        board=new Board(8,8);
    }

    /**
     * cam de chadrex onde o program do vai ver as pecas camada do xadre
     * @return a matriz peca da partida de xadrex
     */
    public ChessPiece[][]getPieces(){
        ChessPiece[][]mat=new ChessPiece[board.getRows()][board.getColumns()];
        for(int i=0;i<board.getRows();i++){
            for(int j=0;j<board.getRows();j++) {
                mat[i][j]=(ChessPiece) board.piece(i,j);
            }

            }
        return mat;

    }
}
