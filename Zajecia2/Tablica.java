package kolo2;

public class Tablica {
	static {
		System.out.println("Blok statyczny");
	}
	
	private static String NAZWA = "Nasza Tablica"; 
	private String tekstTablicy = "";
	private String backupString = "";
	
	public Tablica(String tekstTablicy){
		System.out.println("Konstruktor");
		this.tekstTablicy = tekstTablicy;
	}
	
	public static String getNazwa(){
		return NAZWA;
	}
	
	public void setTekstTablicy(String text){
		setBackupString(tekstTablicy);
		tekstTablicy = text;
	}
	
	public String getTekstTablicy(){
		return mojToString();
	}
	
	private String mojToString(){
		return tekstTablicy;
	}
	
	public String getBackupString() {
		return backupString;
	}

	public void setBackupString(String backupString) {
		this.backupString = backupString;
	}

	@Override
	public String toString() {
		return tekstTablicy;
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

}
