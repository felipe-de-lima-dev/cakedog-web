package br.com.cakedog.model;

public enum TipoUsuario {
	
	ADMINISTRADOR(0),
    CLIENTE(1);
    
    private int tipo;

	
	private TipoUsuario(int tipo) {
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	

}
