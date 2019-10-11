package ioc;

public class Restaurant {
	private Waiter w;
	public Restaurant() {
		System.out.println("Restaurant的无参构造器");
	}
	public Restaurant( Waiter w) {
		System.out.println("Restaurant的带参构造器");
		this.w=w;
	}
	@Override
	public String toString() {
		return "Restaurant [w=" + w + "]";
	}
	


}
