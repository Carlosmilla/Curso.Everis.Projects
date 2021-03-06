package cl.everis.beca.prueba.interfaces;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.everis.beca.prueba.models.Pokemon;

@Repository
public interface IpokemonInterface extends JpaRepository<Pokemon, Long>{


	/**
	 * Metodo para buscar por tipo.
	 * @param tipo
	 * @return
	 */
	@Transactional
	List<Pokemon> findByTipo(String tipo);

	
}
