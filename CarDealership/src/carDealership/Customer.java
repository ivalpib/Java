package carDealership;

public class Customer {
	private String name;
	private double cashOnHand;
	private String address;
	
	
	public Customer(String name, double cashOnHand, String address) {
		super();
		this.name = name;
		this.cashOnHand = cashOnHand;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCashOnHand() {
		return cashOnHand;
	}
	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
		
		emp.handleCustomer(this, vehicle, finance);
		
	}
	
	
}
