public class Notenbewertung {
    public static void main(String[] args) {
        int schulnote = 2;      // = Zuweisungsoperator (einfaches Gleicheitszeichen)

        //if(schulnote == 1){     // == Vergleichsoperator (doppeltes Gleichheitszeichen)
        //    System.out.println("sehr gut");
        //} else if (schulnote == 2) {
        //    System.out.println("gut");
        //} else if (schulnote == 3) {
        //    System.out.println("befriedigend");
        //} else if (schulnote == 4) {
        //    System.out.println("ausreichend");
        //} else if (schulnote == 5) {
        //    System.out.println("mangelhaft");
        //} else if (schulnote == 6) {
        //    System.out.println("ungenügend");
        //} else {
        //    System.out.println("Ungültige Eingabe");
        //}

        // switch-case Statement als Alternative
        // zu if else Verzweigungen
        switch(schulnote){
            case 1:
                System.out.println("sehr gut");
                break;
            case 2:
                System.out.println("gut");
                break;
            case 3:
                System.out.println("befriedigend");
                break;
            case 4:
                System.out.println("ausreichend");
                break;
            case 5:
                System.out.println("mangelhaft");
                break;
            case 6:
                System.out.println("ungenügend");
                break;
            default:
                System.out.println("Ungültige Eingabe");
        }




    }
}



