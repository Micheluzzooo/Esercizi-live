import java.util.List;

public interface PlaylistInterface {

    public void addSong(Song song);
    public void deleteSong(Song song);
    public Song findSong(String titolo);
    public void deleteAll();
    public void printSongs();
    public boolean addSongs(List<Song> songs);
    public List<Integer> getDates();
    public List<String> getTitoli();
    public List<Song> getSongs();

}
