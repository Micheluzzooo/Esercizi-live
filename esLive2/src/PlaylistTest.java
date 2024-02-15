import org.junit.Test;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PlaylistTest {


    @Test
   public void testAddSong() {
        Playlist playlist = new Playlist();
        OffsetDateTime date1 = OffsetDateTime.parse("2024-02-06T00:00:00Z");
        Song song1 = new Song("La noia", 1, date1);
        playlist.addSong(song1);
        assertTrue(playlist.getSongs().contains(song1));
    }

    @Test
    public void testDeleteSongs() {
        Playlist playlist = new Playlist();
        OffsetDateTime date1 = OffsetDateTime.parse("2024-02-06T00:00:00Z");
        Song song1 = new Song("La noia", 1, date1);
        playlist.addSong(song1);
        playlist.deleteSong(song1);
        assertFalse(playlist.getSongs().contains(song1));
    }

    @Test
    public void testGetDates() {
        Playlist playlist = new Playlist();
        OffsetDateTime date1 = OffsetDateTime.parse("2024-02-06T00:00:00Z");
        OffsetDateTime date2 = OffsetDateTime.parse("2021-02-06T00:00:00Z");
        Song song1 = new Song("La noia", 1, date1);
        Song song2 = new Song("P me p te", 2, date2);
        playlist.addSong(song1);
        playlist.addSong(song2);
        List<Integer> result = playlist.getDates();
        List<Integer> excepted = new ArrayList<>();
        excepted.add(2024);
        excepted.add(2021);
        assertEquals(excepted, result);
    }
}

