package be.ordina.unittesting.mechanism;


import be.ordina.unittesting.model.Portion;
import be.ordina.unittesting.model.PortionSize;
import be.ordina.unittesting.mechanism.interfaces.CoffeeMachine;
import be.ordina.unittesting.mechanism.interfaces.Container;
import be.ordina.unittesting.model.PortionType;

import java.util.Optional;

public class SuperbCoffeeMachine implements CoffeeMachine {
	private Container coffeeContainer;
	private Container waterContainer;

	public SuperbCoffeeMachine(Container coffeeContainer, Container waterContainer) {
		this.coffeeContainer = coffeeContainer;
		this.waterContainer = waterContainer;
	}

	public Optional<Portion> makeCoffee(PortionSize portionSize) {
		Optional<Portion> coffeePortion = Optional.empty();
		if (getCoffeeContainer().getPortion(portionSize)
				&& getWaterContainer().getPortion(portionSize)) {
			coffeePortion = Optional.of(new Portion(PortionType.COFFEE, portionSize));
		}
		return coffeePortion;
	}

	public Container getWaterContainer() {
		return waterContainer;
	}

	public Container getCoffeeContainer() {
		return coffeeContainer;
	}
}