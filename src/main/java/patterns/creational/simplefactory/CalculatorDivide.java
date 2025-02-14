package patterns.creational.simplefactory;

public class CalculatorDivide implements Calculator_Interface {

	@Override
	public double calculate(double num1, double num2) {
		if (num2 == 0) {
			throw new IllegalArgumentException("Cannot divide by zero");
		}
		return num1 / num2;
	}
}
