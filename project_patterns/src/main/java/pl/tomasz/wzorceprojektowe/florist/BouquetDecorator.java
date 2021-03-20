package pl.tomasz.wzorceprojektowe.florist;

public class BouquetDecorator implements FlowerBouquet {
    FlowerBouquet flowerBouquet;

    public BouquetDecorator(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String addons() {
        return "nice bouquet";
    }


    @Override
    public String noAddons() {
        return "basic bouquet";
    }
}