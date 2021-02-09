package org.Baseclass;

import io.cucumber.java.*;

public class Hooks extends BaseClass {
	
	@Before
	public void before1() {

		System.out.println("Before1");
	}

	@Before
	public void before2() {

		System.out.println("Before2");
	}

	
	@After
	public void after1() {

		System.out.println("After1");
		quitBrow();
	}

	@After
	public void after2() {

		System.out.println("After2");
	}

	
}
