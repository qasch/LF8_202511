public class Main {
    public static void main(String[] args) {

        Hund hund = new Hund(3, "Hänsel", "Hund", 3.7, "Land");
        hund.beschreibeDichSelbst();
        hund.friss();
        hund.gibLaut();

        Hund gretl = new Hund(4, "Gretl", "Hund", 1.2, "Land");
        gretl.beschreibeDichSelbst();

        Hundeschule moeller = new Hundeschule("Möller");
        moeller.gibListeMitHundenAus();
        moeller.hundAufnehmen(hund);
        moeller.gibListeMitHundenAus();
        moeller.hundAufnehmen(gretl);
        moeller.gibListeMitHundenAus();
        moeller.hundEntlassen(hund);
        moeller.gibListeMitHundenAus();

        hund.beschreibeDichSelbst();


        /*
        // Aufruf Konstruktor mit vier Parametern

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
         */

        Schildkroete jochen = new Schildkroete(4, "Jochen", "Reptilie", 0.2, "Meer", "Knochematerial", 1.0);
        jochen.beschreibeDichSelbst();
        jochen.gibLaut();

        jochen.zieheGliedmassenEin();
        jochen.gibLaut();
        jochen.streckeGliedmassenAus();

        jochen.panzer.abwerfen();

        // immer true, da Konstante, kann nicht geändert werden
        //if(jochen.HATPANZERUNG) {
        //    System.out.println("Jochen ist gepanzert.");
        //}

    }
}
