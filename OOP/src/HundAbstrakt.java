public class HundAbstrakt extends AbstraktesTier {

    public HundAbstrakt(String name) {
        super(name);
    }

    @Override
    public void gibLaut() {
        System.out.println(getName() + ": wuff wuff");
    }
}
