package com.generation.utils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import com.generation.utils.Math;

public class MathTest {
	Math math = new Math();
			
	@Test
	@DisplayName ("Sumatoria de números enteros")
	void sumaTest() {
		assertEquals( 10, math.suma(8, 2), "Suma de 1 unidad");
		// assertEquals( 11, math.suma(8, 2)); dará error Unit porque el resultado debió ser 10
		assertEquals( 50, math.suma(48, 2), "Suma de decenas");
		assertEquals( 1400, math.suma(800, 600), "Suma de centenas");
		assertEquals( -7, math.suma(8, -15), "Suma de decenas");
	}
	
	@Test
	@DisplayName("Sumatoria de números de punto flotante")
	void sumaDoubleTest() {
		assertEquals(10.01, math.suma(10, 0.1), "suma de una centésima");
		assertEquals(10.02, math.suma(10, 0.2), "suma de una centésima");
	}
}
