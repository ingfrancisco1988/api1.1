package ar.com.batalla.naval.model;

public enum ShipType {

	CARRIER(5), BATTLESHIP(4), SUBMARINE(3), DESTROYER(3), PATROLBOAT(2);

	private int length;

	private ShipType(int length){
		this.length = length;
	}

	public int getLength() {
		return length;
	}
}
