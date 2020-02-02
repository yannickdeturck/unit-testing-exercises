package be.ordina.unittesting.mechanism.interfaces;


import be.ordina.unittesting.model.Portion;
import be.ordina.unittesting.model.PortionSize;

import java.util.Optional;

public interface CoffeeMachine {
	Optional<Portion> makeCoffee(PortionSize portionSize);
	Container getCoffeeContainer();
	Container getWaterContainer();
}
