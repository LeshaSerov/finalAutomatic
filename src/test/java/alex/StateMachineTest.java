package alex;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StateMachineTest {

    @org.junit.Test
    public void check1() {
        assertFalse(StateMachine.check("sdbbanm"));
    }

    @org.junit.Test
    public void check2() {
        assertFalse(StateMachine.check(""));
    }

    @org.junit.Test
    public void check3() {
        assertTrue(StateMachine.check("bbm"));
    }

    @org.junit.Test
    public void check4() {
        assertTrue(StateMachine.check("ccbbmmmm"));
    }

    @org.junit.Test
    public void check5() {
        assertTrue(StateMachine.check("cdcdcbbbbaaaaaaannnnnm"));
    }

    @org.junit.Test
    public void check6() {
        assertTrue(StateMachine.check("ccdbbm"));
    }

}