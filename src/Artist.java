public class Artist {
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
    public Artist(){}

    public void show() {

        System.out.printf(
                "Name: %s %n Country: %s %n Style: %s %n Time Period: %s %n",
                name, country, style, timePeriod );
    }
}
