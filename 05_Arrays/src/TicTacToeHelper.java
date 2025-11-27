public class TicTacToeHelper {

    public static void gibSpielfeldAus(char[][] spielfeld, String text){
        System.out.println(text);
        for(int zeile = 0; zeile < 3; zeile++){
            for(int spalte = 0; spalte  < 3; spalte++){
                System.out.print(spielfeld[zeile][spalte] + " ");
            }
            System.out.println();
        }
    }
}
