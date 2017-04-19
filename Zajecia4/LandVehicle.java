package kolo5;

public interface LandVehicle {
	
	default void drive(){
		System.out.println("Pojazd jedzie");
	}
	
	default void stop(){
		System.out.println("Pojazd sie zatrzymal");
	}

}
