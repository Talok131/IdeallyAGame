import java.util.ArrayList;

public class Boards {
    private String boardName;
    private int tiles[];
    public Boards(String boardName, int tiles[]){
        this.boardName = boardName;
        this.tiles = tiles;
    }

    public String getBoardName() {
        return boardName;
    }

    public int[] getTiles() {
        return tiles;
    }
}
