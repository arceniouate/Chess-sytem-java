package boardGame;

public class Board {
    private  int rows;
    private int columns;
    private Piece[][]pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces =new  Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    /***
     * medo para retornar a pessa dada
     * @param row
     * @param column
     * @return
     */

    public Piece piece(int row,int column){
        return pieces[row][column];

    }


    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumns()];

    }

    /**
     *  metodo responsavel por colacae o pedaco na posição do taboleiro
     *  pegr na matriz e atribuir a posicao dada a peca
     * @param piece
     */
    public  void PlacePiece( Piece piece ,Position position){
        pieces[position.getRow()][position.getColumns()]=piece;
        piece.position=position;

    }

}
