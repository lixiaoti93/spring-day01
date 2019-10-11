package autowire;

public class Car {
	private Enginee en;
	

	public void setEn(Enginee en) {
		System.out.println("Car的setEg方法");
		this.en = en;
	}


	public Car() {
		System.out.println("Car的无参构造器");
	}


	@Override
	public String toString() {
		return "Car [en=" + en + "]";
	}
	

}
