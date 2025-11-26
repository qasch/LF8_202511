import java.util.Arrays;
public class ArrayGrundlagen {
    public static void main(String[] args) {

        // Arrays können nur einen einzigen Datentyp aufnehmen
        // hier: Integer
        int[] ganzeZahlen;   // Deklaration eines Arrays von Integern - es gibt das Array
        ganzeZahlen = new int[5];  // Initialisierung: Platz für 5 Werte (werden mit Initialwerten versehen)
        // Deklaration und Initialisierung in einem Schritt:
        // int[] ganzeZahlen = new int[5];
        // Deklaration und Initialisierung mit konkreten Werten (muss in einem Schritt geschehen):
        //int[] ganzeZahlen = {2134, 3, 23, 5, 78888};

        System.out.println("Ausgabe der initialen Werte des Arrays:");
        System.out.println("Wert am Index 0: " + ganzeZahlen[0]);    // Anzeige des ersten Elements (Index 0)
        System.out.println("Wert am Index 1: " + ganzeZahlen[1]);    // Anzeige des ersten Elements (Index 1)
        System.out.println("Wert am Index 2: " + ganzeZahlen[2]);    // Anzeige des ersten Elements (Index 2)
        System.out.println();

        System.out.println("Wert am Index 0 auf 23 setzen:");
        ganzeZahlen[0] = 23;
        System.out.println("Wert am Index 0: " + ganzeZahlen[0]);    // Anzeige des ersten Elements (Index 0)
        System.out.println("Wert am Index 1: " + ganzeZahlen[1]);    // Anzeige des ersten Elements (Index 1)
        System.out.println("Wert am Index 2 auf 42 setzen:");
        ganzeZahlen[2] = 42;
        System.out.println("Wert am Index 2: " + ganzeZahlen[2]);    // Anzeige des ersten Elements (Index 0)
        System.out.println();

        // Versuch, auf einen Index zuzugreifen, den es nicht gibt
        // führt zu einer ArrayIndexOutOfBound Exception
        //System.out.println("Wert am Index 8: " + ganzeZahlen[8]);    // Anzeige des ersten Elements (Index 0)

        // Array of Strings
        String[] texte = {"das", "hier", "sind", "alles", "elemente", "unseres", "String", "Arrays"};


        System.out.println("Ausgabe aller Element des Arrays mit for Loop und selbst 'gezähltem' Index:");
        for(int i = 0; i <= 7; i++){
            System.out.println(texte[i]);
        }

        // Arrays sind Klassen, haben also Attribute und Methoden die wir nutzen können
        // Die Länge eines Arrays kann über das Attribut length ausgegeben werden:
        System.out.println("\nLänge bzw. Anzahl der Elemente unseres Arrays: " + texte.length);
        // Nutzung des Attributs length der Klasse Array
        System.out.println("Ausgabe aller Elemente mit Hilfe des Attributs length:");
        for(int i = 0; i < texte.length; i++){
            System.out.println(texte[i]);
        }

        // enhanced for loop -> for each loop
        // Der Enhances For Loop ist speziell dafür gedacht, über alle Elemente
        // eines Arrays bzw. ähnlicher Datenstruktur zu iterieren:
        System.out.println("\nAusgabe über Enhances For Loop / For Each Loop:");
        for(String element : texte){
            System.out.println(element);
        }


        // Die String Repräsentation eines Arrays kann mit der Methode toString()
        // der Klasse Arrays ausgegeben werden
        // dazu muss java.util.Arrays importiert werden
        System.out.println();
        System.out.println(Arrays.toString(texte));     // Python ___str()___

    }
}
