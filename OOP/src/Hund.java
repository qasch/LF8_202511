public class Hund extends Tier {

    public Hund(int anzahlBeine, String name, String art, double geschwindigkeit, String lebensbereich){
       super(anzahlBeine, name, art, geschwindigkeit, lebensbereich);
    }

    @Override
    public void gibLaut(){
        System.out.println("Wuff Wuff");
    }

}
