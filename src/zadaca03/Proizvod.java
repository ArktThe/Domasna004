package zadaca03;

public class Proizvod {

	private String ime;
	private String proizvoditel;
	private int cena;
	private double tezhina;
	
	public Proizvod () {
		this.ime = "Ice Tea";
		this.proizvoditel = "Tea";
		this.cena = 50;
		this.tezhina = 300;
	}
	
	public String getIme () {
		return this.ime;
	}
	public String getProizvoditel () {
		return this.proizvoditel;
	}
	public int getCena () {
		return this.cena;
	}
	public double getTezhina () {
		return this.tezhina;
	}
}