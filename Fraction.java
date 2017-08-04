public class Fraction {
	private double numerator;//Here are our instance variables
	private double denominator;

	// Here are the constructors below
	public Fraction() {//This sets the fraction to a default value of 0/1
	}
	
	public Fraction(double numerator, double denominator) {//This is the constructor that accepts two parameters
		this.numerator = numerator;
		this.denominator = denominator;
	}

	//Here is the getter method for numerator
	public double getNumerator() {
		return numerator;
	}
	//Here is the getter method for Denominator
	public double getDenominator() {
		return denominator;

	}
	//Here is the setter method for Numerator
		public void setNumerator(int numerator)
		{
			this.numerator = numerator;
		}

	//Here is the setter method for Denominator
		public void setDenominator(int denominator)
		{
			this.denominator = denominator;
		}
		
//Here is the Fraction add method
		public Fraction add(Fraction a) {
			//Here is how the numerator is calculated
		    double num = this.numerator * a.denominator + a.numerator * denominator;
		    //Here is how the denominator is calculated
		    double denom = this.denominator * a.denominator;
		    //This is going to return a numerator and denominator
		    return new Fraction(num, denom);
		  }
//Here is the voided print method that will print a fraction
	public void print()
	{
	    System.out.println(this.numerator + "/" + this.denominator);
	}
	}

    

