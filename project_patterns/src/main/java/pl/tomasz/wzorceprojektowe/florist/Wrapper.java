package pl.tomasz.wzorceprojektowe.florist;

public class Wrapper extends BouquetDecorator {

    public Wrapper(FlowerBouquet flowerBouquet) {
        super(flowerBouquet);
    }

    public String addons(){
        return super.addons() + addonsWrapper();
    }

    private String addonsWrapper() {
        return " with wrapper";
    }


}
