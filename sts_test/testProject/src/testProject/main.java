package testProject;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class main {

	public static void main(String[] args) {
 
		double a = 3.2;
		double b = 2.1;
		double doubleAddAnswer = a+b; //기대값 : 5.3
		double doubleSubAnswer = a-b; //기대값 : 1.1
		double doubleMulti = a*b; //기대값 : 6.72
		
		System.out.println("double +연산 : 3.2+2.1=" + doubleAddAnswer);
		System.out.println("double -연산 : 3.2-2.1=" + doubleSubAnswer);
		System.out.println("double *연산 : 3.2*2.1=" + doubleMulti);
		
		System.out.println();
		
		
		BigDecimal bigA = new BigDecimal("3.2");
		BigDecimal bigB = new BigDecimal("2.1");
		BigDecimal bigAddAnswer = bigA.add(bigB);
		BigDecimal bigSubAnswer = bigA.subtract(bigB);
		BigDecimal bigMultiAnswer = bigA.multiply(bigB);
		
		System.out.println("BigDecimal +연산 : 3.2+2.1=" + bigAddAnswer);
		System.out.println("BigDecimal -연산 : 3.2-2.1=" + bigSubAnswer);
		System.out.println("BigDecimal *연산 : 3.2*2.1=" + bigMultiAnswer);
		
		
		MathContext mc = new MathContext(10,RoundingMode.DOWN);
	
		//BigDecimal bigDivide1 = bigA.divide(bigB);
		BigDecimal bigDivide2 = bigA.divide(bigB, 6, RoundingMode.HALF_UP);
		
		
		System.out.println();
		
		BigDecimal d1 = new BigDecimal("4");
		BigDecimal d2 = new BigDecimal("7");
		
		System.out.println("UP  - " + d1.divide(d2, 7, RoundingMode.UP));
		System.out.println("DOWN  - " + d1.divide(d2, 5, RoundingMode.DOWN));
		System.out.println("CEILING  - " + d1.divide(d2, 5, RoundingMode.CEILING));
		System.out.println("FLOOR  - " + d1.divide(d2, 5, RoundingMode.FLOOR));
		System.out.println("HALF_UP  - " + d1.divide(d2, 5, RoundingMode.HALF_UP));
		System.out.println("HALF_DOWN  - " + d1.divide(d2, 5, RoundingMode.HALF_DOWN));
		System.out.println("HALF_EVEN  - " + d1.divide(d2, 5, RoundingMode.HALF_EVEN));
		
		
	}
}
