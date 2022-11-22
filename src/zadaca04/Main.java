package zadaca04;

public class Main {

	public static void main (String[] args) {
		Avtomobil obj1 = new Avtomobil ("Mercedes", "AMG", "Red", 5000);
		
		obj1.mnozenjeKm(2);
		System.out.println(obj1.getMarka());
		System.out.println(obj1.getModel());
		System.out.println(obj1.getBoja());
		System.out.println(obj1.getPominatiKm());
		
	}
}
