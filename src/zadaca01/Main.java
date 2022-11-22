package zadaca01;

public class Main {

	public static void main (String[] args) {
		Covek obj1 = new Covek();
		
		obj1.setIme("Petre");
		obj1.setPrezime("Petrov");
		obj1.setMaticenBroj("1950482792003");
		
		System.out.println(obj1.getIme());
		System.out.println(obj1.getPrezime());
		System.out.println(obj1.getMaticenBroj());
	}
}