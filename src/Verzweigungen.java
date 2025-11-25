import java.util.Scanner;     // Scanner Klasse importieren

public class Verzweigungen {
    public static void main(String[] args) {

        // Deklaration der Variablen zahl1 und zahl2 (ohne Initialisierung/Wertzuweisung)
        //int zahl1;
        //int zahl2;

        Scanner input = new Scanner(System.in);     // Erzeugung eines Objekts der Klasse Scanner
        System.out.println("Bitte einen Wert für Zahl1 eingeben:");
        // Deklaration und Initialisierung kann auch hier erfolgen
        int zahl1 = input.nextInt();
        System.out.println("Zahl1: " + zahl1);
        System.out.println("Bitte einen Wert für Zahl2 eingeben:");
        // Deklaration und Initialisierung kann auch hier erfolgen
        int zahl2 = input.nextInt();
        System.out.println("Zahl2: " + zahl2);

        input.close();     // Scanner schliessen um Resourcen freizugeben

        if (zahl1 > zahl2) { //false
            System.out.println("Zahl1 ist größer als Zahl2");
        } else if(zahl1 < zahl2) {
            System.out.println("Zahl1 ist kleiner als Zahl2");
        } else {
            System.out.println("Zahl1 und Zahl2 sind gleich groß");
        }
        System.out.println("nach dem if");
    }
}
