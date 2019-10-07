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
import ar.com.batalla.naval.model.Salvo;
import ar.com.batalla.naval.service.SalvoService;

@RequestMapping(path = "/salvo")
@RestController
public class SalvoController {
	
	@Autowired
    private SalvoService salvoService;
	
	@GetMapping("/")
    public List<Salvo> findAll() {
        return salvoService.findAll();

    }

    @GetMapping("/{id}")
    public Salvo findShipById(@PathVariable("id") Long id) {
        //return shipService.findById(id).orElseThrow(()->new RuntimeException());
        return salvoService.findById(id);
    }
   
    @PostMapping
	@RequestMapping(value = "/")
	public Salvo create(@RequestBody SalvoDTO salvoDTO) {
		System.out.println("entra");
		Salvo user = new Salvo();
    //user.setGamePlayerbarcos(shipDTO.getGamePlayer());

		//return salvoService.save(user);
		return  null;
	}

}
