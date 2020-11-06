package cl.everis.beca.controller;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.everis.beca.services.OperacionesService;

@RestController
@RequestMapping("/base")
public class RestControlador {

	@Autowired
	private OperacionesService ope;
	
	@GetMapping(value = "/suma", produces = "application/json")
	public ResponseEntity<Integer> suma(@RequestParam Integer numA, Integer numB) {
		return new ResponseEntity<Integer>(ope.suma(numA, numB), HttpStatus.OK);
	}
	
	@GetMapping(value = "/resta", produces = "application/json")
	public ResponseEntity<Integer> resta(@RequestParam Integer numA, Integer numB) {
		return new ResponseEntity<Integer>(ope.resta(numA, numB), HttpStatus.OK);
	}
	
	@GetMapping(value = "/multiplicacion", produces = "application/json")
	public ResponseEntity<Integer> multiplicacion(@RequestParam Integer numA, Integer numB) {
		return new ResponseEntity<Integer>(ope.multiplicacion(numA, numB), HttpStatus.OK);
	}
	
	@GetMapping(value = "/division", produces = "application/json")
	public ResponseEntity<Integer> division(@RequestParam Integer numA, Integer numB) {
		return new ResponseEntity<Integer>(ope.division(numA, numB), HttpStatus.OK);
	}
	
	@PostMapping(value = "/array", produces = "application/json")
	public ResponseEntity<String> array(@RequestParam String args) {
		return new ResponseEntity<String>(ope.lista(args), HttpStatus.OK);
	}
}
