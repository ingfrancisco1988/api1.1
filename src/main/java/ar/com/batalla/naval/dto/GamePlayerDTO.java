package ar.com.batalla.naval.dto;

import java.util.Date;

import ar.com.batalla.naval.model.Game;
import ar.com.batalla.naval.model.Player;

public class GamePlayerDTO {
	private Long id;

	private Game gameId;

	private Player playerId;

	private Date joinDate;

	public GamePlayerDTO() {
		
	}

	public GamePlayerDTO(Long id, Game gameId, Player playerId, Date joinDate) {
		this.id = id;
		this.gameId = gameId;
		this.playerId = playerId;
		this.joinDate = joinDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Game getGameId() {
		return gameId;
	}

	public void setGameId(Game gameId) {
		this.gameId = gameId;
	}

	public Player getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Player playerId) {
		this.playerId = playerId;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	
	
	
	
}
