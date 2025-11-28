/**
 * Startklasse, um abstrakte Klasse und deren konkrete Umsetzung zu zeigen.
 */
public class AbstraktDemo {
    public static void main(String[] args) {
        AbstraktesTier hund = new HundAbstrakt("Bella");
        hund.beschreibe();
        hund.gibLaut();
    }
}
