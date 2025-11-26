public class Sternenmuster {
    public static void main(String[] args) {
        // Ausgabe mehrere Zeilen
        // Ausgabe mehrerer Sternchen pro Zeile
        // (hängt die Anzahl der Sternchen von der Zeile ab?)
        // > verschachtelte Schleifen verwenden
        for (int i = 1; i <= 5; i++) {       // 5 Zeilen
            for (int j = 1; j <= i * 2 - 1; j++) {   // 5 Spalten/Sternchen pro Zeile
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
