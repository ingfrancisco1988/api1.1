package ar.com.batalla.naval.controller;

import ar.com.batalla.naval.dto.GameDto;
import ar.com.batalla.naval.dto.PlayerDTO;
import ar.com.batalla.naval.model.Game;
import ar.com.batalla.naval.model.Player;
import ar.com.batalla.naval.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/game")
@RestController
public class GameController {

  @Autowired
  private GameService gameService;

  @GetMapping("/{id}")
  public Game getGame(@PathVariable Long id){
    return gameService.findById(id);
  }
  @GetMapping("/")
  public List<Game> getGameList(){
     return gameService.findAll();
  }

  @PostMapping("/")
public Game create(@RequestBody GameDto gameDTO) {

		Game user = new Game();
		user.setCreationDate(gameDTO.getCreationDate());

		return gameService.save(user);
	}
  
  


}
