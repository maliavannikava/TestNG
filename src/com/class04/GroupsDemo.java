package com.class04;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupsDemo {
	
	@BeforeClass (alwaysRun=true)
	public void beforeCless() {
		
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test (groups="smoke")
	public void test12() {
		System.out.println("test2");
	}
	
	@Test (groups= {"regression"})
	public void test3() {
		System.out.println("test3");
	}
	
	@Test (groups= {"smoke", "regression"})
	public void test4() {
		System.out.println("test4");
	}
}
