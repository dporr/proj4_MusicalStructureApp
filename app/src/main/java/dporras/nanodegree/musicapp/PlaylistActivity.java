package dporras.nanodegree.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by po6x on 7/2/16.
 */
public class PlaylistActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle params = getIntent().getExtras();
        int category=params.getInt(MainActivity.CATEGORY);
        setContents(category);
        setContentView(R.layout.activity_playlist);
    }

    /**
     * Sets title to the activity and the playlist content
     * @param category
     * @return
     */

    //TODO: implement data adapter to fill playlist
    private void setContents(int category){
        switch (category){
            case  SongTag.FAVORITE_SONG:
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
