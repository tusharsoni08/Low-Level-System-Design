package com.vendingmachine.states.impl;

import com.vendingmachine.CandyVendingMachine;

public class NoCoinState implements CandyVendingMachineState {

	private CandyVendingMachine machine;

	public NoCoinState(CandyVendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertCoin() {
		machine.setState(machine.getContainsCoinState());
	}

	@Override
	public void pressButton() {
		System.out.println("No coin inserted");
	}

	@Override
	public void dispense() {
		System.out.println("No coin inserted");
	}

	public String toString() {
		return "NoCoinState";
	}

}
