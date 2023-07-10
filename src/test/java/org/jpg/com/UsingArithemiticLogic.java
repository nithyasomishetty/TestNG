package org.jpg.com;

import org.com.BaseClass;
import org.testng.annotations.*;

public class UsingArithemiticLogic{
	@Parameters({"f","x"})
	@Test(groups="atithemrtic operation")
	public void additingMethod(int a, int b) {
		int c=a+b;
		System.out.println("add of c is "+ c);
		
	}
	@Parameters({"a","b"})
	@Test(groups="atithemrtic operation")
	public void subMethod(int a, int b) {
		int c=a-b;
		System.out.println("sub of c is "+ c);
		
	}
	@Parameters({"a","b"})
	@Test(groups="atithemrtic operation")
	public void mulMethod(int a, int b) {
		int c=a*b;
		System.out.println("mul of c is "+ c);
		
	}
	@Parameters({"f","x"})
	@Test(groups="atithemrtic operation")
	public void divMethod(int a, int b) {
		int c=a/b;
		System.out.println("div of c is "+ c);
		
	}
	

}
