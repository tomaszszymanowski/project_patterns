package pl.tomasz.wzorceprojektowe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class DarthVaderTest {

    @Test
    public void checkIsSame(){
        //when
        DarthVader Darth_Vader = DarthVader.getInstance();
        DarthVader Darth_Vader1 = DarthVader.getInstance();

        //then
        assertSame(Darth_Vader, Darth_Vader1);
    }
}
