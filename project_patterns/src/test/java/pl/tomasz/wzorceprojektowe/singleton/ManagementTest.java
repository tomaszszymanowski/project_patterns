package pl.tomasz.wzorceprojektowe.singleton;

import org.junit.jupiter.api.Test;
import pl.tomasz.wzorceprojektowe.singleton.Management;


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
