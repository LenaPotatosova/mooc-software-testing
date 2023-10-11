package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.caesarshift.CaesarShiftCipher;

public class CaesarShiftCipherTest {
    @ParameterizedTest(name = "message={0}, shift={1}, result={2}")
    @CsvSource({ "abc, 3, def", "z, 1, a", "a b, 1, b c", "!, 3, invalid", "a, -1, z"})
    public void testInput(String message, int shift, String expectedResult) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }

}
