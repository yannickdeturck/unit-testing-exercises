package be.ordina.unittesting.mechanism;

import be.ordina.unittesting.model.Portion;
import be.ordina.unittesting.model.PortionSize;
import be.ordina.unittesting.mechanism.interfaces.Container;
import be.ordina.unittesting.model.PortionType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Here we have a ExpressoMachine with a coffee and water container.
 * Basically, if the machine has enough coffee (beans) and water, it can make coffee.
 */
// TODO Add the @RunWith annotation with the MockitoJUnitRunner.class to set the class up for Mockito usage
public class Exercise03SuperbCoffeeMachineTest {
    // TODO use the @Mock annotation to have Mockito create a mock instance
    private Container coffeeBeanContainer;

    // TODO also mock this
    private Container waterContainer;

    private SuperbCoffeeMachine machine;

    @Before
    public void setUp() {
        machine = new SuperbCoffeeMachine(coffeeBeanContainer, waterContainer);
    }

    @After
    public void tearDown() {
        // TODO we want to make sure that all mocks we use have all their calls verified
        // we can achieve this via Mockito.verifyNoMoreInteractions(mock1, mock2)
    }

    @Test
    public void given_insufficient_coffee_beans_make_coffee_should_return_no_coffee_portion() {
        // given
        // TODO Use Mockito.when to have the coffeeBeanContainer.getPortion return false


        // when
        // TODO invoke the makeCoffee method of the machine instance


        // then
        // TODO assert that the result from makeCoffee is an optional empty

        // TODO use Mockito.verify to verify the coffeeBeanContainer's getPortion invocation

    }

    @Test
    public void given_insufficient_water_make_coffee_should_return_no_coffee_portion() {
        // given
        // TODO Use Mockito.when to have the coffeeBeanContainer.getPortion return true
        // TODO Use Mockito.when to have the waterContainer.getPortion return false


        // when
        // TODO invoke the makeCoffee method of the machine instance


        // then
        // TODO assert that the result from makeCoffee is an optional empty

        // TODO use Mockito.verify to verify the coffeeBeanContainer's getPortion invocation
        // TODO use Mockito.verify to verify the waterContainer's getPortion invocation
    }

    @Test
    public void given_sufficient_coffee_beans_and_water_make_coffee_should_return_coffee_portion() {
        // given
        // TODO Use Mockito.when to have the coffeeBeanContainer.getPortion return true
        
        // TODO Use Mockito.when to have the waterContainer.getPortion return true


        // when
        // TODO invoke the makeCoffee method of the machine instance


        // then
        // TODO assert that the result from makeCoffee is not an optional empty

        // TODO assert that the result's portion type from makeCoffee is PortionType.COFFEE

        // TODO assert that the result's portion size from makeCoffee is PortionSize.SMALL


        // TODO use Mockito.verify to verify the coffeeBeanContainer's getPortion invocation

        // TODO use Mockito.verify to verify the waterContainer's getPortion invocation

    }
}
