public class Vocalist extends Artist implements GetArtistInfo{
    String influencedBy;

    public Vocalist(String name, String country, String style, String timePeriod, String influencedBy) {
        super(name, country, style, timePeriod);
        this.influencedBy = influencedBy;
    }

    public void getArtistInfo() {

        System.out.printf(
                " %n Artist Info: %n Name: %s %n Country: %s %n Style: %s %n Time Period: %s %n Influenced By: %s %n %n ----------------------- ",
                name, country, style, timePeriod, influencedBy );
    }
}
