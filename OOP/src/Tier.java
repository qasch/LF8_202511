public class Tier {
    // Eigenschaften/Attribute
    int anzahlBeine;
    String name;
    String art;
    double geschwindigkeit;
    String lebensbereich;

    // Konstruktor - soll ein neu erzeugtes Objekt in einen sinnvollen
    // Ausgangszustand versetzen (mit sinnvollen Initialwerten versehen)

    // Standardkonstruktor / parameterlose Konstruktor
    // solange kein eigener Konstruktor definiert ist, wir dieser aufgerufen
    // falls wir aber einen eigenen Konstruktor erstellt haben, müssten wir
    // ihn wieder hinschreiben
    public Tier(){

    }

    /* Konstruktor mit zwei Parametern (überschreibt den Standardkonstruktor -> Polymorphie)
    this ist ein Schlüsselwort, mit dem wir *die Klasse an sich* referenzieren
    d.h. dass mit this.name das Attribut name (ganz oben) gemeint ist, mit name (ohne this)
    der Parameter bzw. die lokale Variable name (die es nur hier innerhalb
    dieses Konstruktors gibt)
     */
    public Tier(String name, String art) {
        this.anzahlBeine = 4;
        this.name = name;
        this.art = art;
        this.lebensbereich = "irgendwo";
    }

    // Konstruktor mit vier Parametern (überschreibt den Standardkonstruktor -> Polymorphie)
    public Tier(int anzahlBeine, String name, String art, double geschwindigkeit, String lebensbereich) {
        this.anzahlBeine = anzahlBeine;
        this.name = name;
        this.art = art;
        this.geschwindigkeit = geschwindigkeit;
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
    boolean istLandtier(){
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
        System.out.println("------- " + this.name + " -------");

        System.out.print("Wie viele Beine hat unser Tier? ");
        System.out.println(this.anzahlBeine);

        System.out.print("Wie schnell ist unser Tier? ");
        System.out.println(this.geschwindigkeit);

        System.out.print("Wie heißt unser Tier? ");
        System.out.println(this.name);

        System.out.print("Welche Art ist unser Tier? ");
        System.out.println(this.art);

        System.out.print("Wo lebt unser Tier? ");
        System.out.println(this.lebensbereich);
    }
}
