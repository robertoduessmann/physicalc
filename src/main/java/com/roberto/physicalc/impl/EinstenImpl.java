package com.roberto.physicalc.impl;

import com.roberto.physicalc.model.Einsten;

public class EinstenImpl implements Einsten {
	
	public double getEnergy(double mass){
		double energy = mass * Math.pow(Einsten.speedLight, 2);
		return energy;
	}
	
}
