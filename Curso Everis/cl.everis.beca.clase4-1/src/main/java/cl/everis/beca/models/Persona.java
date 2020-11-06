package cl.everis.beca.models;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.sound.midi.Sequence;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Personas")
public class Persona {

	
	protected static final String PERSONA_SEQ = "persona_seq";

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = PERSONA_SEQ)
	@SequenceGenerator(sequenceName = PERSONA_SEQ, allocationSize = 1, name = "PERSONA_SEQ")
	private Long id;
	private String sNombre;
	private int edad;
	private String rut;
	
	public Persona() {
		
	}
}
