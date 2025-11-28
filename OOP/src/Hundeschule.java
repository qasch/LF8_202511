import java.util.ArrayList;

public class Hundeschule {
    String name;
    ArrayList<Hund> aufgenommeneHunde = new ArrayList<>();

    public Hundeschule(String name){
        this.name = name;
    }

    public void hundAufnehmen(Hund hund){
        aufgenommeneHunde.add(hund);
    }

    public void hundEntlassen(Hund hund){
        aufgenommeneHunde.remove(hund);
    }

    public void gibListeMitHundenAus(){
        System.out.println("List mit Hunden in der Hundeschule:");
        for(Hund hund : aufgenommeneHunde){
            System.out.println(hund.getName());
        }
    }
}
