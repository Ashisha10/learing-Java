import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist extends Album{
    private int totalTime;
    private LinkedList<Song> playll = new LinkedList<Song>();
    public Playlist() {
        super();
    }
    boolean checkAlbum(Song song) {
        for(int i = 0; i < AlbumList.size(); i++) {
            if(AlbumList.get(i).getSongName() == song.getSongName()) {
                return true;
            }
        }
        return false;
    }
    void addSong(Song song) {
        playll.add(song);
        totalTime += song.getSongDuration();
    }
    void rmSong(Song song) {
        super.rmSong(song);
        totalTime -= song.getSongDuration();
    }
    void printPlaylist() {
        ListIterator<Song> iterator = playll.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next().getSongName());
        }
    }
    void nextSong() {
        
    }

}
