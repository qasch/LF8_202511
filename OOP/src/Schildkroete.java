public class Schildkroete extends Tier {
    boolean hatPanzer;

    public Schildkroete(int anzahlBeine, String name, String art, double geschwindigkeit, String lebensbereich) {
        // super() greift auf den Konstruktor der Elternklasse (Tier) zu
        // anhand der Parameterliste geben wir an, welchen Konstruktor wir meinen
        super(anzahlBeine, name, art, geschwindigkeit, lebensbereich);
        setHatPanzer(true);
    }

    public boolean getHatPanzer() {
        return hatPanzer;
    }

    public void setHatPanzer(boolean hatPanzer) {
        this.hatPanzer = hatPanzer;
    }

    /**
     * Gib eine Beschreibung des Tiers bzw. der gesetzten Attribute aus.
     */
    @Override
    void beschreibeDichSelbst(){
        // mit super rufen wir die Methode der Klasse Tier auf
        super.beschreibeDichSelbst();
        // und erweitern sie mit beliebigem Code
        System.out.print("Hat unser Tier einen Panzer? ");
        System.out.println(this.getHatPanzer());
    }
}
