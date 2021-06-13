public class Guitarist extends Artist implements  GetArtistInfo{
    int numStrings;

    public Guitarist(String name, String country, String style, String timePeriod, int numStrings) {
        super(name,country, style, timePeriod);
        this.numStrings = numStrings;
    }

    public void getArtistInfo() {
        System.out.printf(
                " %n Artist Info: %n Name: %s %n Country: %s %n Style: %s %n Time Period: %s %n Number of Strings: %s %n %n ----------------------- ",
                name, country, style, timePeriod, numStrings );
    }
}
