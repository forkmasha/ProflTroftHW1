import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HashTagTest {

    @Test
    public void getTop5() {
        String[] lines = {
                "#java is a #programming language",
                "#java is #platform independent",
                "#java is #simple",
                "#java is #robust",
                "#java is #secure",
                "#java is #architecture neutral",
                "#java is #object-oriented",
                "#java is #interpreted",
                "#java is #high-performance",
                "#java is #distributed",
                "#java is #dynamic",
                "#java is #multithreaded",
                "#java is #multithreaded",
                "#java is #multithreaded",
                "#java is #multithreaded"
        };

        String[] expected = {"#java 15", "#multithreaded 4", "#robust 1", "#distributed 1", "#dynamic 1"};

        assertArrayEquals(expected, HashTag.getTop5(lines));
    }
    }
