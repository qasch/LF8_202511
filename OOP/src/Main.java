public class Main {
    public static void main(String[] args) {

        // Aufruf Konstruktor mit vier Parametern
        Tier hund = new Tier(3, "Hänsel", "Hund", 3.7);
        hund.beschreibeDichSelbst();
        hund.friss();
        hund.gibLaut("wuff wuff");

        // Aufruf Konstruktor mit vier Parametern
        Tier vogel = new Tier(2, "Berta Vogel", "Vogel", 10.2);
        vogel.beschreibeDichSelbst();
        vogel.gibLaut("piep piep");

        // Aufruf Konstruktor mit vier Parametern
        Tier fisch = new Tier(0, "Nemo", "Fisch", 0.7);
        fisch.beschreibeDichSelbst();
        fisch.gibLaut("blub blub");

        // Aufruf Standarkonstruktor
        Tier tier = new Tier();
        tier.beschreibeDichSelbst();

        // Aufruf Konstruktor mit zwei Parametern
        Tier katze = new Tier("Jumbo", "Katze");
        katze.beschreibeDichSelbst();
        katze.gibLaut("miau miau");
    }
}
