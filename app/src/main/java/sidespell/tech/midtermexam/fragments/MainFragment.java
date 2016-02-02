package sidespell.tech.midtermexam.fragments;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;

import sidespell.tech.midtermexam.BuildConfig;
import sidespell.tech.midtermexam.R;
import sidespell.tech.midtermexam.api.AlbumApi;
import sidespell.tech.midtermexam.entities.Album;

public class MainFragment extends Fragment {

    private EditText searchAlbum;
    private ProgressBar mProgressBar;


    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        // TODO: Find all views here..

        searchAlbum=(EditText) view.findViewById(R.id.etAlbum);
        mProgressBar=(ProgressBar) view.findViewById(R.id.progressBar);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        // TODO: Perform logic operations here..
    }
    public class FetchAlbumTask extends AsyncTask<String,Void,Album> {
        @Override
        protected void onPreExecute() {
            mProgressBar.setVisibility(View.VISIBLE);
            searchAlbum.setVisibility(View.GONE);

        }


        @Override
        protected Album doInBackground(String... params) {
            if (params.length == 0) {
                return null;
            }

            String city = params[0];

            Uri builtUri = Uri.parse(AlbumApi.BASE_URL).buildUpon()
                    .appendQueryParameter(AlbumApi.PARAM_QUERY, city)
                    .appendQueryParameter(AlbumApi.PARAM_MODE, "json")
                    .appendQueryParameter(AlbumApi.PARAM_UNITS, "metric")
                    .appendQueryParameter(AlbumApi.PARAM_API_KEY,
                            BuildConfig.MIDTERM_EXAM_API_KEY)
                    .build();

            return AlbumApi.getAlbum(builtUri, "GET");
        }

    }
}


