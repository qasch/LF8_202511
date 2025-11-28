/**
 * Demonstriert Aggregation: Tiere werden der Station nur zeitweise zugeordnet.
 */
public class AggregationDemo {
    public static void main(String[] args) {
        Tier hund = new Tier(4, "Lotte", "Hund", 5.0, "Land");
        Tier katze = new Tier("Minka", "Katze");

        TierPflegeStation station = new TierPflegeStation("Happy Paws");
        station.nehmeAuf(hund);
        station.nehmeAuf(katze);
        station.druckeListe();

        station.entlasse(katze); // Katze verlässt die Station, existiert aber weiter
        station.druckeListe();
    }
}
