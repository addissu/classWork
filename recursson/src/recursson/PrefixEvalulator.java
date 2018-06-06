package recursson;

import java.util.Scanner;

public class PrefixEvalulator {

	public static void main(String[] args) {
		
		
		Scanner console=new Scanner(System.in);
		System.out.println("Evalulate prefix expression ");
		System.out.println("for operators +, -, *, /, % ");
		System.out.println("Expression ");
		System.out.println(" value= " + evaluate(console));
		
		
		
	}

	public static double evaluate(Scanner input) {
		
		if(input.hasNextDouble()){
			return input.nextDouble();
		}else {
			String operator = input.next();
			double operand1 = evaluate(input);
			double operand2 = evaluate(input);
			return evaluate(operator,operand1,operand2);
		}
	}

	private static double evaluate(String operator, double operand1, double operand2) {
		if(operator.equals("+")){
			return operand1 + operand2;
		}else if (operator.equals("-")){
			return operand1-operand2;
		}else{
			throw new RuntimeException("illegal operator " + operator);
		}
		
	}

}
