package com.roberto.physicalc;

import com.roberto.physicalc.impl.EinstenImpl;
import com.roberto.physicalc.impl.JsonUtil;
import com.roberto.physicalc.model.Einsten;

import org.junit.Assert;
import org.junit.Test;

public class EinstenTest {

	private Einsten ein;	
    
	@Test
    public void testEinstenCalc(){
    	
    	double mass = 3;
    	ein = new EinstenImpl();
    	
    	Assert.assertEquals(2.6962655362104528E17, ein.getEnergy(mass), 0.001);
    }
	
    @Test
    public void testEinstenReturn(){
    	
    	double mass = 10;
    	ein = new EinstenImpl();
    	double energy = ein.getEnergy(mass);
    	   	
    	Assert.assertEquals("{\"equation\":\"e=mc2\",\"mass\":10.0,\"energy\":8.9875517873681766E17}", JsonUtil.generateJson(mass, energy));
    }
}
