package ar.com.batalla.naval.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.batalla.naval.model.Ship;
import ar.com.batalla.naval.repository.ShipRespository;
import ar.com.batalla.naval.service.ShipService;
@Service
public class ShipServiceImpl implements ShipService {
	
@Autowired
private ShipRespository shipRepository;

	@Override
	public Ship findById(Long id) {
		Ship valor = shipRepository.findById(id).get();
		return valor;
	}

	@Override
	public List<Ship> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ship save(Ship ship) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ship deleteById() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
