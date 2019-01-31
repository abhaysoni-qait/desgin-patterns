package factory.computerFactory;

public class PC implements Computer{
	
	private int price;
	private int ram;
	private float processor;

	@Override
	public void start() {
		System.out.println("PC Started");
		
	}

	@Override
	public void shutDown() {
		System.out.println("PC Shutdown");
		
	}

	@Override
	public void sleep() {
		System.out.println("PC put sleep");
		
	}


	public int getPrice() {
		return price;
	}

	public int getRam() {
		return ram;
	}

	public float getProcessor() {
		return processor;
	}

	public PC(int price, int ram, float processor) {
		super();
		this.price = price;
		this.ram = ram;
		this.processor = processor;
	}
	
	
	
}
