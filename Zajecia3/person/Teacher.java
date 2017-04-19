package person;

public class Teacher extends Person{

//	private String imie;
//	private String nazwisko;
//	private String plec;
	private String przedmiot;
	
	public Teacher(String imie, String nazwisko, String plec, String przedmiot) {
		super(imie, nazwisko, plec);
//		this.imie = imie;
//		this.nazwisko = nazwisko;
//		this.plec = plec;
		this.przedmiot = przedmiot;
	}
	
//	public String getImie() {
//		return imie;
//	}
//	public void setImie(String imie) {
//		this.imie = imie;
//	}
//	public String getNazwisko() {
//		return nazwisko;
//	}
//	public void setNazwisko(String nazwisko) {
//		this.nazwisko = nazwisko;
//	}
//	public String getPlec() {
//		return plec;
//	}
//	public void setPlec(String plec) {
//		this.plec = plec;
//	}
	public String getPrzedmiot() {
		return przedmiot;
	}
	public void setPrzedmiot(String przedmiot) {
		this.przedmiot = przedmiot;
	}
	
	
	public String teach(){
		return "Ucze innych";
	}
	
	@Override
	public String introduce(){
		return "Imie: "+getImie()+", nazwisko: "+getNazwisko()+", plec: "+getPlec()+", przedmiot: "+przedmiot; 
	}
	
	
	
}
