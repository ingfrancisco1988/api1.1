package ar.com.batalla.naval.dto;

import ar.com.batalla.naval.model.GamePlayer;

public class ShipDto {

	private Long id;
	private GamePlayer gamePlayer;
	
	
	
	public ShipDto() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public GamePlayer getGamePlayer() {
		return gamePlayer;
	}
	public void setGamePlayer(GamePlayer gamePlayer) {
		this.gamePlayer = gamePlayer;
	}
	
	
}
