import java.util.Scanner;

public class ZahlenSortieren {
    /*
    Schreibe ein Programm, das drei Zahlen einliest
    und diese in aufsteigender Reihenfolge ausgibt.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte die erste von drei Zahlen eingeben: ");
        int zahl1 = sc.nextInt();
        System.out.println("Bitte die zweite von drei Zahlen eingeben: ");
        int zahl2 = sc.nextInt();
        System.out.println("Bitte die dritte von drei Zahlen eingeben: ");
        int zahl3 = sc.nextInt();

        sc.close();

        // zahl1 mit zahl2 vergleichen
        if(zahl1 > zahl2){
            // grössere speichern zwischen
            int temp = zahl1;
            // zahl1 wird kleinere zahl
            zahl1 = zahl2;
            // zahl2 wird grössere
            zahl2 = temp;
        }
        if(zahl2 > zahl3){
            // grössere speichern zwischen
            int temp = zahl2;
            // zahl1 wird kleinere zahl
            zahl2 = zahl3;
            // zahl2 wird grössere
            zahl3 = temp;
        }
        if(zahl1 > zahl2){
            // grössere speichern zwischen
            int temp = zahl1;
            // zahl1 wird kleinere zahl
            zahl1 = zahl2;
            // zahl2 wird grössere
            zahl2 = temp;
        }

    System.out.println("Aufsteigende Reihenfolge: " + zahl1 + ", " + zahl2 + ", ");
    }
}
