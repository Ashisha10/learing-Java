import java.util.ArrayList;

public class Album extends Song {
    protected ArrayList<Song> AlbumList = new ArrayList<Song>();

    void addSong(Song song) {
        AlbumList.add(song);
    }

    void rmSong(Song song) {
        if (song.getSongName().equals(song.getSongName())) {
            AlbumList.remove(song);
        }
    }

    void completeAlbum(String str) {
        if(str == "album completed") {
            return;
        }
    }
}
