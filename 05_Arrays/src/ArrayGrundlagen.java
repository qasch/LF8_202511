public class ArrayGrundlagen {
    public static void main(String[] args) {
       // Array von Integern
        int[] ganzeZahlen;   // Deklaration eines Arrays von Integern
        ganzeZahlen = new int[5];  // Initialisierung: Platz für 5 Werte
        // int[] ganzeZahlen = new int[5];   // in einem Schritt
        //int[] ganzeZahlen = {2134, 3, 23, 5, 78888};   // Deklaration und Initialisierung mit konkreten Werten (muss in einem Rutsch geschehen)

        System.out.println("Wert am Index 0: " + ganzeZahlen[0]);    // Anzeige des ersten Elements (Index 0)
        System.out.println("Wert am Index 1: " + ganzeZahlen[1]);    // Anzeige des ersten Elements (Index 1)
        System.out.println("Wert am Index 2: " + ganzeZahlen[2]);    // Anzeige des ersten Elements (Index 2)
        System.out.println();

        ganzeZahlen[0] = 23;
        System.out.println("Wert am Index 0: " + ganzeZahlen[0]);    // Anzeige des ersten Elements (Index 0)
        System.out.println("Wert am Index 1: " + ganzeZahlen[1]);    // Anzeige des ersten Elements (Index 1)
        ganzeZahlen[2] = 42;
        System.out.println("Wert am Index 2: " + ganzeZahlen[2]);    // Anzeige des ersten Elements (Index 0)
        System.out.println();

        //System.out.println("Wert am Index 8: " + ganzeZahlen[8]);    // Anzeige des ersten Elements (Index 0)
        System.out.println();

        // Array of Strings
        String[] texte = {"das", "hier", "sind", "alles", "elemente", "unseres", "String", "Arrays"};


        //for(int i = 0; i <= 7; i++){
        //    System.out.println(texte[i]);
        //}

        ////System.out.println("Länge bzw. Anzahl der Elemente unseres Arrays: " + texte.length);
        //// Nutzung des Attributs length der Klasse Array
        //for(int i = 0; i < texte.length; i++){
        //    System.out.println(texte[i]);
        //}

        // enhanced for loop -> for each loop
        System.out.println("Ausgabe über Enhances For Loop / For Each Loop:");
        for(String element : texte){
            System.out.println(element);
        }


    }
}
