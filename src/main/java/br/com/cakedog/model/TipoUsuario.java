package br.com.cakedog.model;

public enum TipoUsuario {
	
	ADMINISTRADOR(1),
    CLIENTE(0);
    
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
