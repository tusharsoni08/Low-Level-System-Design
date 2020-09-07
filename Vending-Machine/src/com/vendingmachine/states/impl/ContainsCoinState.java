package com.vendingmachine.states.impl;

import com.vendingmachine.CandyVendingMachine;

public class ContainsCoinState implements CandyVendingMachineState {

	private CandyVendingMachine machine;

	public ContainsCoinState(CandyVendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertCoin() {
		System.out.println("Coin already inserted");
	}

	@Override
	public void pressButton() {
		machine.setState(machine.getDispensedState());
	}

	@Override
	public void dispense() {
		System.out.println("Press button to dispense");
	}

	public String toString() {
		return "ContainsCoinState";
	}
}
