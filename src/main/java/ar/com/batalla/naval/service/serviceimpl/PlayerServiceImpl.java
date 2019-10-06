package ar.com.batalla.naval.service.serviceimpl;

import ar.com.batalla.naval.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.batalla.naval.model.Player;
import ar.com.batalla.naval.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public Player save(Player player) {
		// TODO Auto-generated method stub
		return playerRepository.save(player);
	}
	

}
