package com.vendingmachine.states.impl;

import com.vendingmachine.CandyVendingMachine;

public class NoCandyState implements CandyVendingMachineState{
	
	private CandyVendingMachine machine;
	
	public NoCandyState(CandyVendingMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertCoin() {
		System.out.println("No candies available");
	}

	@Override
	public void pressButton() {
		System.out.println("No candies available");	
	}

	@Override
	public void dispense() {
		System.out.println("No candies available");
	}
	
	public String toString() {
		return "NoCandyState";
	}
}
