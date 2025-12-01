public class Hund extends Tier {

    public Hund(int anzahlBeine, String name, String art, double geschwindigkeit, String lebensbereich){
       super(anzahlBeine, name, art, geschwindigkeit, lebensbereich);
    }

    // Deklarierung    - "es gibt etwas" (Variablen, Funktionen/Methoden)
    // Implementierung - "Verhalten beschreiben" (Funktion/Methoden-Rumpf)
    // Initialisierung - Variablen einen Wert zuweisen (explizit/implizit)
    // Instanziierung  - Erzeugung von Objekten/Instanzen aus einer Klasse

    @Override
    public void gibLaut(){
        System.out.println("Wuff Wuff");
    }

}
