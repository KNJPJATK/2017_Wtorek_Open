package kolo5;

public interface ActionVehicle extends LandVehicle, WaterVehicle {



	//Musimy nadpisać metodę która jest zedeklarowana defaultowo w 2 z rozszerzanych interfejsów!
	@Override
	default void drive() {
		// TODO Auto-generated method stub
		LandVehicle.super.drive();
	}
	


}
