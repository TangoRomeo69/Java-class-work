public class Inventory{
	private String invName;
	private String invId;
	private Product[] products;
	private int productAmnt;
	
	public Inventory(){
		this.invName = "";
		this.invId = "";
		this.products = new Product[50];
		this.productAmnt = 0;
	}
	
	public Inventory(String invName, String invId, int invCap, int productAmnt){
		this.invName = invName;
		this.invId = invId;
		this.products = new Product[invCap];
		this.productAmnt = productAmnt;
	}
	
	public void add_product(Product pr){
		products[productAmnt++] = pr;
	}
	
	public void show_product_info(){
		System.out.println("--Product Info--");
		for(int i = 0; i < productAmnt; i++){
		System.out.println("Product " + products[i].get_id() + ":");
		System.out.println("Price: " + products[i].get_price() + ", " + "Quantity: " + products[i].get_quantity());
		System.out.println();
		}
	}
	
	public void show_value(){
		double value = 0.0;
		for(int i = 0; i < productAmnt; i++){
			value += products[i].get_value();
		}
		System.out.println("The total value is: " + value);
	}
	
}