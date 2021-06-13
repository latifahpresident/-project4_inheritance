import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Artist[] artist = new Artist[4];
        artist[0] = new Vocalist("Machel Montano", "Trinidad", "soca and calypso", "1984-present", "Alison Hinds");
        artist[1] = new TrumpetPlayer("Miles Davis", "USA", "jazz", "1950s", "brass");
        artist[2] = new TrumpetPlayer("Louis Armstrong", "USA", "jazz", "1919-1971", "Selmar trumpet");
        artist[3] = new Guitarist("Gary Clark Jr", "USA", "blues", "2010s", 6);

        ArrayList<Song> library = new ArrayList<>();
        Song myLibrary = new Song();
        myLibrary.setNewSong(library, "Mr. Fete", artist[0], "fete", "https://www.youtube.com/watch?v=8ueJ5oPRQdk");
        myLibrary.setNewSong(library, "So What", artist[1], "jazz", "https://www.youtube.com/watch?v=zqNTltOGh5c");
        myLibrary.setNewSong(library, "What a Wonderful World", artist[2], "Relaxing", "https://www.youtube.com/watch?v=rBrd_3VMC3c");
        myLibrary.setNewSong(library, "This Land", artist[3], "it's a vibe", "https://www.youtube.com/watch?v=9KgNaRQ_J-c&ab_channel=garyclarkjr");

        myLibrary.getLibrary(library);
        artist[0].getArtistInfo();
        artist[1].getArtistInfo();
        artist[2].getArtistInfo();
        artist[3].getArtistInfo();




    }
}
