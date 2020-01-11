package br.com.cast.castApi.funcionario.model;

import java.io.Serializable;
import java.security.SecureRandom;
import java.time.LocalDate;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.cast.castApi.endereco.model.Endereco;
import br.com.cast.castApi.equipe.model.Equipe;
import br.com.cast.castApi.ferias.exception.NaoPodeTirarFeriasException;
import lombok.Data;

@Data
@Entity
public class Funcionario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SQ001_FUNCIONARIO")
	@SequenceGenerator(name = "SQ001_FUNCIONARIO", sequenceName = "SQ001_FUNCIONARIO", allocationSize = 1)
    @Column(name = "id", nullable = false, precision = 0)
	private Long id;

	private String nome;

	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private LocalDate dtNascimento;

	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private LocalDate dtContratacao;

	@ManyToOne
	//@JoinColumn(name="FK_EQUIPE")
	private Equipe equipe;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Endereco endereco;

	private String matricula;

	@Lob
	@Basic(fetch = FetchType.LAZY)
	@JsonIgnore
	private byte[] foto;
	
	
	@PrePersist
    public void prePersist() throws NaoPodeTirarFeriasException {
       
		StringBuilder sb = new StringBuilder(10);
		final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		SecureRandom rnd = new SecureRandom();
		for( int i = 0; i < 10; i++ ) 
		      sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
		   
		this.setMatricula(sb.toString());
		
    }
}
