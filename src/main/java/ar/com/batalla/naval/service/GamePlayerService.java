package ar.com.batalla.naval.service;


import ar.com.batalla.naval.model.GamePlayer;

public interface GamePlayerService {
	public GamePlayer findById(Long id);
    public void findAll();
    public GamePlayer save(GamePlayer gamePlayer);
    public GamePlayer deleteById();
}
