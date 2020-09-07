package com.vendingmachine;

public class Application {

	public static void main(String[] args) {
		System.out.println("-----Test 1: Testing machine by inserting coin and pressing button-----");
		CandyVendingMachine machine = new CandyVendingMachine(3);
		System.out.println(machine);
		machine.insertCoin();
		System.out.println(machine);
		machine.pressButton();
		System.out.println(machine);
		
		System.out.println("-----Test 2: Testing machine by pressing button without inserting coin-----");
		CandyVendingMachine machine2=new CandyVendingMachine(3);
        System.out.println(machine2);
        machine2.pressButton();
        System.out.println(machine2);
        
		System.out.println("-----Test 3: Testing machine running out of candies-----");
		CandyVendingMachine machine3=new CandyVendingMachine(3);
		System.out.println(machine3);
		machine3.insertCoin();
		System.out.println(machine3);
		machine3.pressButton();
		System.out.println(machine3);
		machine3.insertCoin();
		System.out.println(machine3);
		machine3.pressButton();
		System.out.println(machine3);
		machine3.insertCoin();
		System.out.println(machine3);
		machine3.pressButton();
		System.out.println(machine3);
		machine3.insertCoin();
		System.out.println(machine3);
		machine3.pressButton();
		System.out.println(machine3);

	}

}

/*

Vending Machine:

Actions: 
1. take money -> select item -> return item

States:
1. No coin
2. No candy
3. Conatins coin
4. dispense candy





*/