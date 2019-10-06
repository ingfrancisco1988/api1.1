package ar.com.batalla.naval.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Salvo {
	
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private int turn;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="game_player")
    private GamePlayer gamePlayer;
    
    @ElementCollection
    @Column(name="salvoes_locations")
    private List<String> locations;

    public Salvo() {}

    public Salvo(GamePlayer gamePlayer, int turn, List<String> locations){
        this.gamePlayer = gamePlayer;
        this.turn = turn;
        this.locations = locations;
    }

    public long getId() {
        return id;
    }

    public int getTurn() {
    	return turn;
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

    public int getNumberOfShots(){
        int number = locations.size();
        return number;
    }

}
