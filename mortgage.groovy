
Mortgage m = new Mortgage();

m.totAmount = 0;
m.years = 0;
m.intRate = 0;

print('Enter Total Amount Borrowed: ');
m.totAmount = Double.parseDouble(System.console().readLine());

print('Enter the Number of Years to Repay: ')
m.years = Integer.parseInt(System.console().readLine());

print('Enter Interest Rate: ');
m.intRate = Double.parseDouble(System.console().readLine());

println('Total Amount to be Paid: ' + m.totalAmountToPay());
println('Yearly Payment: ' + m.yearlyPaymentAmount());
println('Years To Pay Interest: ' + m.yearsToPayInterest());

class Mortgage {
    Double totAmount;
    int years;
    Double intRate;
    
    Double yearlyInterest() {
    	return (totAmount * (intRate / 100));
    }
    
    Double totalInterest() {
    	return (yearlyInterest() * years);
    }    
    
    Double totalAmountToPay() {
        return totalInterest() + totAmount;
    }
    
    Double yearlyPaymentAmount() {
        return totalAmountToPay() / years;
    }

    Double yearsToPayInterest() {
    	int x = 0;
    	Double sum = 0;
    	
    	while (sum < totalInterest()) {
    	    x++;
    	    sum = (yearlyPaymentAmount() * x);
    	}
    	return x;
    }
}