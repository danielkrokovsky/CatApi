package br.com.cast.castApi.ferias.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.format.annotation.DateTimeFormat;

import br.com.cast.castApi.funcionario.model.Funcionario;
import lombok.Data;


@Entity
public class Ferias implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SQ005_FERIAS")
	@SequenceGenerator(name = "SQ005_FERIAS", sequenceName = "SQ005_FERIAS", allocationSize = 1)
    @Column(name = "id", nullable = false, precision = 0)
	private Long id;
	
	@ManyToOne
	private Funcionario funcionario;
	
	
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private LocalDate dtInicio;
	
	
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private LocalDate dtFim;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


	public LocalDate getDtInicio() {
		return dtInicio;
	}


	public void setDtInicio(LocalDate dtInicio) {
		this.dtInicio = dtInicio;
	}


	public LocalDate getDtFim() {
		return dtFim;
	}


	public void setDtFim(LocalDate dtFim) {
		this.dtFim = dtFim;
	}
	
	/*
	@PrePersist
    public void prePersist() throws NaoPodeTirarFeriasException {
        
		Ferias f = this;
		
		if(ChronoUnit.YEARS.between(f.funcionario.getDtContratacao(), LocalDate.now()) < 1) {
			throw new  NaoPodeTirarFeriasException();
		}
		
    }*/
	
	

}
