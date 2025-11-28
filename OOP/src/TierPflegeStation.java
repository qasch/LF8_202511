import java.util.ArrayList;
import java.util.List;

/**
 * Aggregation: Die Station "besitzt" Tiere nicht dauerhaft, sie verwaltet eine Sammlung,
 * die von außen übergeben wird. Tiere können auch ohne Station weiterexistieren.
 */
public class TierPflegeStation {

    private final String name;
    private final List<Tier> aufgenommeneTiere = new ArrayList<>();

    public TierPflegeStation(String name) {
        this.name = name;
    }

    public void nehmeAuf(Tier tier) {
        aufgenommeneTiere.add(tier);
    }

    public void entlasse(Tier tier) {
        aufgenommeneTiere.remove(tier);
    }

    public void druckeListe() {
        System.out.println("Tiere in der Station \"" + name + "\":");
        for (Tier tier : aufgenommeneTiere) {
            System.out.println("- " + tier.getName() + " (" + tier.getArt() + ")");
        }
    }
}
