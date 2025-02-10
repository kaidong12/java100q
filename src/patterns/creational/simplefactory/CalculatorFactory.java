package patterns.creational.simplefactory;

public class CalculatorFactory {
	public static Calculator_Interface getCalculator(String operation) {
		switch (operation) {
		case "add":
			return new CalculatorAdd();
		case "subtract":
			return new CalculatorSubtract();
		case "multiply":
			return new CalculatorMultiply();
		case "divide":
			return new CalculatorDivide();
		default:
			throw new IllegalArgumentException("Invalid operation");
		}
	}
}
