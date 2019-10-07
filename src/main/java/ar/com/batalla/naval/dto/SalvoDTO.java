package ar.com.batalla.naval.dto;

import java.util.List;

import ar.com.batalla.naval.model.GamePlayer;

public class SalvoDTO {
	private Long Id;
	private Integer turn;
	private GamePlayer gamePlayer;
	private List<String>locations;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Integer getTurn() {
		return turn;
	}
	public void setTurn(Integer turn) {
		this.turn = turn;
	}
	public GamePlayer getGamePlayer() {
		return gamePlayer;
	}
	public void setGamePlayer(GamePlayer gamePlayer) {
		this.gamePlayer = gamePlayer;
	}
	public List<String> getLocations() {
		return locations;
	}
	public void setLocations(List<String> locations) {
		this.locations = locations;
	}
	
	
	

}
