package dporras.nanodegree.musicapp;

/**
 * Created by po6x on 7/2/16.
 */
public class TagMenu implements SongTag {
    private static TagMenu instance;

    public static TagMenu getInstance() {
        if (instance == null)
            instance = new TagMenu();
        return instance;
    }

    private void tagMenu() {
    }
}
