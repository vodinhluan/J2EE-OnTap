package calculator.model;

import java.io.Serializable;

public class Calculator implements Serializable {
	public Calculator() {
	}
	
	public double cong(double a, double b) {
		return a+b;
	}
	
	public double tru(double a, double b) {
		return a-b;
	}
	
	public double nhan(double a, double b) {
		return a*b;
	}
	
	public double chia(double a, double b) {
		return a/b;
	}
}
