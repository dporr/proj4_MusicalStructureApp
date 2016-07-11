package dporras.nanodegree.musicapp;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by po6x on 7/2/16.
 */
public class PlaylistActivity extends AppCompatActivity {
    private ListView listView_playlist;
    private ImageView backImageView, playImageView, nextImageView, tagMenuImageView;
    private ArrayList<String> songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle params = getIntent().getExtras();
        int category = params.getInt(MainActivity.CATEGORY);
        setContents(category);
        setContentView(R.layout.activity_playlist);
        initComponents();
    }

    private void initComponents() {
        //Initialize view objects
        backImageView = (ImageView) findViewById(R.id.backBImageView);
        playImageView = (ImageView) findViewById(R.id.playImageView);
        nextImageView = (ImageView) findViewById(R.id.nextImageView);
        listView_playlist = (ListView) findViewById(R.id.playlist_list_view);
        songs = new ArrayList<String>();
        songs.add("SONG_NAME,AUTHOR");
        songs.add("SONG_NAME_0,AUTHOR_0");
        songs.add("SONG_NAME_1,AUTHOR_1");
        //ListView setup
        ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, songs);
        listView_playlist.setAdapter(myArrayAdapter);

    }

    /**
     * Sets title to the activity and the playlist content
     *
     * @param category
     * @return
     */

    //TODO: implement data adapter to fill playlist
    private void setContents(int category) {
        switch (category) {
            case SongTag.FAVORITE_SONG:
                this.setTitle("Favorite songs");
                break;
            case SongTag.KARAOKE_SONG:
                this.setTitle("Karaoke, let's sing!");
                break;
            case SongTag.MEDITATION_SONG:
                this.setTitle("Chill out songs");
                break;
            case SongTag.SPORTS_SONG:
                this.setTitle("Sports songs");
                break;
            case SongTag.SAD_SONG:
                this.setTitle("No so good mod Songs");
                break;
            case SongTag.SHUFFLED_SONG:
                this.setTitle("My music library");
                break;

            case SongTag.ROAD_SONG:
                this.setTitle("Road songs");
                break;
        }
    }
}
