package gitProblems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AllTestCase {

	@Test
	public void testSI() {
		InterestCalculator calc=new InterestCalculator();
		double p=1000;
		double r=5;
		double t=2;
		double expectedI=100;
		assertEquals(expectedI,calc.Calculate(p,r,t));
	}
	@Test
	
	public void testDiscount() {
		DiscountCalculator dis=new DiscountCalculator();
		double price=500;
		double percentage=10;
		double expectedD=450;
		assertEquals(expectedD,dis.calculate(price,percentage));
		
	}
	
	@Test
	
	public void testMinValue(){
		Minimumvalue m=new Minimumvalue();
		int[] arr= {5,2,8,1,9};
		int expectedM=1;
		assertEquals(expectedM,m.findminValue(arr));
		
	}

}
