package pl.tomasz.wzorceprojektowe.singleton;

import org.junit.jupiter.api.Test;
import pl.tomasz.wzorceprojektowe.singleton.CastleInMalbork;

import static org.junit.jupiter.api.Assertions.assertSame;

public class CastleInMalborkTest {

    @Test
    public void checkIsSame(){
        // when
        CastleInMalbork malbork1 = CastleInMalbork.getInstance();
        CastleInMalbork malbork2 = CastleInMalbork.getInstance();

        //then
        assertSame(malbork1,malbork2);

    }

}
