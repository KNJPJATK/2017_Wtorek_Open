package kolo2;

public class Kwadrat {

	private int bok;
	private int pole = 0;
	private int obwod = 0;
	private String color;
	
	public Kwadrat(int bok, String color){
		this.bok = bok;
		this.color = color;
		pole = obliczPole();
		obwod = obliczObwod();
		
	}

	public int getBok() {
		return bok;
	}

	public void setBok(int bok) {
		this.bok = bok;
	}

	public int getPole() {
		return pole;
	}

	public int getObwod() {
		return obwod;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int obliczPole(){
		pole = bok * bok;
		return pole;
	}
	
	public int obliczObwod(){
		obwod = 4*bok;
		return obwod;
	}

	@Override
	public String toString() {
		return "Kwadrat [bok=" + bok + ", pole=" + pole + ", obwod=" + obwod + ", color=" + color + "]";
	}
	
	
}
