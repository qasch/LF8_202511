/**
 * Startklasse für die Komposition: Der Panzer entsteht nur gemeinsam mit der Schildkröte.
 */
public class KompositionDemo {
    public static void main(String[] args) {
        KompositionsSchildkroete karl = new KompositionsSchildkroete("Karl", 0.3, "Land", "Hornplatten", 2.5);
        karl.beschreibeDichSelbst();
        karl.beschreibePanzer();
        karl.versteckDich();
        karl.kommHeraus();
    }
}
