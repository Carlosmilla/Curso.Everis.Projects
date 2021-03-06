package cl.everis.beca.prueba.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.everis.beca.prueba.interfaces.Ipokemon;
import cl.everis.beca.prueba.interfaces.IpokemonInterface;
import cl.everis.beca.prueba.models.Pokemon;

@Service
public class PokemonService implements Ipokemon{

	@Autowired
	private IpokemonInterface pokeData;
	
    /**
     * Metodo borrarPorId implementado de Ipokemon
     */
	@Override
	public void borrarPorId(Long id) {
		pokeData.deleteById(id); // uso de metodo de IpokemonInterface deleteById
	}	

	

	

}
