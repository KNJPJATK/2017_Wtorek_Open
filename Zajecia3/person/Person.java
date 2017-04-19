package person;

public class Person {
	
	private String imie;
	private String nazwisko;
	private String plec;
	
	public Person(String imie, String nazwisko, String plec){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.plec = plec;
	}
	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getPlec() {
		return plec;
	}
	public void setPlec(String plec) {
		this.plec = plec;
	}
	
	public String sunbathing(){
		return "Opalam sie";
	}
	
	
	public String introduce(){
		return "Imie: "+imie+" nazwisko: "+nazwisko+" plec: "+plec; 
	}
	

}
