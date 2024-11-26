package conjunto.distribuida.entities;

public class Categoria {
	
	private int idCategoria;
	private String descripcion;
	
	// Constructores
			public Categoria () { }

			public Categoria(int idCategoria, String descripcion) {
				
				this.idCategoria = idCategoria;
				this.descripcion = descripcion;
			}

			
			// Metodos getters and setters
			public int getIdCategoria() {
				return idCategoria;
			}

			public void setIdCategoria(int idCategoria) {
				this.idCategoria = idCategoria;
			}

			public String getDescripcion() {
				return descripcion;
			}

			public void setDescripcion(String descripcion) {
				this.descripcion = descripcion;
			}

			
			
			// Metodos toString
			
			@Override
			public String toString() {
				return "Categoria [idCategoria=" + idCategoria + ", descripcion=" + descripcion + "]";
			}
			
			
			
			
			
			
			
			
	

}
