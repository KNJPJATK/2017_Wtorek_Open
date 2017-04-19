
public class Figura {
	private String nazwa;
	private int pole = 0;
	private int obwod = 0;
	
	public Figura(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getPole() {
		return 0;
	}

	public void setPole(int pole) {
		this.pole = pole;
	}

	public int getObwod() {
		return 0;
	}

	public void setObwod(int obwod) {
		this.obwod = obwod;
	}

	@Override
	public String toString() {
		return "Figura [nazwa=" + nazwa + ", pole=" + pole + ", obwod=" + obwod + "]";
	}
	
	
	
	
	
	
}
