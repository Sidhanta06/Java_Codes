package string;

public class car {
     String brand;
     String color;
     String model;
     int mil;
     double price;
     public car()
     {}
	public car(String brand, String color, String model, int mil, double price) {
		this.brand = brand;
		this.color = color;
		this.model = model;
		this.mil = mil;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Brand:"+brand+"  Color:"+color+"  Model:"+model+"  Millage:"+mil+"  Price:"+price+" lakh"+"\n\n";
	}
      
}
