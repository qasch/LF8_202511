public class Schildkroete extends Tier implements Panzerung {
    boolean hatPanzer;
    Panzer panzer;

    public Schildkroete(int anzahlBeine, String name, String art, double geschwindigkeit, String lebensbereich, String material, double dicke) {
        // super() greift auf den Konstruktor der Elternklasse (Tier) zu
        // anhand der Parameterliste geben wir an, welchen Konstruktor wir meinen
        super(anzahlBeine, name, art, geschwindigkeit, lebensbereich);
        setHatPanzer(true);

        this.panzer = new Panzer(material, dicke);
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

    @Override
    public void gibLaut(){
        System.out.println("höööo");
    }

    @Override
    public void zieheGliedmassenEin(){
        System.out.println("Gliedmassen eingezogen!");
    }

    @Override
    public void streckeGliedmassenAus(){
        System.out.println("Gliedmassen ausgestreckt!");
    }


    class Panzer {

        String material;
        double dicke;

        public Panzer(String material, double dicke){
            this.material = material;
            this.dicke = dicke;
        }

        public void abwerfen(){
            System.out.println("Panzer abgeworfen");
        }

        public void anziehen(){
            System.out.println("Panzer wieder angezogen");
        }

    }

}
