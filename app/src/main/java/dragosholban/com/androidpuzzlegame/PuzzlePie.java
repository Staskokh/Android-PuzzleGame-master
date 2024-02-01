package dragosholban.com.androidpuzzlegame;

import android.content.Context;

public class PuzzlePie extends android.support.v7.widget.AppCompatImageView {
    public int xCoord;
    public int yCoord;
    public int pieceWidth;
    public int pieceHeight;
    public boolean canMove = true;

    public PuzzlePie(Context context) {
        super(context);
    }
}