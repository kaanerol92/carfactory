package com.kaanerol.carfactory.entity.concretes;

import com.kaanerol.carfactory.entity.abstracts.Car;

public class Hatchback implements Car {
	public final static String TYPE = "hatchback";

	@Override
	public String getType() {
		return TYPE;
	}

}
