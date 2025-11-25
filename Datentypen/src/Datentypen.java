public class Datentypen {
    /*
    Das hier ist ein mehrzeiliger Kommentar
    alle Zeilen bis zum schliessenden Sternchen-Slash sind
    Kommentare
     */
    static void main(String[] args) {
        System.out.println("Wir verschaffen uns einen Überblick über die verschiedenen Datentypen in Java");
        // das hier ist ein einzeiliger Kommentar

        // Integer - ganze Zahl
        // Erstellen/Bekanntmachen/Deklarieren der Varriablen
        // es gibt jetzt eine Variable mit Namen zahl, welche Integer aufnehmen kann
        int zahl;
        // geht noch nicht, hier gibt es die Varialbe nur, sie enthält aber noch keinen Wert
        //System.out.println(zahl);

        // Initialisierung/Wertzuweisung: der Variablen zahl wird der Wert 213 zugewiesen
        zahl = 213;
        // jetzt können wir uns den Wert der Variablen ausgeben lassen:
        System.out.println(zahl);
        System.out.println("Der Inhalt der Variablen zahl ist " + zahl + " (eine ganze Zahl)");   // + -> Konkatenationsoperator

        // Deklaration und Initialiserung in einem Schritt:
        double gleitKommaZahlDouble = 2.4;
        float gleitKommaZahlFloat = 3.14f;

        System.out.println(gleitKommaZahlDouble);

        // Wahrheitswert: True / False
        boolean jaNein = true;
        jaNein = false;

        // einzelne Buchstaben bzw. Zeichen (Character) müssen in einfache Hochkommata eingefasst werden
        // im Gegensatz zu Strings, die in doppelten stehen müssen
        char einzelnesZeichen = 'a';

        String zeichenkette = "Ich bin eine Zeichenkette";
        System.out.println(zeichenkette);

        System.out.println(zeichenkette.toUpperCase());


    }
}
