package junit.example_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.channels.OverlappingFileLockException;
import java.util.Collections;

public class FortuneCookieControllerTest {
    private static FortuneCookieController goodFactoryController;
    private static FortuneCookieController badFactoryController;
    @BeforeAll
    private static void setUp (){
       FortuneCookieFactory goodFactory = new FortuneCookieFactory(
               new FortuneConfig(true),
               Collections.singletonList("positive"),
               Collections.singletonList("negative")
       );

       goodFactoryController = new FortuneCookieController(goodFactory);

        FortuneCookieFactory badFactory = new FortuneCookieFactory(
                new FortuneConfig(false),
                Collections.singletonList("positive"),
                Collections.singletonList("negative")
        );

        badFactoryController = new FortuneCookieController(badFactory);
    }


    @Test
    public void shouldReturnPositiveFortune() {
        FortuneCookie cookie = goodFactoryController.tellFortune();
        Assertions.assertEquals("positive", cookie.getFortuneText());
    }

    @Test
    public void shouldReturnNegativeFortune() {
        FortuneCookie cookie =badFactoryController.tellFortune();
        Assertions.assertEquals("negative", cookie.getFortuneText());
    }
}
