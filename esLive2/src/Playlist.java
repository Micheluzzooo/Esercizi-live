import java.util.ArrayList;
import java.util.List;

public class Playlist implements PlaylistInterface {

    private List<Song> songs = new ArrayList<>();


    @Override
    public void addSong(Song song) {
        songs.add(song);
    }

    @Override
    public void deleteSong(Song song) {
        songs.remove(song);
    }

    @Override
    public Song findSong(String titolo) {
        for(Song song : songs) {
            if(song.getTitolo().equals(titolo)){
                return song;
            }
        }
        return null;
    }

    @Override
    public void deleteAll() {
        songs.clear();
    }

    @Override
    public void printSongs() {
        System.out.println(songs);
    }

    @Override
    public boolean addSongs(List<Song> songs) {
        return this.songs.addAll(songs);
    }

    @Override
    public List<Integer> getDates() {
        List<Integer> yearList = new ArrayList<>();
        for(Song song : songs) {
            yearList.add(song.getRelaseDate().getYear());
        }
        return yearList;
    }

    @Override
    public List<String> getTitoli() {
        List<String> songNames = new ArrayList<>();
        for(Song song: songs) {
            songNames.add(song.getTitolo());
        }
        return songNames;
    }


}
