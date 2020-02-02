package be.ordina.unittesting.mechanism;


import be.ordina.unittesting.model.PortionSize;
import be.ordina.unittesting.mechanism.interfaces.Container;

public abstract class AbstractContainer implements Container {
	private int containerTotalVolume;
	private int currentVolume;

	public AbstractContainer(int volume) {
		if (volume < 1) {
			throw new IllegalArgumentException("Container's value must be greater then 0");
		}
		containerTotalVolume = volume;
		currentVolume = volume;
	}

	public boolean getPortion(PortionSize portionSize) {
		int delta = currentVolume - portionSize.size();
		if (delta > -1) {
			currentVolume -= portionSize.size();
			return true;
		} else {
			return false;
		}
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public int getTotalVolume() {
		return containerTotalVolume;
	}

	public void refillContainer() {
		currentVolume = containerTotalVolume;
	}
}