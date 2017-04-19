package kolo5;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
		//Figura f = new Figura();
		
		
		//Main main = new Main();
		//InnerClass class1 = main.new InnerClass();
		
		Tank tank = new Tank();
		Bicycle bicycle = new Bicycle();
		
		tank.drive();
		bicycle.drive();
		
		ArrayList<LandVehicle> lista = new ArrayList<>();
		
		lista.add(bicycle);
		lista.add(tank);
	//	lista.add(new Object());
		
		for (LandVehicle landVe : lista) {
			landVe.drive();
		}
	}
	
	class InnerClass {
		
	}
}


