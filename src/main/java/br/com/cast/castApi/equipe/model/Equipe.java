package br.com.cast.castApi.equipe.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.cast.castApi.funcionario.model.Funcionario;
import lombok.Data;

@Data
@Entity
public class Equipe implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id

	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SQ003_EQUIPE")
	@SequenceGenerator(name = "SQ003_EQUIPE", sequenceName = "SQ003_EQUIPE", allocationSize = 1)
    @Column(name = "id", nullable = false, precision = 0)
	private Long id;
	
	private String nome;
	
	@OneToMany(mappedBy = "equipe")
	//@JoinColumn(name="FK_EQUIPE")
	@JsonIgnore
	private List<Funcionario> funcionario;
	
	
}
