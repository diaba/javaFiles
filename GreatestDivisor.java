package Lesson1;

public class GreatestDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int intNumber1 = 16;
		int intNumber2 = 24;
		int intDivisor = 1; // Initial divisor
		int intPossibleDivisor = 2;
		
		while( (intPossibleDivisor <= intNumber1) &&  (intPossibleDivisor <= intNumber2) ) {
			if ( (intNumber1 % intPossibleDivisor == 0) && (intNumber2 % intPossibleDivisor == 0) ) {
				intDivisor = intPossibleDivisor;
				
			}
			intPossibleDivisor ++;
			
		}System.out.println("Result"+ intDivisor);

	}

}
