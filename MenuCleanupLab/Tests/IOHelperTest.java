import org.junit.Test;

import static org.junit.Assert.*;

public class IOHelperTest {

    @Test
    public void isValidYorN__Pass_Y__Returns_True() {
        assertTrue(IOHelper.isValidYorN("Y"));
    }

    @Test
    public void isValidYorN__Pass_N__Returns_True() {
        assertTrue(IOHelper.isValidYorN("N"));
    }

    @Test
    public void isValidYorN__Pass_x__Returns_False() {
        assertFalse(IOHelper.isValidYorN("x"));
    }

    @Test
    public void isValidYorN__Pass_empty__Returns_False() {
        assertFalse(IOHelper.isValidYorN(""));
    }

    @Test
    public void isValidYorN__Pass_blank__Returns_False() {
        assertFalse(IOHelper.isValidYorN("  "));
    }

    @Test
    public void isValidYorN__Pass_null__Returns_False() {
        assertFalse(IOHelper.isValidYorN(null));
    }


    // TODO 01 - Write a test to ensure that "123" is considered valid
    @Test
    public void tryParseInt__Pass_Pos_Int_Str__Returns_Int() {
        assertEquals((Integer) 123, IOHelper.tryParseInt("123"));
    }

    // TODO 02 - Write a test to ensure "-123" is considered valid
    @Test
    public void tryParseInt__Pass_Neg_Int_Str__Returns_Int() {
        assertEquals((Integer) (-123), IOHelper.tryParseInt("-123"));
    }

    @Test
    // TODO 03 - Write a test to ensure "0" is considered valid
    public void tryParseInt__Pass_Zero_Str__Returns_Int() {
        assertEquals((Integer) 0, IOHelper.tryParseInt("0"));
    }

    @Test
    // TODO 04 - Write a test to ensure "abc" is considered invalid
    public void tryParseInt__Pass_Non_Int_Str__Returns_Null() {
        assertNull(IOHelper.tryParseInt("abc"));
    }

    // TODO 05 - Write a test to ensure null is considered invalid
    @Test
    public void tryParseInt__Pass_Null__Returns_Null() {
        assertNull(IOHelper.tryParseInt(null));
    }

    // TODO 06 - Write a test to ensure empty string "" is considered invalid
    @Test
    public void tryParseInt__Pass_Empty_String__Returns_Null() {
        assertNull(IOHelper.tryParseInt(""));
    }

    // TODO 07 - Write a test to ensure blank string "  " is considered invalid
    @Test
    public void tryParseInt__Pass_Blank_String__Returns_Null() {
        assertNull(IOHelper.tryParseInt("   "));
    }
}
