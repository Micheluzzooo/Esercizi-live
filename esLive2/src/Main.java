import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date1 = OffsetDateTime.parse("2024-02-06T00:00:00Z");
        OffsetDateTime date2 = OffsetDateTime.parse("2024-02-03T00:00:00Z");
        Song song1 = new Song("La noia", 1, date1);
        Song song2 = new Song("P me p te", 2, date2);

        List<Song> canzoni = new ArrayList<>();
        canzoni.add(song1);
        canzoni.add(song2);

        Playlist playlist = new Playlist();
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.printSongs();

        System.out.println(playlist.findSong("La noia"));
        //playlist.deleteAll();
        //playlist.deleteSong(song1);
        playlist.printSongs();

        System.out.println("Canzone aggiunta " + playlist.addSongs(canzoni));
        playlist.printSongs();

        System.out.println(playlist.getDates());
        System.out.println(playlist.getTitoli());




    }
}