package calculator;

public class Calculation implements BasicOperation{
	
	
	
	public int addition(int a, int b) {
		return a + b;
	}
	public double addtion(int a, double b) {
		return a + b;
	}
	public double addition(double a, int b) {
		return a + b;
	}
	public double addition(double a, double b) {
		return a + b;
	}
	
	
	public int subtraction(int a, int b) {
		return a - b;
	}
	public double subtraction(int a, double b) {
		return a - b;
	}
	public double subtraction(double a, int b) {
		return a - b;
	}
	public double subtraction( double a, double b) {
		return a - b;
	}
	
	
	public int multifly(int a, int b) {
		return a * b;
	}
	public double multifly(double a, int b) {
		return a * b;
	}
	public double multifly(int a, double b) {
		return a * b;
	}
	public double multifly(double a, double b) {
		return a * b;
	}
	
	
	public double division(int a, int b) {
		
		return (double) a/b;
	}
	public double division(double a, int b) {
		
		return a / b;
	}
	public double division(int a, double b) {
	
		return a / b;
	}
	public double division(double a, double b) {
		return a / b;
	}
	
	public double mod(double a, double b) {
		return a % b;
	}
}
