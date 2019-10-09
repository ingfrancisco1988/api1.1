package ar.com.batalla.naval.dto;

import java.util.Date;

import ar.com.batalla.naval.model.Game;
import ar.com.batalla.naval.model.Player;

public class ScoreDTO {

	private Long id;
	private Integer score;
	private Player player;
	private Game game;
	private Date finishDate;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Date getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}





}
