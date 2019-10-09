package ar.com.batalla.naval.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.batalla.naval.dto.SalvoDTO;
import ar.com.batalla.naval.dto.ScoreDTO;
import ar.com.batalla.naval.model.Salvo;
import ar.com.batalla.naval.model.Score;
import ar.com.batalla.naval.service.ScoreService;


@RequestMapping(path = "/")
@RestController
public class ScoreController {
	
	@Autowired
	private ScoreService scoreService;
	
	@GetMapping("score")
    public List<Score> findAll() {
        return scoreService.findAll();

    }

    @GetMapping("player/{id}/score")
    public Score findShipById(@PathVariable("id") Long id) {
        //return shipService.findById(id).orElseThrow(()->new RuntimeException());
        return scoreService.findById(id);
    }
    
    @PostMapping
	@RequestMapping(value = "/")
	public Score create(@RequestBody ScoreDTO scoreDTO) {
		System.out.println("entra");
		Score user = new Score();
    //user.setGamePlayerbarcos(shipDTO.getGamePlayer());

		//return salvoService.save(user);
		return  null;
	}

}
