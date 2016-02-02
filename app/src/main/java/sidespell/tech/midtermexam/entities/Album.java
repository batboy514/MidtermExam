package sidespell.tech.midtermexam.entities;

import android.graphics.Bitmap;

/**
 * Created by Jethro on 2/2/2016.
 */
public class Album {

    private String mArtist;
    private String mTitle;
    private String mIcon;

    private Bitmap mAlbum;


    public String getmArtist() {
        return mArtist;
    }

    public void setmArtist(String mArtist) {
        this.mArtist = mArtist;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmIcon() {
        return mIcon;
    }

    public void setmIcon(String mIcon) {
        this.mIcon = mIcon;
    }

    public Bitmap getmAlbum() {
        return mAlbum;
    }

    public void setmAlbum(Bitmap mAlbum) {
        this.mAlbum = mAlbum;
    }
}
