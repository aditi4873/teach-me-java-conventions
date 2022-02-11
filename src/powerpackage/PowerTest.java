package powerpackage;

import org.junit.Test;
import org.junit.Assert.*;

public class PowerTest {
	PowerFinder obj=new PowerFinder();
    @Test
    public void onePowerOne() {
        assertEquals(obj.power(1,1),1);
    }

    @Test
    public void twoPowerOne() {
    	assertEquals(obj.power(2,1),2);
    }

    @Test
    public void twoPowerTwo() {
    	assertEquals(obj.power(2,2),4);
    }

    @Test
    public void threePowerTwo() {
    	assertEquals(obj.power(3,2),9);
    }
}

//teach-me-java-conventions/src/main/java/powerpackage