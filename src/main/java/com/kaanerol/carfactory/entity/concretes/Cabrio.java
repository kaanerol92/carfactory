package com.kaanerol.carfactory.entity.concretes;

import com.kaanerol.carfactory.entity.abstracts.Car;

public class Cabrio implements Car {
	public final static String TYPE = "cabrio";
	
	@Override
	public String getType() {
		return TYPE;
	}

}
