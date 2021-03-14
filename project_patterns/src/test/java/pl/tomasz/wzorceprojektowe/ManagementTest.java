package pl.tomasz.wzorceprojektowe;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertSame;

public class ManagementTest {

    @Test
    public void checkIsSame(){
        // when
        Management management1 = Management.getInstance();
        Management management2 = Management.getInstance();


        //then
        assertSame(management1, management2);
    }
}
