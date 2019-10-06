package ar.com.batalla.naval.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.batalla.naval.dto.PlayerDTO;
import ar.com.batalla.naval.model.Player;
import ar.com.batalla.naval.service.PlayerService;

@RequestMapping(path = "/api")
@RestController
public class PlayerController {
	@Autowired
	private  PlayerService playerService;

	@PostMapping
	@RequestMapping(value = "/")
	public Player create(@RequestBody PlayerDTO playerDTO) {
		System.out.println("entra");
		Player user = new Player();
		user.setEmail(playerDTO.getEmail());

		return playerService.save(user);
	}

}
