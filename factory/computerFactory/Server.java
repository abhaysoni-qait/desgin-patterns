package factory.computerFactory;

public class Server implements Computer{
	

	private int price;
	private int ram;
	private float processor;

	@Override
	public void start() {
		System.out.println("Server Started");
		
	}

	@Override
	public void shutDown() {
		System.out.println("Server Shutdown");
		
	}

	@Override
	public void sleep() {
		System.out.println("Server put sleep");
		
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

	public Server(int price, int ram, float processor) {
		super();
		this.price = price;
		this.ram = ram;
		this.processor = processor;
	}
	
	
	
	
}
