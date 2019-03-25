import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BabySitterTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @Test
    public void testValidTimeFormat(){
        BabySitter bSitter = new BabySitter();
        assertTrue(bSitter.validTimeFormat("1"));
        assertTrue(bSitter.validTimeFormat("10"));
        assertTrue(bSitter.validTimeFormat("1:30"));
        assertTrue(bSitter.validTimeFormat("10:30"));
        assertFalse(bSitter.validTimeFormat("130"));
        assertFalse(bSitter.validTimeFormat("13:30"));
        assertFalse(bSitter.validTimeFormat("11:60"));
        assertFalse(bSitter.validTimeFormat("abc"));
        assertFalse(bSitter.validTimeFormat("ab:cd"));
    }

    @Test
    public void testComputeFamilyA(){
        BabySitter bSitter = new BabySitter();
        assertEquals(30, bSitter.computeFamilyA("10", "1"));
    }


}