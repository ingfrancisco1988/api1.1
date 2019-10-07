package ar.com.batalla.naval.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class GamePlayer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7555577210933243819L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gamePlayer_id", unique = true, nullable = false)
	private Long id;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="GAME_ID")
	private Game game;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="PLAYER_ID")
	private Player player;
	
	@OneToMany(mappedBy="gamePlayer", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Salvo> salvoes;
	
	@JsonIgnore
	private Date joinDate;

	@OneToMany(mappedBy="gamePlayerbarcos", fetch=FetchType.LAZY , cascade = CascadeType.ALL)
	private Set<Ship> ships ;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Game getGame() {
		return game;
	}

	@JsonIgnore
	public void setGame(Game game) {
		this.game = game;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Set<Ship> getShips() {
		return ships;
	}

	public void setShips(Set<Ship> ships) {
		this.ships = ships;
	}

	public Set<Salvo> getSalvoes() {
		return salvoes;
	}

	public void setSalvoes(Set<Salvo> salvoes) {
		this.salvoes = salvoes;
	}
	

	

}
