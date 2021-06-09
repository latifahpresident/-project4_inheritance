public class Guitarist extends Artist{
    int numStrings;

    public Guitarist(String name, String country, String style, String timeperiod, int numStrings) {
        super(name,country, style, timeperiod);
        this.numStrings = numStrings;
    }

    public void show() {
        System.out.printf(
                "Number of Strings: %s %n ",
                numStrings );
    }
}
