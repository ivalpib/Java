package carDealership;

public class Car_Dealer {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Toyota", "Camry", 15000);
		Vehicle car = new Vehicle("Toyota", "Camry", 15000);
		
		boolean check = car.equals(vehicle);
		System.out.println(check);
		Customer cust = new Customer("Biplav",12000,"7 Wallace St");
		Employee employee = new Employee();
		cust.purchaseCar(vehicle, employee, true);
		

	}

}
