import java.util.ArrayList;

public class articleTest{

	public static void main(String[] args){
		ArrayList<Article> shoppingList = new ArrayList<Article>();
		float[] discounts = new float[]{0.0f, 0.10f, 0.15f, 0.25f};
		
		
		Article article1 = new Article("Shower Gel", 3, "60.00%");
		Article article2 = new Article("Board Game", 20, "130.00%");
		Article article3 = new Article("Bicycle", 250, "80.00%");
		Article article4 = new Article("Strawberries", 10, "50.00%");
		shoppingList.add(article1);
		shoppingList.add(article2);
		shoppingList.add(article3);
		shoppingList.add(article4);
	
	for(Article loop : shoppingList) {
		System.out.print("(" + loop.getProdName() + ", " + loop.getQuantPrice() + ", " + loop.getMargin() + ")");
	}
	
	
	for(int i = 0; i < 4; i++) {
		float prodTotal = 0;
		for (Article loop : shoppingList) {
			float floatMargin;
			String percent = loop.getMargin().replace("%", "");
			try {
				floatMargin = Float.parseFloat(percent)/100;
			} catch(NumberFormatException ex) {
				floatMargin = 0.0f;
			}
			prodTotal = prodTotal + (loop.getQuantPrice() + loop.getQuantPrice() * floatMargin);
		}
		float prodsAfterDisc = prodTotal - prodTotal * discounts[i];
		System.out.format("\n" + "Articles' price after " + "%.2f"  + "%% discount: " + "%.2f", discounts[i]*100, prodsAfterDisc);
	}
}
}
