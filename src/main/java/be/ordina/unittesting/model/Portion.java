package be.ordina.unittesting.model;

public class Portion {
    private final PortionType portionType;
    private final PortionSize portionSize;

    public Portion(PortionType portionType, PortionSize portionSize) {
        this.portionType = portionType;
        this.portionSize = portionSize;
    }

    public PortionType getPortionType() {
        return portionType;
    }

    public PortionSize getPortionSize() {
        return portionSize;
    }
}