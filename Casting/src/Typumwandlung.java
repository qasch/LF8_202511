public class Typumwandlung {
    public static void main(String[] args) {
        double doubleZahl = 45.78;
        System.out.println(doubleZahl);

        int intZahl = (int) doubleZahl;   // explizites Casting
        System.out.println(intZahl);

        doubleZahl = intZahl;   // implizites Casting
        System.out.println(doubleZahl);

        char text = 'c';
        intZahl = text;   // implizites Casting


       // Datentyp byte
       // 1 Byte -> 8 Bit
       // 0 bis 255
       // -128 bis 127
       byte kleineZahl = 127;
        System.out.println(kleineZahl);
        // kleineZahl = kleineZahl + 1
        // kleineZahl = 127        + 1   -> 128
        kleineZahl++;
        System.out.println(kleineZahl);
        kleineZahl++;
        System.out.println(kleineZahl);




    }
}
