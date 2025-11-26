public class Static {
    public static void main(String[] args) {
        // hier rufen wir die Methode auf
        // mit unterschiedlichen Parametern
        System.out.println(Static.addiere(2, 44));
        System.out.println(Static.addiere(12, 234));
        System.out.println(Static.addiere(1, 3));
    }

    // Methode zur Addition deklarieren
    // wir sagen, dass es diese Methode gibt
    public static int addiere(int zahl1, int zahl2){

        int summe = zahl1 + zahl2;

        return summe;
    }
}
