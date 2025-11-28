public class Adler implements Flugfaehig {

    private final String name;

    public Adler(String name) {
        this.name = name;
    }

    @Override
    public void starte() {
        System.out.println(name + " breitet die Flügel aus und hebt ab.");
    }

    @Override
    public void fliege() {
        System.out.println(name + " kreist hoch am Himmel.");
    }

    @Override
    public void lande() {
        System.out.println(name + " setzt elegant zur Landung an.");
    }
}
