public class Triangle{
	private int x;
	private int y;
	private int z;
	
	public Triangle(){
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public Triangle(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void show_info(){
		System.out.println("--Triangle sides info--");
		System.out.println("Side X: " + this.x);
		System.out.println("Side Y: " + this.y);
		System.out.println("Side Z: " + this.z);
	}
	
	public bool test_triangle(){
		return ((this.x == this.y) && (this.y == this.z));
	}
}