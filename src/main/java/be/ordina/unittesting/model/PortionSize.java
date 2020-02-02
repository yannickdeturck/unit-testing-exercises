package be.ordina.unittesting.model;

public enum PortionSize {
	SMALL(1), MEDIUM(2), LARGE(3);
	
	private int size;
	
	PortionSize(int size) {
		this.size = size;
	}
	
	public int size() {
		return size;
	}
}