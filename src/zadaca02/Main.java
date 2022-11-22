package zadaca02;

public class Main {

	public static void main (String[] args) {
		Restoran obj1 = new Restoran ();
		
		obj1.setIme("Rare");
		obj1.setLokacija("Lovecka br.44");
		obj1.setTelefon("070555661");
		obj1.setBrNaSedista(100);
		
		System.out.println(obj1.getIme());
		System.out.println(obj1.getLokacija());
		System.out.println(obj1.getTelefon());
		System.out.println(obj1.getBrNaSedista());
	}
}
