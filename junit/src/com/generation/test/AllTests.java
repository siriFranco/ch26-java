package com.generation.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import com.generation.utils.MathTest;

@Suite
@SelectClasses( { MathTest.class /*, OtraClase.class */ } )

public class AllTests {

}
