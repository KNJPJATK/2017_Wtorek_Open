package person;

public class Student extends Person{

	private String idStudenta;
	
	public Student(String imie, String nazwisko, String plec, String idStudenta) {
		super(imie, nazwisko, plec);
		this.idStudenta = idStudenta;
	}
	
	public String getIdStudenta() {
		return idStudenta;
	}
	public void setIdStudenta(String idStudenta) {
		this.idStudenta = idStudenta;
	}
	
	public String study(){
		return "Ucze sie";

	}
	
	@Override
	public String introduce(){
		return "Imie: "+getImie()+", nazwisko: "+getNazwisko()+", plec: "+getPlec()+", idStudenta: "+idStudenta; 
	}
	
	
	
	
	
}
