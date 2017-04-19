
public class Kolo extends Figura{
	
	private int promien;
	
	public Kolo(int promien){
		super("Kolo");
		super.setNazwa("Moja nazwa");
		this.promien = promien;
		setPole();
		setObwod();
	}

	public int getPromien() {
		return promien;
	}

	public void setPromien(int promien) {
		this.promien = promien;
	}

	
	public void setPole() {
		int pole = (int) 3.14*promien*promien;
		super.setPole(pole);
	}

	
	public void setObwod() {
		int obwod = (int) (2*3.14*promien);
		super.setObwod(obwod);
	}
	
	@Override
	public String toString() {
		String nazwa = super.toString();
		return nazwa + " promien: "+promien;
	}

}
