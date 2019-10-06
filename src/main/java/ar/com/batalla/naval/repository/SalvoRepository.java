package ar.com.batalla.naval.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.batalla.naval.model.Salvo;

public interface SalvoRepository extends JpaRepository<Salvo,Long>{
	
Salvo findById(long id);

}
