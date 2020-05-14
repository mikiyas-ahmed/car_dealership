
public class Dealership {

	public static void main(String[] args) {
		
		Customer cust= new Customer();
		cust.setName("Mikiyas Eshetu");
		cust.setAddress("poznan, poland");
		cust.setCashOnHand(24000);
		
		Vehicle vehicle=new Vehicle();
		vehicle.setPrice(8000);
		vehicle.setCorModel("Accord");
		vehicle.setCarColoure("");
		
		Employee employee= new Employee();
		
		cust.purchaseCar(vehicle, employee, true);

	}

}
