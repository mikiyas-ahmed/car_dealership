
public class Vehicle {
		
	private int price;
	private String carColoure;
	private String corModel;
	
		public String getCarColoure() {
		return carColoure;
	}

	public void setCarColoure(String carColoure) {
		this.carColoure = carColoure;
	}

	public String getCorModel() {
		return corModel;
	}

	public void setCorModel(String corModel) {
		this.corModel = corModel;
	}

		public int getPrice() {
			return price;
		}
		
		public void setPrice(int price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Vehicle [price=" + price + ", carColoure=" + carColoure + ", corModel=" + corModel + "]";
		}
		
		
}
