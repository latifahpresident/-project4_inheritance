public class Artist implements GetArtistInfo {
    String name;
    String country;
    String style;
    String timePeriod;

    public Artist(String name, String country, String style, String timePeriod) {
        this.name = name;
        this.country = country;
        this.style = style;
        this.timePeriod = timePeriod;
    }
    public void getArtistInfo() {
        System.out.printf(" Artist Info: %n Name: %s %n Country: %s %n Style: %s %n Time Period: %s %n %n ----------------------- ",
                name, country, style, timePeriod );
    }

}
