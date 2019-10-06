package ar.com.batalla.naval.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Game implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "game_id", unique = true, nullable = false)
  private Long id;

  private Date creationDate;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "game")
  private Set<GamePlayer> gamePlayer;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  
  public Set<GamePlayer> getGamePlayer() {
    return gamePlayer;
  }

  public void setGamePlayer(Set<GamePlayer> gamePlayer) {
    this.gamePlayer = gamePlayer;
  }
}
