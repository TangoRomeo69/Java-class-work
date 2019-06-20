public class Main{
	public static void main(String[] args){
		Inventory myInv = new Inventory("MyInv", "123", 20, 0);
		Product pr1 = new Product(50.00, "1", 5);
		Product pr2 = new Product(60.00, "2", 4);
		
		myInv.add_product(pr1);
		myInv.add_product(pr2);
		
		myInv.show_product_info();
		myInv.show_value();
	}
}