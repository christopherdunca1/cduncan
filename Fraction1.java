
public class Fraction1 {
	// instance variable
	private int numerator;
	private int denominator;

	// constructors
	public Fraction1(int num, int denom) {
		numerator = num;
		denominator = denom;
	}

	// instance methods
	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;

	}

	public Fraction1 add(Fraction1 f) {
		int num = numerator * f.denominator + f.numerator * denominator;
		int denom = denominator * f.denominator;
		return new Fraction1(num, denom);
	}

	public Fraction1 subtract(Fraction1 f) {
		int num = numerator * f.denominator - f.numerator * denominator;
		int denom = denominator * f.denominator;
		return new Fraction1(num, denom);
	}

	public Fraction1 multiply(Fraction1 f) {
		int num = numerator * numerator;
		int denom = denominator * denominator;
		return new Fraction1(num, denom);
	}

}
