/**
 * Zeigt die Nutzung eines Interfaces: Code interagiert nur über die Methoden
 * der Schnittstelle Flugfaehig und kennt die konkrete Klasse nicht.
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Flugfaehig flieger = new Adler("Adele");
        flieger.starte();
        flieger.fliege();
        flieger.lande();
    }
}
