package factory.computerFactory;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int type;
		int ram;
		int price;
		float processor;
		
		System.out.println("Choose The Type Of Computer You Want");
		System.out.println("1. PC");
		System.out.println("2. SERVER");
		type=scan.nextInt();
		System.out.println("Enter ram amount");
		ram=scan.nextInt();
		System.out.println("Enter price");
		price = scan.nextInt();
		System.out.println("Enter Processor");
		processor = scan.nextFloat();
		
		Computer computer = ComputerFactory.getComputer(type, price, ram, processor);
		if(computer==null) {
			System.out.println("Sorry Your request can not be processed due to invalid specification");
		}
		
		if(computer instanceof Server) {
			Server server = (Server)computer;
			server.start();
		}else if(computer instanceof PC) {
			PC pc = (PC)computer;
			pc.start();
		}
		
		
		
	}

}
