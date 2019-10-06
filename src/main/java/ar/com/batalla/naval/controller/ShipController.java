package ar.com.batalla.naval.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.batalla.naval.dto.ShipDto;
import ar.com.batalla.naval.model.Ship;
import ar.com.batalla.naval.service.ShipService;

@RequestMapping("/ship")
@RestController
public class ShipController {
	@Autowired
    private ShipService shipService;
	
	@GetMapping("/")
    public List<Ship> findAll() {
        return shipService.findAll();

    }

    @GetMapping("/{id}")
    public Ship findShipById(@PathVariable("id") Long id) {
        //return shipService.findById(id).orElseThrow(()->new RuntimeException());
        return shipService.findById(id);
    }
   
    @PostMapping
	@RequestMapping(value = "/")
	public Ship create(@RequestBody ShipDto shipDTO) {
		System.out.println("entra");
		Ship user = new Ship();
		user.setGamePlayerbarcos(shipDTO.getGamePlayer());

		return shipService.save(user);
	}


}
