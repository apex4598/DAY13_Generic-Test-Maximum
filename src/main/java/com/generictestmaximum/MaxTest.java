package main.java.com.generictestmaximum;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
	
    @Test
    public void maxFloatTest() {
    	Float actualValue = com.generictestmaximum.MaxFloat.FindMaxNumber(10f,54f,75f);
        Assert.assertEquals(1000,actualValue,0);
    }

	    @Test
	    public void maxIntTest() {
	    	Integer actualValue = com.generictestmaximum.MaxInteger.FindMaxNumber(10,54,75);
	        Assert.assertEquals(15,actualValue,0);
	    }

	    @Test
	    public void maxStringTest() {
	    	String actualValue = com.generictestmaximum.MaxString.FindMaxString("Abc","Abcd" , "Abcde");
	        Assert.assertEquals("Abc",actualValue,0);
	
}
}
