
public class Kwadrat extends Figura{

	private int bok;
	
	public Kwadrat(int bok){
		super("Kwadrat");
		this.bok = bok;
		setObwod();
		setPole();
	}

	public int getBok() {
		return bok;
	}

	public void setBok(int bok) {
		this.bok = bok;
	}
	
	
	public void setPole() {
		int pole =  bok * bok;
		super.setPole(pole);
	}

	
	public void setObwod() {
		int obwod = 4 * bok;
		super.setObwod(obwod);
	}
	
	@Override
	public String toString() {
		String nazwa = super.toString();
		return nazwa + " bok: "+bok;
	}
	
}
