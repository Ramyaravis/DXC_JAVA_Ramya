package Metro;
import java.util.Scanner;

class Loan {

	int accountNumber;
	double accountBalance;
	double salary;
	String loanType;
	double loanAmountAxpected;
	double noOfEmiExpected;
	
	public Loan(int accountNumber, double accountBalance, double salary, String loanType, double loanAmountAxpected,double noOfEmiExpected) {
		
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.salary = salary;
		this.loanType = loanType;
		this.loanAmountAxpected = loanAmountAxpected;
		this.noOfEmiExpected = noOfEmiExpected;
		
}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLoneType() {
		return loanType;
	}
	public void setLoneType(String loneType) {
		this.loanType = loneType;
	}
	public double getLoanAmountAxpected() {
		return loanAmountAxpected;
	}
	public void setLoanAmountAxpected(double loanAmountAxpected) {
		this.loanAmountAxpected = loanAmountAxpected;
	}
	public double getNoOfEmiExpected() {
		return noOfEmiExpected;
	}
	public void setNoOfEmiExpected(double noOfEmiExpected) {
		this.noOfEmiExpected = noOfEmiExpected;
	}
	public void Conditions(){
	if(accountNumber>999&&accountNumber<2000)

	{
		if (accountBalance >= 1000) {
			if (salary > 25000 && loanType == "Car") {

				if (noOfEmiExpected <= 36 && loanAmountAxpected <= 500000) {
					System.out.println("Account number:" + accountNumber);
					System.out.println("Eligible loan amount:" + 5000000);
					System.out.println("Eligible EMIs :" + 36);
				} else {
					System.out.println("The customer is not eligible for the loan");
				}
			}
		} else if (accountBalance >= 1000) {
			if (salary > 50000 && loanType == "House") {

				if (noOfEmiExpected <= 60 && loanAmountAxpected <= 6000000) {
					System.out.println("Account number:" + accountNumber);
					System.out.println("The customer can avail the amount of Rs." + loanAmountAxpected);
					System.out.println("Eligible EMIs :" + 60);
					System.out.println("Requested loan amount:" + 6000000);
					System.out.println("Requested EMI's:" + noOfEmiExpected);
				} else {
					System.out.println("The customer is not eligible for the loan");
				}
			}
		} else if (accountBalance >= 1000) {
			if (salary > 75000 && loanType == "Business") {

				if (noOfEmiExpected <= 80 && loanAmountAxpected <= 7500000) {
					System.out.println("Account number:" + accountNumber);
					System.out.println("Eligible loan amount:" + 6000000);
					System.out.println("Eligible EMIs :" + 60);

				} else {
					System.out.println("The customer is not eligible for the loan");
				}
			}

		}

	}else
	{
		System.out.println("Invalid account number");
	}
	}
	}
public class Bankmetro{
	public static void main(String[] args) {
		Loan Customer=new Loan(1001,40000,250000,"Car",300000,30);
		Customer.Conditions();
	
	}
}