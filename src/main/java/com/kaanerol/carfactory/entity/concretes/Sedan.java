package com.kaanerol.carfactory.entity.concretes;

import com.kaanerol.carfactory.entity.abstracts.Car;

public class Sedan implements Car {
	public final static String TYPE = "sedan";

	@Override
	public String getType() {
		return TYPE;
	}

}
