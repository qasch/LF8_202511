public class Tier {
    // Eigenschaften/Attribute
    int anzahlBeine;
    String name, art, lebensbereich;
    double geschwindigkeit;
    /* Konstruktor - soll ein neu erzeugtes Objekt in einen sinnvollen
     Ausgangszustand versetzen (mit sinnvollen Initialwerten versehen)

     Standardkonstruktor / parameterlose Konstruktor
     solange kein eigener Konstruktor definiert ist, wir dieser aufgerufen
     falls wir aber einen eigenen Konstruktor erstellt haben, müssten wir
     ihn wieder hinschreiben
     */
    public Tier(){

    }

    /* Konstruktor mit zwei Parametern (überschreibt den Standardkonstruktor -> Polymorphie)
    this ist ein Schlüsselwort, mit dem wir *die Klasse an sich* referenzieren
    d.h. dass mit this.name das Attribut name (ganz oben) gemeint ist, mit name (ohne this)
    der Parameter bzw. die lokale Variable name (die es nur hier innerhalb
    dieses Konstruktors gibt)
     */
    public Tier(String name, String art) {
        this.setAnzahlBeine(4);
        this.name = name;
        this.art = art;
        this.lebensbereich = "irgendwo";
    }

    // Konstruktor mit vier Parametern (überschreibt den Standardkonstruktor -> Polymorphie)
    public Tier(int anzahlBeine, String name, String art, double geschwindigkeit, String lebensbereich) {
        this.setAnzahlBeine(anzahlBeine);
        this.name = name;
        this.art = art;
        this.setGeschwindigkeit(geschwindigkeit);
        this.lebensbereich = lebensbereich;
    }

    // Getter und Setter
    public int getAnzahlBeine() {
        return anzahlBeine;
    }

    public void setAnzahlBeine(int anzahlBeine) {
        if(anzahlBeine > 0 && anzahlBeine < 4) {
            this.anzahlBeine = anzahlBeine;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        if(geschwindigkeit >= 0.0) {
            this.geschwindigkeit = geschwindigkeit;
        }
    }

    public String getLebensbereich() {
        return lebensbereich;
    }

    public void setLebensbereich(String lebensbereich) {
        this.lebensbereich = lebensbereich;
    }


    // Fähigkeiten/Funktionalitäten

    /**
     * Simuliert das Fressen über die Ausgabe eines Geräuschs.
     */
    void friss(){
        System.out.println("mampf mampf");
    }

    /**
     * Gib das Geräusch aus, dass das Tier macht.
     *
     * @param laut das Geräusch, dass das Tier macht
     */
    void gibLaut(String laut){
        System.out.println(laut);
    }

    /**
     * Gib zurück, ob ein Tier an Land lebt
     * @return true, falls es ein Landdtier ist, sonst false
     */
    private boolean istLandtier(){
        if (this.lebensbereich.equals("Land")){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Gib eine Beschreibung des Tiers bzw. der gesetzten Attribute aus.
     */
    void beschreibeDichSelbst(){
        System.out.println();
        System.out.println("------- " + this.getName() + " -------");

        System.out.print("Wie viele Beine hat unser Tier? ");
        System.out.println(this.getAnzahlBeine());

        System.out.print("Wie schnell ist unser Tier? ");
        System.out.println(this.getGeschwindigkeit());

        System.out.print("Wie heißt unser Tier? ");
        System.out.println(this.getName());

        System.out.print("Welche Art ist unser Tier? ");
        System.out.println(this.getArt());

        System.out.print("Wo lebt unser Tier? ");
        System.out.println(this.getLebensbereich());
    }
}
