// Resenhas de publicaçoes

public class ProductReview extends Post implements Evaluable{
	//classe herdando Post e implimentando a interface Evaluable
	private String brand;
	private int stars;
	
	
	public ProductReview(){
	
	}
	public ProductReview(String title, String content, String brand, int stars){
		super(title, content);
		this.brand = brand;
		this.evaluate(stars);
	}

	public void setbrand(String brand){
		this.brand = brand;
	}
	public String getbrand(){
		return this.brand;
	}
	public void setstars(int stars){
		this.stars = stars;
	}
	public int getstars(){
		return this.stars;
	}

	public void evaluate(int value){
		this.stars = value;
	}	
	
	public void show(){
		super.show();
		System.out.println("Brand: "+this.brand);
		System.out.println("Stars: "+this.stars);
	}
}
