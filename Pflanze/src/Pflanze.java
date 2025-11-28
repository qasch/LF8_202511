class Pflanze {

    String art;
    double hoehe;
    String standort;
    double wasserbedarf;

    public Pflanze() {
    }

    public Pflanze(String art, String standort) {
        this.art = art;
        this.standort = standort;
        this.hoehe = 10;
        this.wasserbedarf = 1;
    }

    public Pflanze(String art, String standort, double hoehe, double wasserbedarf) {
        this.art = art;
        this.standort = standort;
        this.setHoehe(hoehe);
        this.wasserbedarf = wasserbedarf;
    }
    // Aufruf:
    // b.setHoehe(20.0); -> double hoehe
    // hoehe ist der Parameter double hoehe,
    // this.hoehe das Attribut hoehe aus Zeile 4
    //            20.0

    // Setter für das Attribut hoehe
    void setHoehe(double hoehe) {
        if(hoehe > 0.0 && hoehe < 500.0) {
            this.hoehe = hoehe;
        } else {
            System.out.println("Unzulässige Angabe");
        }
    }

    // Setter für das Attribut wasserbedarf
    void setWasserbedarf(double wasserbedarf) {
        this.wasserbedarf = wasserbedarf;
    }

    // Getter für das Attribut hoehe
    public double getHoehe() {
        return this.hoehe;
    }

    // Getter für das Attribut wasserbedarf
    public double getWasserbedarf() {
        return this.wasserbedarf;
    }

    public void wachse(double cm) {
        this.hoehe = this.hoehe + cm;
    }

    public void wachseUmEinenCm() {
        this.hoehe++;
        // this.hoehe = this.hoehe + 1.0;
    }

}

