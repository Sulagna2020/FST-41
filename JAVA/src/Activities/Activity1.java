package Activities;

public class Activity1 {

	public static void main(String[] args) {

		Car mercedes = new Car();
		mercedes.make = 2014;
		mercedes.transmission = "manual";
		mercedes.color = "red";
		
		// using Car class method
		
		mercedes.displayCharacteristics();
		mercedes.accelerate();
		mercedes.brake();
	}

}
