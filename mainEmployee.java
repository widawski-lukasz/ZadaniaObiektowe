import java.util.*;

public class mainEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		Employee pracownik1 = new Employee("Programmer", 12000);
		Employee pracownik2 = new Employee("Secretary", 6500);
		Employee pracownik3 = new Employee("Programmer", 13500);
		list.add(pracownik1);
		list.add(pracownik2);
		list.add(pracownik3);
		
		ArrayList<Integer> sevenKIDList = new ArrayList<Integer>();
		
		for (Employee loop : list) {
			if(loop.getPensja() > 7000) {
				sevenKIDList.add(loop.getId());
			}
		}
		
	
		System.out.println(list);
		System.out.println("Mean annual salary for programmers is: " + getProgMean(list)); 
		System.out.println("Employees who earn more than 7k: " + sevenKIDList);
		
	}	
	
	public static float getProgMean(List<Employee> lista) {
		float mean = 0;
		int i = 0;
		for(Employee loop: lista) {
			if (loop.getStanowisko() == "Programmer") {
				i++;
				mean = mean + (loop.getPensja() * 12);
			}
		}
		mean = mean / i;
		return mean;
	}
}
	
