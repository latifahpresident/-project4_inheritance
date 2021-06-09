public class TrumpetPlayer extends Artist {
    String trumpetType;

    public TrumpetPlayer( String name, String country, String style, String timeperiod, String trumpetType) {
        super(name,country, style, timeperiod);
        this.trumpetType = trumpetType;
    }



    public void show() {

        super.show();
        System.out.printf(
                "Trumpet Type: %s %n ",
                trumpetType );
    }
}
