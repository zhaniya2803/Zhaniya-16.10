package junit.example_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.channels.OverlappingFileLockException;
import java.util.Collections;

public class FortuneCookieFactoryTest {


    private static FortuneCookieFactory cookieFactory;
    @BeforeEach
    public void beforeEach(){
        cookieFactory = new FortuneCookieFactory(
                new FortuneConfig(true),
                Collections.singletonList("positive"),
                Collections.singletonList("negative")
        );

    }

    @Test
     void shouldIncrementCountByOneAfterOneCookieBaked (){
        cookieFactory.bakeFortuneCookie();
         Assertions.assertEquals(1, cookieFactory.getCookiesBaked());
     }

     @Test
     void shouldIncrementCountByTwoAfterTwoCookiesBaked (){
         cookieFactory.bakeFortuneCookie();
         cookieFactory.bakeFortuneCookie();
         Assertions.assertEquals(2, cookieFactory.getCookiesBaked());
     }

     @Test
     void shouldSetCounterToZeroAfterResetCookieCreatedCall (){
         cookieFactory.bakeFortuneCookie();
         cookieFactory.bakeFortuneCookie();
        cookieFactory.resetCookiesCreated();
         Assertions.assertEquals(0, cookieFactory.getCookiesBaked());
     }


}
