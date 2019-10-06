package ar.com.batalla.naval.service;


import java.util.List;

import ar.com.batalla.naval.model.Ship;

public interface ShipService {
	
	public Ship findById(Long id);
    public List<Ship> findAll();
    public Ship save(Ship ship);
    public Ship deleteById();

}
