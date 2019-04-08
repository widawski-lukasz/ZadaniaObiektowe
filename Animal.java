import java.lang.Math;
import java.util.ArrayList;

public class Animal {
		String nazwa;
		String wydawanyDzwiek;
		boolean flaga;
		
		
	public Animal(String nazwa, String wydawanyDzwiek, boolean flaga) {
		this.nazwa = nazwa;
		this.wydawanyDzwiek = wydawanyDzwiek;
		this.flaga = flaga;
	}
		
	public void speak(int times) {
		if(this.flaga == true){
			wydawanyDzwiek = wydawanyDzwiek.toUpperCase();
			System.out.print("\n" + this.nazwa + " : ");
			for(int i = 0; i < times; i++) { 
				System.out.print(wydawanyDzwiek + " ");
			}
		} else {
			System.out.print("\n" + this.nazwa + " : ");
			for(int i = 0; i < times; i++) {
				System.out.print(wydawanyDzwiek + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		int times;
		
		ArrayList<Animal> lista = new ArrayList<Animal>();
		Animal zwierze1 = new Animal("Big dog", "woof", true);
		Animal zwierze2 = new Animal("Small dog", "woof", false);
		Animal zwierze3 = new Animal("Cow", "moo", true);
		Animal zwierze4 = new Animal("Frog", "croak", false);
		lista.add(zwierze1);
		lista.add(zwierze2);
		lista.add(zwierze3);
		lista.add(zwierze4);
		
		System.out.print("Loud animals");
		for(Animal loop : lista){
			times = (int)(Math.random() * 5 + 1);
			if (loop.flaga == true) {
				loop.speak(times);
			}
		}
		System.out.print("\nSilent animals");
		for(Animal loop : lista){
			times = (int)(Math.random() * 5 + 1);
			if (loop.flaga == false) {
				loop.speak(times);
			}
		}
	}
}