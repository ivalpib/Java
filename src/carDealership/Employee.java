package carDealership;

public class Employee {

	public void handleCustomer(Customer customer, Vehicle vehicle, boolean finance) {
		double doubleAmount = 0;
		if(customer.getCashOnHand()< vehicle.getPrice()) {
			doubleAmount = vehicle.getPrice()-customer.getCashOnHand();
			if (finance == true)
			runCreditHistory(customer, doubleAmount);
			processTransaction(customer, vehicle);
		}
		else if (customer.getCashOnHand()>=vehicle.getPrice()) {
			processTransaction(customer, vehicle);
			
		}
		else {
			System.out.println("Please bring more cash");
		}
		
	}

	private void processTransaction(Customer customer, Vehicle vehicle) {
		System.out.println(customer.getName()+" has bought vehicle: "+vehicle+" for the price "+vehicle.getPrice());
	}

	private void runCreditHistory(Customer customer, double doubleAmount) {
		System.out.println("Ran credit History for Customer: "+customer.getName());
		System.out.println(customer.getName()+" has been approved to purchase the vehicle with the finance "+doubleAmount);
	}
	
	
}
