package ar.com.batalla.naval.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="player")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id", unique = true, nullable = false)
	private Long Id;
	private String email;
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "player")
	  private Set<GamePlayer> gamePlayer;
	
	public Player() {
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<GamePlayer> getGamePlayer() {
		return gamePlayer;
	}
	
	public void setGamePlayer(Set<GamePlayer> gamePlayer) {
		this.gamePlayer = gamePlayer;
	}
	
	
	
	

}
