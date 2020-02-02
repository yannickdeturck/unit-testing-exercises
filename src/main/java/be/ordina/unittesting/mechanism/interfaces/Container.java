package be.ordina.unittesting.mechanism.interfaces;


import be.ordina.unittesting.model.PortionSize;

public interface Container {
	boolean getPortion(PortionSize portionSize);
	int getCurrentVolume();
	int getTotalVolume();
	void refillContainer();
}
