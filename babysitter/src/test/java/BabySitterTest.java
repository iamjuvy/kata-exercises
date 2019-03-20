import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BabySitterTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @Test
    public void computeFamilyA(String startTime, String endTime){
        BabySitter bSitter = new BabySitter();
        assertEquals(30, bSitter.computeFamilyA("10", "1"));
    }


}