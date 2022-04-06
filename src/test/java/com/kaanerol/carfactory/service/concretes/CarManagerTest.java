package com.kaanerol.carfactory.service.concretes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.kaanerol.carfactory.entity.concretes.Cabrio;
import com.kaanerol.carfactory.entity.concretes.Hatchback;
import com.kaanerol.carfactory.entity.concretes.Sedan;
import com.kaanerol.carfactory.exception.TypeNotFoundException;

@ExtendWith(MockitoExtension.class)
class CarManagerTest {

	@InjectMocks
	private CarManager carManager;

	@Mock
	private Cabrio cabrio;

	@Mock
	private Sedan sedan;

	@Mock
	private Hatchback hatchback;

	@Test
	void whenCabrioInputThenSuccess() {
		String input = Cabrio.TYPE;
		when(cabrio.getType()).thenReturn(Cabrio.TYPE);
		String result = carManager.getType(input);
		assertEquals(result, input + " car has produced");
	}

	@Test
	void whenSedanInputThenSuccess() {
		String input = "sedan";
		when(sedan.getType()).thenReturn(Sedan.TYPE);
		String result = carManager.getType(input);
		assertEquals(result, input + " car has produced");
	}

	@Test
	void whenHatchbackInputThenSuccess() {
		String input = "hatchback";
		when(hatchback.getType()).thenReturn(Hatchback.TYPE);
		String result = carManager.getType(input);
		assertEquals(result, input + " car has produced");
	}

	@Test
	void whenUnknownInputThenError() {
		String input = "unknown";
		assertThrowsExactly(TypeNotFoundException.class, () -> carManager.getType(input));

	}

}
