package ro.ase.cts.g1098.assignment;

public class Account {
	public double loan_value, rate;
	public int daysActive, account_Type;
	public static final int	STANDARD=0,BUDGET=1,PREMIUM=2,SUPER_PREMIUM=3;

	//This method returns the value of the loan
	public double loan() {
		System.out.println("The loan value is " + this.loan_value);
		return loan_value;
	}
	
    //This method called getRate, takes in one argument(the variable named 'rent') and returns its value
	public double getRate() {
		System.out.println("The rate is " + rate);
		return this.rate;
	}
	
     //This is a method called getMonthlyRate that calculates the monthly rate for our loan and returns it as a double.
	// must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return loan_value * rate;
	}
	
    //Next, we have setValue which sets the value of our loan to some number if it's positive
	//or throws an exception if it's negative.
	public void setValue(double value) throws Exception {
		if (value < 0)
			throw new Exception();
		else {
			loan_value = value;
		}
	}

	public String to_string() {
		return "Loan: " + this.loan_value + "; rate: " + this.rate + "; days active:" + daysActive + "; Type: "
				+ account_Type + ";";
	}

	public void print() {
		int vb = 10;
		System.out.println("This is an account");
	}
	
	public Account(double value, double rate, int account_Type) throws Exception {
		if (value < 0)
			throw new Exception();
		else {
			loan_value = value;
		}
		this.rate = rate;
		this.account_Type = account_Type;
	}

}
