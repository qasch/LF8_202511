public class Main {
    public static void main(String[] args) {

        // Aufruf Konstruktor mit vier Parametern
        Tier hund = new Tier(3, "Hänsel", "Hund", 3.7, "Land");
        hund.beschreibeDichSelbst();
        hund.friss();
        hund.gibLaut("wuff wuff");
        System.out.println(hund.istLandtier());

        // Aufruf Konstruktor mit vier Parametern
        Tier vogel = new Tier(2, "Berta Vogel", "Vogel", 10.2, "Luft");
        vogel.beschreibeDichSelbst();
        vogel.gibLaut("piep piep");
        System.out.println(vogel.istLandtier());

        // Aufruf Konstruktor mit vier Parametern
        Tier fisch = new Tier(0, "Nemo", "Fisch", 0.7, "Wasser");
        fisch.beschreibeDichSelbst();
        fisch.gibLaut("blub blub");

        // Aufruf Standarkonstruktor
        Tier tier = new Tier();
        tier.beschreibeDichSelbst();

        // Aufruf Konstruktor mit zwei Parametern
        Tier katze = new Tier("Jumbo", "Katze");
        // katze.anzahlBeine = 4;
        katze.beschreibeDichSelbst();
        // katze.anzahlBeine = 6;
        katze.beschreibeDichSelbst();
        // Jumbo hat nen Unfall
        // und knabbert sich selbst ein Bein ab
        katze.setAnzahlBeine(3);
        katze.beschreibeDichSelbst();

        katze.gibLaut("miau miau");

    }
}
