package com.kaanerol.carfactory.service.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaanerol.carfactory.entity.concretes.Cabrio;
import com.kaanerol.carfactory.entity.concretes.Hatchback;
import com.kaanerol.carfactory.entity.concretes.Sedan;
import com.kaanerol.carfactory.exception.TypeNotFoundException;
import com.kaanerol.carfactory.service.abstracts.CarService;

@Service
public class CarManager implements CarService {

	@Autowired
	Cabrio cabrio;

	@Autowired
	Sedan sedan;

	@Autowired
	Hatchback hatchback;

	@Override
	public String getType(String type) {

		switch (type.toLowerCase()) {
		case Cabrio.TYPE:
			return getReturnMessage(cabrio.getType());
		case Hatchback.TYPE:
			return getReturnMessage(hatchback.getType());
		case Sedan.TYPE:
			return getReturnMessage(sedan.getType());
		default:
			throw new TypeNotFoundException("Car not found with given type : " + type);
		}

	}

	private String getReturnMessage(String type) {
		return type + " car has produced";
	}
}
