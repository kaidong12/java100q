package patterns.creational.simplefactory;

public class CalculatorMultiply implements Calculator_Interface {
	@Override
	public double calculate(double num1, double num2) {
		return num1 * num2;
	}
}
