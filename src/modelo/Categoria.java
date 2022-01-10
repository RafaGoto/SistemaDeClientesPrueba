package modelo;

public class Categoria {
	private CategoriaEnum activo;
	private CategoriaEnum inactivo;
	
	public Categoria(CategoriaEnum activo, CategoriaEnum inactivo) {
		super();
		this.activo = activo;
		this.inactivo = inactivo;
	}

	public CategoriaEnum getActivo() {
		return activo;
	}

	public void setActivo(CategoriaEnum activo) {
		this.activo = activo;
	}

	public CategoriaEnum getInactivo() {
		return inactivo;
	}

	public void setInactivo(CategoriaEnum inactivo) {
		this.inactivo = inactivo;
	}
}
