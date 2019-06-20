public class Product{
	private double price;
	private String id;
	private int quantity;
	
	public Product(){
		this.price = 0.0;
		this.id = "";
		this.quantity = 0;
	}
	
	public Product(double price, String id, int quantity){
		this.price = price;
		this.id = id;
		this.quantity = quantity;
	}
	
	public void set_price(double price){
		this.price = price;
	}
	
	public void set_id(String id){
		this.id = id;
	}
	
	public void set_quantity(int quantity){
		this.quantity = quantity;
	}
	
	public double get_price(){
		return this.price;
	}
	
	public String get_id(){
		return this.id;
	}
	
	public int get_quantity(){
		return this.quantity;
	}
	
	public double get_value(){
		return (this.price * this.quantity);
	}
}