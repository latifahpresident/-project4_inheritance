import java.util.ArrayList;

//Song class in "Controller" in Model View Controller design pattern
public class Song {
    String title;
    Artist artist;
    String playlist;
    String url;

    public Song(String title, Artist artist, String playlist, String url) {
        this.title = title;
        this.artist = artist;
        this.playlist = playlist;
        this.url = url;
    }

    public Song() {}

    public void setNewSong(ArrayList<Song> library, String title,  Artist artist, String playlist, String url) {
        library.add(new Song(title, artist, playlist, url));
    }

    public void getLibrary (ArrayList<Song> library) {
        library.forEach(l -> System.out.printf(" Title: %s %n Artist: %s %n Playlist %s %n URL: %s %n ------------------------- %n" , l.title, l.artist.name, l.playlist, l.url));
    }
}
