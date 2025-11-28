/**
 * Komposition: Eine Schildkröte besitzt zwingend einen Panzer.
 * Der Panzer wird im Konstruktor erzeugt und existiert nicht ohne die Schildkröte.
 */
public class KompositionsSchildkroete extends Tier {

    private final Panzer panzer;

    public KompositionsSchildkroete(String name, double geschwindigkeit, String lebensbereich, String material, double dickeInCm) {
        super(4, name, "Schildkröte", geschwindigkeit, lebensbereich);
        this.panzer = new Panzer(material, dickeInCm);
    }

    public void versteckDich() {
        System.out.println(getName() + " zieht sich in den Panzer zurück.");
        panzer.schliessen();
    }

    public void kommHeraus() {
        panzer.oeffnen();
        System.out.println(getName() + " kommt vorsichtig wieder heraus.");
    }

    public void beschreibePanzer() {
        System.out.println("Panzer von " + getName() + ": " + panzer.material + ", Dicke " + panzer.dickeInCm + " cm");
    }

    /**
     * Innere Klasse: steht in fester Teil-Ganzes-Beziehung zur Schildkröte.
     */
    private static class Panzer {
        private final String material;
        private final double dickeInCm;
        private boolean geschlossen;

        Panzer(String material, double dickeInCm) {
            this.material = material;
            this.dickeInCm = dickeInCm;
        }

        void schliessen() {
            geschlossen = true;
            System.out.println("Panzer schließt sich.");
        }

        void oeffnen() {
            geschlossen = false;
            System.out.println("Panzer öffnet sich.");
        }
    }
}
