package br.com.cast.castApi.signin.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class Signin  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SQ002_SIGNIN")
	@SequenceGenerator(name = "SQ002_SIGNIN", sequenceName = "SQ002_SIGNIN", allocationSize = 1)
    @Column(name = "id", nullable = false, precision = 0)
	private Long id;
	
	private String email;
	
	private String password;

}
