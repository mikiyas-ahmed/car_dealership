
public class Employee {
	public void handle(Customer cust, boolean finance, Vehicle vehicle) {
		
		
		if(finance==true) {
			double loanAmount=vehicle.getPrice()-cust.getCashOnHand();
			runCreditHistory( cust, loanAmount);}
		else if(vehicle.getPrice()<=cust.getCashOnHand()) {
				processTransaction(cust, vehicle);
			}
		else
			System.out.println("you should have to bring more money");
		
			
	
	
	}
	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Run credit history for customer.........");
		System.out.println("customer has been aprouved to purchase the car...........");
	}
	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println("the customer has purchased the car "+vehicle+" for the "+vehicle.getPrice()+" price");
	}
	
		
		
	}
