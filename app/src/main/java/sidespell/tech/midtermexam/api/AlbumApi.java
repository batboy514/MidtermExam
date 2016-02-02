package sidespell.tech.midtermexam.api;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;

import sidespell.tech.midtermexam.entities.Album;
import sidespell.tech.midtermexam.utils.HttpUtils;

/**
 * Created by Jethro on 2/2/2016.
 */
public class AlbumApi {

    public static final String BASE_URL = "http://www.last.fm/api/show/album.getInfo";
    public static final String IMG_BASE_URL = "http://www.last.fm/api";

    public static final int SUCCESS_CODE = 200;

    public static final String PARAM_QUERY = "q";
    public static final String PARAM_MODE = "mode";
    public static final String PARAM_UNITS = "units";
    public static final String PARAM_API_KEY = "appId";

    private static final String ALBUM_TITLE = "album_title";
    private static final String ALBUM_ARTIST = "artist";
    private static final String ALBUM_ICON = "icon";
    private static final String OWM_CODE = "cod";


    public static Album getAlbum(Uri uri, @NonNull String requestMethod) {
        String json = HttpUtils.getResponse(uri, requestMethod);


        if (TextUtils.isEmpty(json)) {
            return null;
        }
        final String mArtist;
        final String mIcon;
        final String mTitle;

        return null;
    }
}





