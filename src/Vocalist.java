public class Vocalist extends Artist{
    String influencedBy;

    public Vocalist(String name, String country, String style, String timePeriod, String influencedBy) {
        super(name, country, style, timePeriod);
        this.influencedBy = influencedBy;
    }

    public void show() {

        System.out.printf(
                "Influenced By: %s %n ",
                influencedBy );
    }
}
