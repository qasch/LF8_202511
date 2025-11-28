public class Main {
    public static void main(String[] args) {
        Pflanze sonnenblume = new Pflanze();

        System.out.println(sonnenblume.hoehe);
        sonnenblume.wachse(2.0);
        System.out.println(sonnenblume.hoehe);
        sonnenblume.setHoehe(-100.0);
        System.out.println(sonnenblume.hoehe);
        System.out.println(sonnenblume.standort);

        Pflanze geranie = new Pflanze("Zimmerplanze", "Wohnzimmer", 2000.0, -1.0);
        System.out.println(geranie.standort);
        System.out.println(geranie.hoehe);
        System.out.println(geranie.wasserbedarf);
    }
}
