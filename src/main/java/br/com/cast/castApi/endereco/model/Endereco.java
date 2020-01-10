package br.com.cast.castApi.endereco.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Endereco implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SQ004_ENDERECO")
	@SequenceGenerator(name = "SQ004_ENDERECO", sequenceName = "SQ004_ENDERECO", allocationSize = 1)
    @Column(name = "id", nullable = false, precision = 0)
	private Long id;
	
	@NotNull(message = "Campo rua não pode se vazio")
	private String rua;
	
	private String numero;
	
	private String complemento;
	
	@NotNull(message = "Campo bairro não pode se vazio")
	private String bairro;
	
	@NotNull(message = "Campo cidade não pode se vazio")
	private String cidade;
	
	@NotNull(message = "Campo estado não pode se vazio")
	private String estado;
}
