package dporras.nanodegree.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView sportsSongsImageView;
    private ImageView favoriteSongsImageView;
    private ImageView sadSongsImageView;
    private ImageView roadSongsImageView;
    private ImageView  karaokeSongsImageView;
    private ImageView  meditationSongsImageView;
    private ImageView  shuffledSongsImageView;
    private ImageView settingsImageView;

    public static final String CATEGORY="CATEGORY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }

    private void initComponents(){
        //Retrieve sports image view and bids this class as click Listener
        sportsSongsImageView = (ImageView) findViewById(R.id.sports_songs_image_view);
        sportsSongsImageView.setOnClickListener(this);

        //Retrieve favorite image view and bids this class as click Listener
        favoriteSongsImageView = (ImageView) findViewById(R.id.favorite_songs_image_view);
        favoriteSongsImageView.setOnClickListener(this);

        //Retrieve sad image view and bids this class as clicListener
        sadSongsImageView = (ImageView) findViewById(R.id.sad_songs_image_view);
        sadSongsImageView.setOnClickListener(this);

        //Retrieve road image view and bids this class as click Listener
        roadSongsImageView = (ImageView) findViewById(R.id.road_songs_image_view);
        roadSongsImageView.setOnClickListener(this);

        //Retrieve karaoke image view and bids this class as click Listener
        karaokeSongsImageView = (ImageView) findViewById(R.id.karaoke_songs_image_view);
        karaokeSongsImageView.setOnClickListener(this);

        //Retrieve karaoke image view and bids this class as click Listener
        meditationSongsImageView = (ImageView) findViewById(R.id.meditation_songs_image_view);
        meditationSongsImageView.setOnClickListener(this);

        //Retrieve shuffled songs image view and bids this class as click Listener
        shuffledSongsImageView = (ImageView) findViewById(R.id.shuffled_songs_image_view);
        shuffledSongsImageView.setOnClickListener(this);

        settingsImageView = (ImageView) findViewById(R.id.settings_image_view);
        settingsImageView .setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //Prepares an intent for launching an activity that shows
        // the selected cathegory playlists or the settings for the app
        Intent intent = new Intent(this, PlaylistActivity.class);
        Log.i("INFO","View ID;"+view.getId());
        if (R.id.settings_image_view==view.getId()){
             intent = new Intent(this,SettingsActivity.class);
            Log.i("INFO","MATCHED");
        }

        //default category is all songs shuffled
        int category=SongTag.SHUFFLED_SONG;
        //Identifies which category was clicked and adds it as parameter to an intent
        switch (view.getId()){
            case R.id.sports_songs_image_view:
                category=SongTag.SPORTS_SONG;
                break;
            case R.id.favorite_songs_image_view:
                category=SongTag.FAVORITE_SONG;
                break;
            case R.id.sad_songs_image_view:
                category=SongTag.SAD_SONG;
                break;
            case R.id.road_songs_image_view:
                category=SongTag.ROAD_SONG;
                break;
            case R.id.karaoke_songs_image_view:
                category=SongTag.KARAOKE_SONG;
                break;
            case R.id.meditation_songs_image_view:
                category = SongTag.MEDITATION_SONG;
                break;
            default:
                System.out.print("NOTHING");
        }
        //Adds the corresponding category before launch the Activity
        intent.putExtra(MainActivity.CATEGORY,category);
        startActivity(intent);
    }
}
