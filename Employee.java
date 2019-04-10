public class Employee {

	private static int CountId = 1;
	private int id;
	private String stanowisko;
	private float pensja;

	
	public Employee(String stanowisko, float pensja){
		this.id = createID();
		this.stanowisko = stanowisko;
		this.pensja = pensja;
	}
	
	public String getStanowisko(){
		return stanowisko;
	}
	public float getPensja(){
		return pensja;
	}
	public int getId(){
		return id;
	}
	
	
	public static synchronized int createID() {
		return CountId++;
	}
	
	
	
	public String toString() {
		return("("+ id + ")" + " " +"(" + stanowisko + ")" + " : " + pensja + "\n");
	}
}
	