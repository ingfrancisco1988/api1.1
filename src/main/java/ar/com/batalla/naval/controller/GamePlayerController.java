package ar.com.batalla.naval.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.batalla.naval.dto.GamePlayerDTO;
import ar.com.batalla.naval.model.GamePlayer;
import ar.com.batalla.naval.service.GamePlayerService;

@RequestMapping("/gameplayer")
@RestController
public class GamePlayerController {
	@Autowired
	private GamePlayerService gamePlayerService;
	
	 @GetMapping("/{id}")
	  public GamePlayer getGame(@PathVariable Long id){
	    return gamePlayerService.findById(id);
	  }
	  @PostMapping("/")
	public GamePlayer create(@RequestBody GamePlayerDTO gamePlayerDTO) {
			
			GamePlayer user = new GamePlayer();
			user.setGame(gamePlayerDTO.getGameId());
			user.setPlayer(gamePlayerDTO.getPlayerId());
			user.setJoinDate(gamePlayerDTO.getJoinDate());
			
			return gamePlayerService.save(user);
		}

}
