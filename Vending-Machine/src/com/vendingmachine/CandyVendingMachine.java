package com.vendingmachine;

import com.vendingmachine.states.impl.CandyVendingMachineState;
import com.vendingmachine.states.impl.ContainsCoinState;
import com.vendingmachine.states.impl.DispensedState;
import com.vendingmachine.states.impl.NoCandyState;
import com.vendingmachine.states.impl.NoCoinState;

public class CandyVendingMachine {

	CandyVendingMachineState noCoinState;
	CandyVendingMachineState noCandyState;
	CandyVendingMachineState dispensedState;
	CandyVendingMachineState containsCoinState;
	CandyVendingMachineState state;
	int count;

	public CandyVendingMachine(int numberOfCandies) {
		count = numberOfCandies;
		noCoinState = new NoCoinState(this);
		noCandyState = new NoCandyState(this);
		dispensedState = new DispensedState(this);
		containsCoinState = new ContainsCoinState(this);
		state = noCoinState;
	}

	public void refillCandy(int count) {
		this.count += count;
		this.state = noCoinState;
	}

	public void ejectCandy() {
		if (count != 0)
			--count;
	}

	public void insertCoin() {
		System.out.println("Coin inserted");
		state.insertCoin();
	}

	public void pressButton() {
		System.out.println("Button pressed");
		state.pressButton();
		state.dispense();
	}

	public CandyVendingMachineState getNoCandyState() {
		return noCandyState;
	}

	public void setNoCandyState(CandyVendingMachineState noCandyState) {
		this.noCandyState = noCandyState;
	}

	public CandyVendingMachineState getNoCoinState() {
		return noCoinState;
	}

	public void setNoCoinState(CandyVendingMachineState noCoinState) {
		this.noCoinState = noCoinState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public CandyVendingMachineState getDispensedState() {
		return dispensedState;
	}

	public void setDispensedState(CandyVendingMachineState dispensedState) {
		this.dispensedState = dispensedState;
	}

	public CandyVendingMachineState getContainsCoinState() {
		return containsCoinState;
	}

	public void setContainsCoinState(CandyVendingMachineState containsCoinState) {
		this.containsCoinState = containsCoinState;
	}

	public CandyVendingMachineState getState() {
		return state;
	}

	public void setState(CandyVendingMachineState state) {
		this.state = state;
	}

	@Override
	public String toString() {
		String machineDef = "Current state of machine " + state + ". Candies available " + count;
		return machineDef;
	}

}
