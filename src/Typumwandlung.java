public class Typumwandlung {
    public static void main(String[] args) {
        double doubleZahl = 45.78;
        System.out.println(doubleZahl);

        int intZahl = (int) doubleZahl;   // explizites Casting
        System.out.println(intZahl);

        doubleZahl = (double) intZahl;   // explizites Casting
        System.out.println(doubleZahl);

        char text = 'c';
        intZahl = (int) text;
    }
}
