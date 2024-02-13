import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Song {
    private String titolo;
    private int id;
    OffsetDateTime relaseDate;

    public Song(String titolo, int id, OffsetDateTime relaseDate) {
        this.titolo = titolo;
        this.id = id;
        this.relaseDate = relaseDate;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OffsetDateTime getRelaseDate() {
        return relaseDate;
    }

    public void setRelaseDate(OffsetDateTime relaseDate) {
        this.relaseDate = relaseDate;
    }

    @Override
    public String toString() {
        return "Song{" +
                "titolo='" + titolo + '\'' +
                ", relaseDate=" + relaseDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) +
                '}';
    }
}
