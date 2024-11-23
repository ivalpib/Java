package carDealership;

public class Employee {

	public void handleCustomer(Customer customer, Vehicle vehicle, boolean finance) {
		double doubleAmount = 0;
		if(finance == true) {
			runCreditHistory(customer, doubleAmount);
		}
		
	}

	private void runCreditHistory(Customer customer, double doubleAmount) {
		
		
	}
	
}
