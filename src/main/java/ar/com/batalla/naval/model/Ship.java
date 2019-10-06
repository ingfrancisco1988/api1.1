package ar.com.batalla.naval.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Ship {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;
	
	@JsonIgnore
	@ManyToOne
	private GamePlayer gamePlayerbarcos;

	@ElementCollection
    @Column(name="ships_locations")
	List<String> shipLocation ;
	
	private ShipType type;
	
	
	// Getters and Setters

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public List<String> getShipLocation() {
		return shipLocation;
	}

	public void setShipLocation(List<String> shipLocation) {
		this.shipLocation = shipLocation;
	}

	public GamePlayer getGamePlayerbarcos() {
		return gamePlayerbarcos;
	}

	public void setGamePlayerbarcos(GamePlayer gamePlayerbarcos) {
		this.gamePlayerbarcos = gamePlayerbarcos;
	}

	public ShipType getType() {
		return type;
	}

	public void setType(ShipType type) {
		this.type = type;
	}
	 
}
