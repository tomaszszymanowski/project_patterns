package pl.tomasz.wzorceprojektowe.florist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerBouquetTest {

    @Test
    public void isBasicBouquet(){

        //when
        FlowerBouquet bouquet = new FlowerBouquetImpl();

        //then
        assertEquals(bouquet.noAddons(),"basic bouquet");
    }

    @Test
    public void isBouquetWithWrapper(){
        //given
        FlowerBouquetImpl flowerBouquetImpl = new FlowerBouquetImpl();

        //when
        FlowerBouquet flowerBouquet = new Wrapper(flowerBouquetImpl);

        //then
        assertEquals(flowerBouquet.addons(), "nice bouquet with wrapper");
    }

}
