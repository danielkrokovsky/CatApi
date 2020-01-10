package br.com.cast.castApi.ferias.exception;

public class NaoPodeTirarFeriasException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public NaoPodeTirarFeriasException(String msg) {
		super(msg);
	}
	
	public NaoPodeTirarFeriasException() {}
}
