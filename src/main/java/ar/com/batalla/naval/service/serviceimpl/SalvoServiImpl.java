package ar.com.batalla.naval.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.batalla.naval.model.Salvo;
import ar.com.batalla.naval.repository.SalvoRepository;
import ar.com.batalla.naval.service.SalvoService;

@Service
public class SalvoServiImpl implements SalvoService{

	@Autowired
	private SalvoRepository salvoRepository;
	
	@Override
	public Salvo findById(Long id) {
		Salvo valor = salvoRepository.findById(id).get();
		return valor;
	}

	@Override
	public List<Salvo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Salvo save(Salvo salvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Salvo deleteById() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
