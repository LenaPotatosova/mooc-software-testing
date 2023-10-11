package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.ghappy.GHappy;

public class GHappyTest {
    @ParameterizedTest(name = "string={0}, result={1}")
    @CsvSource({ "zxggxtfd, true", "ggxcv, true", "dfsgg, true", "gxdr, false", "dfvg, false", "fgdg, false" })
    public void testInput(String input, Boolean expectedResult) {
        GHappy g = new GHappy();
        boolean result = g.gHappy(input);
        Assertions.assertEquals(expectedResult, result);
    }
}
