public class Benutzerinformation {
    public static void main(String[] args) {
        // Zeichenkette
        String name = "* G r e t l *";  // Leer- und Sonderzeichen sind erlaubt
        // Ganze Zahl
        int alter = 12;
        // Gleitkommazahl
        double groesse = 0.32;   // Punkt ist das Dezimaltrennzeichen, nicht das Komma
        // Wahrheitswert
        boolean schueler = false;

        // Ausgabe auf der Konsole
        System.out.print(name + "\n");  // name ist ein String
        System.out.println(alter);      // implizites Casting von int zu String
        System.out.println(
                // wir können unsere Ausgabe auch hier schon formatieren
                // in Java sind Zeilenumbrüche mehr oder weniger egal,
                // anders als in Python
                "Größe:\t\t" + groesse + "m" + "" +     // + ist der Konkatenationsoperator, der zwei Strings aneinanderklebt
                "\nSchüler:\t" + schueler               // \n macht einen Zeilenumbruch, \t ein Tab
        );  // erst hier wird unsere Zeile durch ein Semikolon beendet
    }
}
