package pl.tomasz.wzorceprojektowe.christmastree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChristmasTreeTest {

    @Test
    public void christmasTreeWithGarland() {
        //given
        ChristmasTreeImpl christmasTreeImpl = new ChristmasTreeImpl();

        //when
        ChristmasTree tree = new Garland(christmasTreeImpl);

        //then
        assertEquals(tree.decorate(),
                "Christmas tree with Garland");
    }

    @Test
    public void christmasTreeWithGarlanddWithGalrandWithBubbleLigths() {
        //when
        ChristmasTree tree = new BubbleLights(
                new Garland(new Garland(new ChristmasTreeImpl())));

        //then
        assertEquals(tree.decorate(),
                "Christmas tree with Garland with Garland with Bubble Lights");

    }
}
