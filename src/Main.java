import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        TrumpetPlayer miles = new TrumpetPlayer("Miles Davis", "USA", "jazz", "1950s", "brass");
        TrumpetPlayer louis = new TrumpetPlayer("Louis Armstrong", "USA", "jazz", "1919-1971", "Selmar trumpet");
        Guitarist gary = new Guitarist("Gary Clark Jr", "USA", "blues", "2010s", 6);
        Vocalist machel = new Vocalist("Machel Montano", "Trinidad", "soca and calypso", "1984-present", "Alison Hinds");

        ArrayList<Song> library = new ArrayList<>();
        Song myLibrary = new Song();

        myLibrary.setNewSong(library, "What a Wonderful World", louis, "Relaxing",
                "https://www.youtube.com/watch?v=rBrd_3VMC3c");
        myLibrary.setNewSong(library, "So What", miles, "jazz", "https://www.youtube.com/watch?v=zqNTltOGh5c");
        myLibrary.setNewSong(library, "This Land", gary, "it's a vibe", "https://www.youtube.com/watch?v=9KgNaRQ_J-c&ab_channel=garyclarkjr");
        myLibrary.setNewSong(library, "Mr. Fete", machel, "fete", "https://www.youtube.com/watch?v=8ueJ5oPRQdk");

        myLibrary.getLibrary(library);
    }
}
