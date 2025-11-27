import java.util.Arrays;

public class ArrayWiederholung {
    // Array enthält mehrere Elemente
    // alle Elemente müssen vom gleichen Datentyp sein
    // Arrays haben eine feste Länge, die bei der Initialiserung festgelegt werden muss
    // alle Elemente des Arrays werden bei der Initialisierung mit einem Initialwert versehen
    // z.B. bei Integern 0
    // bei Double 0.0
    // bei Booleans false
    // bei Strings null    != ""

    public static void main(String[] args) {
        // Varialbe messwert vom Typ double
        //double messwert;
        //messwert = 15.2;
        //System.out.println(messwert);

        // spezielle Syntax um ein Array zu erstellen und direkt mit
        // konkreten Werten zu füllen
        // geht nur in einem Schritt, nicht nachträglich nachdem das Array
        // schon erstellt wurde
        //       Index         0     1     2     3     4
        // aber Anzahl der Elemente ist 5
        double[] messwerte = {1.23, 2.34, 3.45, 4.56, 5.67};
        // Ausgabe des Arrays mit einem for Loop
        for(int i = 0; i < messwerte.length; i++){      // messwerte.length -> Anzahl der Elemente, nicht Index!
            System.out.println(messwerte[i]);
        }

        // Array mit Namen messwerte in dem 5 double Werte gespeichert werden können
        //double[] messwerte = new double[5];
        // [0.0, 0.0, 0.0, 0.0, 0.0]
        messwerte[2] = 7.58;    // weist den Wert 7.58 dem Array am Index 2 zu
        messwerte[4] = 12.3;    // weist den Wert 12.3 dem Array am Index 4 zu
        messwerte[1] = 23.13;

        System.out.println("Messwerte:");
        System.out.println(Arrays.toString(messwerte));

        // Ausgabe des Arrays mit einem Enhanced For / For-Each Loop
        for(double messwert : messwerte){     // für jeden messwert im Array messwertte
            System.out.println(messwert);     // gib den messwert aus
        }
        // Alternativen für die Variablen im Loop:
        for(double element : messwerte){     // für jeden messwert im Array messwertte
            System.out.println(element);     // gib den messwert aus
        }
        for(double m : messwerte){     // für jeden messwert im Array messwertte
            System.out.println(m);     // gib den messwert aus
        }


        // Tic Tac Toe
        // 3 Zeilen
        // 3 Spalten
        // (Koordinationsystem)
        // 2 dimensionales Array
        // verschachteltes Array
        // Elemente des Arrays sind wiederum Arrays
        //
        //   0   1   2
        // 0 X | 0 | 0
        // 1 0 | X | X
        // 2 0 | - | 0

        char[][] initialesSpielfeld = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'},
        };

        char[][] sabrinasSpielfeld = {
                {'x', '0', '0'},
                {'0', 'X', 'X'},
                {'0', '-', '0'},
        };

        // x ist dran und setzt
        sabrinasSpielfeld[2][1] = 'x';

        char[][] spielfeld = new char[3][3];   // 3 Zeilen mit je 3 Spalten


        TicTacToeHelper.gibSpielfeldAus(spielfeld, "spielfeld direkt nach der Initialiserung:");

        // Debug Statement
        //System.out.println(spielfeld.length);    // -> 3
        // spielfeld soll genauso aussehen wie initialiesSpielfeld
        //for(int zeile = 0; zeile < spielfeld.length; zeile++){
        //    for(int spalte = 0; spalte  < spielfeld[zeile].length; spalte++){
        //        spielfeld[zeile][spalte] = '-';
        //    }
        for(int zeile = 0; zeile < 3; zeile++){
            for(int spalte = 0; spalte  < 3; spalte++){
                spielfeld[zeile][spalte] = '-';
            }
        }

        // Ausgabe

        TicTacToeHelper.gibSpielfeldAus(spielfeld, "Ausgabe mit unserer statischen Methode:");


        // Zuweisungen der Spielzüge
        // 1. Zeile
        spielfeld[0][0] = 'x';    // Spalte 1
        spielfeld[0][1] = '0';    // Spalte 2
        spielfeld[0][2] = '0';    // Spalte 3

        // 2. Zeile
        spielfeld[1][0] = '0';
        spielfeld[1][1] = 'x';
        spielfeld[1][2] = 'x';

        // 3. Zeile
        spielfeld[2][0] = '0';
        spielfeld[2][1] = '-';
        spielfeld[2][2] = '0';







    }



}
