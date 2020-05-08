package boardGame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        this.position=null;
    }

    /***
     *  colocamos a classe como pretect para não ser acessivel a outos packeges
     *  não quero expor  o tabuleiro
     * @return boar
     */
    protected Board getBoard() {

        return board;
    }


}
