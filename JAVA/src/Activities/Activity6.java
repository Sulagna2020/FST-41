package Activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException  {
		
       Plane plane = new Plane (10);
       
       plane.onboard("David Smith");
       plane.onboard("Rainbow");
       plane.onboard("Harry Wilson");
       
       System.out.println("Plane take-off time is : " + plane.takeOff());
       //Print list of people on board
       System.out.println("Number of passengers on the plane " + plane.getPassengers());
       
       Thread.sleep(5000);
        
       plane.land();
       
       System.out.println("Plane landing time is : " + plane.getLastTimeLanded());
       System.out.println("Number of Passengers on the plane after landing: " + plane.getPassengers());
	}

}
