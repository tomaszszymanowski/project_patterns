package pl.tomasz.wzorceprojektowe.florist;

public class FlowerBouquetImpl implements FlowerBouquet{


    @Override
    public String addons() {
        return "nice bouquet ";
    }

    @Override
    public String noAddons() {
        return "basic bouquet";
    }

}
