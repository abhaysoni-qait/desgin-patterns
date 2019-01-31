package factory.computerFactory;

public class ComputerFactory {

	public static Computer 
	getComputer(int type, int price, int ram, float processor) {

		Computer computer = null;

		switch(type) {

		case 1:
			computer = new PC(price, ram, processor);
			break;

		case 2:
			computer = new Server(price, ram, processor);
			break;

		default :
			System.out.println("Type Not Recognized");
		}

		return computer;
	}

	private ComputerFactory() {
		// we do not need any instance of this class
	}

}
