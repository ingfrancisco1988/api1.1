package ar.com.batalla.naval.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.batalla.naval.model.GamePlayer;
import ar.com.batalla.naval.repository.GamePlayerRepository;
import ar.com.batalla.naval.service.GamePlayerService;

@Service
public class GamePlayerServiceImpl implements GamePlayerService{
	@Autowired
	private GamePlayerRepository gamePlayerRepository;

	@Override
	public GamePlayer findById(Long id) {
		GamePlayer gamePlayer = gamePlayerRepository.findById(id).orElseThrow(()-> new RuntimeException());
		return gamePlayer;
	}

	@Override
	public void findAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GamePlayer save(GamePlayer gamePlayer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GamePlayer deleteById() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
