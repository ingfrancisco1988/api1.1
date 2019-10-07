package ar.com.batalla.naval.service;

import java.util.List;

import ar.com.batalla.naval.model.Salvo;

public interface SalvoService {
	
	public Salvo findById(Long id);
    public List<Salvo> findAll();
    public Salvo save(Salvo salvo);
    public Salvo deleteById();

}
