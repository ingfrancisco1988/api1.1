package ar.com.batalla.naval.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Score {
	
	 @Id
	    @GeneratedValue(strategy= GenerationType.AUTO)
	    private Long id;

	    private Integer score;
	    
	    @JsonIgnore
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="player_id")
	    private Player player;
	    
	    
	    @JsonIgnore
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="game_id")
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
