/**
 * Abstrakte Basisklasse: kann nicht direkt instanziert werden,
 * erzwingt aber gemeinsame Schnittstelle und Verhalten.
 */
public abstract class AbstraktesTier {

    private final String name;

    protected AbstraktesTier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
        * Muss von jeder konkreten Unterklasse implementiert werden.
        */
    public abstract void gibLaut();

    public void beschreibe() {
        System.out.println("Ich bin " + name + " und ein " + getClass().getSimpleName());
    }
}
