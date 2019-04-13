public class Article {
	private String prodName;
	private int quantPrice;
	private String margin;
	
	public Article(String prodName, int quantPrice, String margin){
		this.prodName = prodName;
		this.quantPrice = quantPrice;
		this.margin = margin;
	}
	
	public String getProdName(){
		return this.prodName;
	}
	public void setProdName(String prodName){
		this.prodName = prodName;
	}
	public int getQuantPrice() {
		return this.quantPrice;
	}
	public void setQuantPrice(int quantPrice) {
		this.quantPrice = quantPrice;
	}
	public String getMargin(){
		return this.margin;
	}
	public void setMargin(String margin){
		this.margin = margin;
	}
	
	//public String toString() {
	//	return (this.prodName + this.quantPrice + this.margin); 
	//}
}
	
	