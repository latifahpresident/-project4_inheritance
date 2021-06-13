public class TrumpetPlayer extends Artist implements GetArtistInfo {
    String trumpetType;

    public TrumpetPlayer( String name, String country, String style, String timePeriod, String trumpetType) {
        super(name,country, style, timePeriod);
        this.trumpetType = trumpetType;
    }



    public void getArtistInfo() {

        super.getArtistInfo();
        System.out.printf(
                " %n %n Artist Info: %n Name: %s %n Country %s %n  Style: %s %n Time Period: %s %n Trumpet Type: %s %n %n ----------------------- ",
                name, country, style, timePeriod, trumpetType );
    }
}
