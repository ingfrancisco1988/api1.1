package ar.com.batalla.naval.service;

import ar.com.batalla.naval.model.Game;

import java.util.List;

public interface GameService {

    public Game findById(Long id);
    public List<Game> findAll();
    public Game save(Game game);
    public Game deleteById();
	

}
