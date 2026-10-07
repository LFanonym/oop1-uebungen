import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class BracketCheckerTest {

    @Test
    void testValidInput() {

        boolean result = new BracketChecker().validate("(<[()]>){}");
        assertTrue(result);
    }


    @ParameterizedTest
    @ValueSource(strings = {"(<[()]>){}", "()[]{}<>", "(((<>)))([<>])"})
    void testValidInputs(String input) {
        boolean result = new BracketChecker().validate(input);

        assertTrue(result);
    }


    @Test
    void testInvalidInput() {
        boolean result = new BracketChecker().validate("<<<(<[()]>){}");

        assertFalse(result);
    }
}
